import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String word, int start, int end) {
        if (start >= end) {
            return true;
        } 
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }        
        return isPalindrome(word, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter the word that you want to check, whether if it is a palindrome or not: ");
        String inputtedWord = scnr.nextLine();
        boolean palindrome = isPalindrome(inputtedWord, 0, inputtedWord.length() - 1);

        if (palindrome == true) {
            System.out.println("This word is a palindrome.");
        } else {
            System.out.println("This word is not a palindrome.");
        }

        scnr.close();
    }
}