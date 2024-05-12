package dev.aleksandrtesliuk;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // a - Create a list of 10 objects of type User
        List<User> users = Arrays.asList(
                new User("John", "Smith", 25),
                new User("Alice", "Johnson", 30),
                new User("Bob", "Brown", 20),
                new User("Charlie", "Davis", 35),
                new User("Eve", "Adams", 28),
                new User("Grace", "Anderson", 40),
                new User("Hank", "Scott", 18),
                new User("Ivy", "Williams", 17),
                new User("Jack", "Miller", 19),
                new User("Karen", "Taylor", 45)
        );
        System.out.println("Initial list of users:");
        users.forEach(System.out::println);

        // b - Sort by age and add to a new collection
        List<User> sortedByAge = UserMethods.sortUsersByAge(users);
        System.out.println("\nSorted by age:");
        sortedByAge.forEach(System.out::println);

        // c - Calculate the average age of users
        double averageAge = UserMethods.calculateAverageAge(users);
        System.out.println("\nAverage age of users: " + averageAge);

        // d - Sort by several parameters: firstName and age
        List<User> sortedByFirstNameAndAge = UserMethods.sortUsersByFirstNameAndAge(users);
        System.out.println("\nSorted by name and age:");
        sortedByFirstNameAndAge.forEach(System.out::println);

        // e - Check if there are users whose last name begins with the letter "S" or "A"
        boolean hasSpecificLastNames = UserMethods.checkUsersWithSpecificLastNames(users);
        System.out.println("\nAre there any users with last names starting with 'S' or 'A': " + hasSpecificLastNames);

        // f - Check if all users are over 18 years old
        boolean allOlderThan18 = UserMethods.checkAllUsersOlderThan18(users);
        System.out.println("\nAre all users over 18 years old?: " + allOlderThan18);
    }
}
