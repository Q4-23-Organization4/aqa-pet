public class PalindromChecker {
    public static void main(String[] args) {
        String[] testStrings = {"Шалаш", "піп", "зараз", "розробка", "келих"};

        for (String s : testStrings) {
            System.out.println(s + " - " + (isPalindrome(s) ? "паліндром" : "не паліндром"));
        }
    }

    public static boolean isPalindrome(String str) {
        char[] charArray = str.toLowerCase().toCharArray();

        int i = 0;
        int b = charArray.length - 1;

        while (i < b) {

            while (i < b && !Character.isLetter(charArray[i])) {
                i++;
            }
            while (i < b && !Character.isLetter(charArray[b])) {
                b--;
            }

            if (charArray[i] != charArray[b]) {
                return false;
            }

            i++;
            b--;
        }
        return true;
    }
}
