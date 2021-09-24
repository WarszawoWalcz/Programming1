package nl.ru.ai.sleezyslimeballs.exercise3;

import java.util.Scanner;

public class WordPalindrome {
    public static void main(String[] args) {
        userInput();
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the word: ");
        String word = scanner.nextLine();
        checkEquality(word);
    }

    private static void checkEquality(String word) {
        boolean palindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                palindrome = false;
            }
        }
        if (palindrome) {
            System.out.println("This word is palindrome.");
        } else {
            System.out.println("This word is not a palindrome.");
        }
    }
}
