package dev.aleksandrtesliuk;

import java.util.*;
import java.util.stream.Collectors;

public class UserMethods {

    // Method for sorting by age
    public static List<User> sortUsersByAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    // Method for calculating average age
    public static double calculateAverageAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0);
    }

    // Method to sort by name and age
    public static List<User> sortUsersByFirstNameAndAge(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getFirstName)
                        .thenComparingInt(User::getAge))
                .collect(Collectors.toList());
    }

    // Method for checking last names starting with "S" or "A"
    public static boolean checkUsersWithSpecificLastNames(List<User> users) {
        return users.stream()
                .anyMatch(user -> user.getSecondName().startsWith("S") || user.getSecondName().startsWith("A"));
    }

    // Method for checking age over 18 years
    public static boolean checkAllUsersOlderThan18(List<User> users) {
        return users.stream()
                .allMatch(user -> user.getAge() > 18);
    }
}
