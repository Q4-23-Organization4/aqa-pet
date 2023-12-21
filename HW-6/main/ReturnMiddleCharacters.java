public class ReturnMiddleCharacters {
    public static void main(String[] args) {
        /*
         * Strings 'Hometasks' and 'Triangles' are added to Show what the console output
         * will look like if there is an odd string.
         */
        String[] words = {"Hillel", "Java", "Hometask", "Hometasks", "Triangles"};

        for (String word : words) {
            if (word.length() % 2 == 0) {
                int middle = word.length() / 2;
                String middleCharacters = word.substring(middle - 1, middle + 1);
                System.out.println("For string \"" + word + "\" result is: \"" + middleCharacters + "\"");
            } else {
                System.out.println("String \"" + word + "\" does not have an even length.");
            }
        }
    }
}
