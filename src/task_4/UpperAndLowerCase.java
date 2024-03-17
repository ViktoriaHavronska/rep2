package src.task_4;

public class UpperAndLowerCase {

        public static String toUpperCase(String word) {
            return word.toUpperCase();
        }
        public static String toLowerCase(String word) {
            return word.toLowerCase();
        }
        public static void main(String[] args) {
            String word = "Good luck";
            System.out.println("Original word: " + word);

            String upperCaseWord = toUpperCase(word);
            System.out.println("Word in upper case: " + upperCaseWord);

            String lowerCaseWord = toLowerCase(word);
            System.out.println("Word in lower case: " + lowerCaseWord);
        }
}

