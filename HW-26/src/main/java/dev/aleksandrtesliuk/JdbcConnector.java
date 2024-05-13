package dev.aleksandrtesliuk;

import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcConnector {

    private static final List<Map<String, Object>> resultAsList = new ArrayList<>();

    @SneakyThrows
    public static List<Map<String, Object>> sendQueryToLocalEnv(String query) {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "postgres";
        return sendQuery(query, url, user, password);
    }

    private static List<Map<String, Object>> sendQuery(String query, String url, String user, String password) {
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            ResultSetMetaData rsMetaData = resultSet.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            while (resultSet.next()) {
                Map<String, Object> tableRow = new HashMap<>(columnCount);
                for (int i = 1; i <= columnCount; i++) {
                    tableRow.put(rsMetaData.getColumnName(i), resultSet.getObject(i));
                }
                resultAsList.add(tableRow);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultAsList;
    }
}
