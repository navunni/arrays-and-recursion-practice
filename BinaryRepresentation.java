import java.util.Scanner;

public class BinaryRepresentation {
    public static int countOfZeroes(int n) {
        if (n == 0) { 
            return 1; // base case
        }

        int count = 0;

        if (n / 2 == 0) {
            return count;
        }

        if (n % 2 == 0) {
            count += 1; // Count should increase by one, if the last bit is zero).
        } 

        return count + countOfZeroes(n/2);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        System.out.println("Please type in a number: ");
        
        int userInput = scnr.nextInt();

        System.out.println("Number of Zeroes in Binary: " + countOfZeroes(userInput));

        scnr.close();
    }
}