import java.util.Scanner;

public class BinaryArrayMax {
    public static int ArrayMax(int[] arr, int low, int high) {     
        if (low == high) {
            return arr[low]; // base case (returns the same value)
        }

        int mid = (low + high) / 2 ;
        
        int max1 = ArrayMax(arr, low, mid);
        int max2 = ArrayMax(arr, mid + 1, high);

        if (max1 >= max2) {
            return max1;
        } else {
            return max2;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please type in a list of numbers seperated by spaces: ");
        String[] input = scnr.nextLine().split("\\s+");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        System.out.println("The maximum number in this list of numbers is: " + ArrayMax(numbers, 0, numbers.length - 1));

        scnr.close();
    }
}