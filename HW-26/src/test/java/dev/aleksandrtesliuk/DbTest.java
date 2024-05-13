package dev.aleksandrtesliuk;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static dev.aleksandrtesliuk.JdbcConnector.sendQueryToLocalEnv;

public class DbTest {

    @Test
    public void testGetAllActors() {
        String query = "SELECT * FROM actor";
        List<Map<String, Object>> result = sendQueryToLocalEnv(query);
        printResult("All Actors", result);
    }

    @Test
    public void testGetSpecificActorFilmDescription() {
        String query = "SELECT a.actor_id, a.first_name, a.last_name, f.film_id, f.title, f.description " +
                "FROM actor a " +
                "JOIN film_actor fa ON a.actor_id = fa.actor_id " +
                "JOIN film f ON fa.film_id = f.film_id " +
                "WHERE a.actor_id = 3 AND f.film_id = 17";
        List<Map<String, Object>> result = sendQueryToLocalEnv(query);
        printResult("Specific Actor and Film Description", result);
    }

    @Test
    public void testGetFilmCountPerActor() {
        String query = "SELECT a.actor_id, a.first_name, a.last_name, COUNT(fa.film_id) AS film_count " +
                "FROM actor a " +
                "JOIN film_actor fa ON a.actor_id = fa.actor_id " +
                "GROUP BY a.actor_id, a.first_name, a.last_name";
        List<Map<String, Object>> result = sendQueryToLocalEnv(query);
        printResult("Film Count Per Actor", result);
    }

    @Test
    public void testGetActorsWithMoreThanOneFilm() {
        String query = "SELECT a.actor_id, a.first_name, a.last_name, COUNT(fa.film_id) AS film_count " +
                "FROM actor a " +
                "JOIN film_actor fa ON a.actor_id = fa.actor_id " +
                "GROUP BY a.actor_id, a.first_name, a.last_name " +
                "HAVING COUNT(fa.film_id) > 1";
        List<Map<String, Object>> result = sendQueryToLocalEnv(query);
        printResult("Actors with More Than One Film", result);
    }

    private void printResult(String title, List<Map<String, Object>> result) {
        System.out.println("=== " + title + " ===");
        for (Map<String, Object> row : result) {
            System.out.println(row);
        }
    }
}

