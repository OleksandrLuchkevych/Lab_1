package Lab1.Task2;

public class Sort {
    public static void main(String[] args) {
        final String[] words = {"Hello", "Hi Dear User", "Chat Gpt", "eeEEEE"};

        SortByUpperCaseLetter(words);

        for (final String string : words) {
            System.out.println(string);
        }
    }
    private static void SortByUpperCaseLetter(String[] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (countUpperCaseLetters(array[i]) > countUpperCaseLetters(array[j])) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private static int countUpperCaseLetters(final String word) {
        int countOfUpperCaseLetter = 0;
        for (int j = 0; j < word.length(); j++) {
            char letter = word.charAt(j);
            if (Character.isUpperCase(letter)) {
                countOfUpperCaseLetter++;
            }
        }
        return countOfUpperCaseLetter;
    }
}
