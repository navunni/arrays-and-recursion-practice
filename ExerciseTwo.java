import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ExerciseTwo {
    public static String returnString(String string) {

        if (string.isEmpty()) {
            return " ";
        }

        String[] sentence = string.split(" ");

        List<String> shortestWords = new ArrayList<>();
        
        for (int i = 0; i < sentence.length; i+=3) {
            String firstWord = sentence[i];
            String secondWord = "";
            String thirdWord = "";

            if (i + 1 < sentence.length) {
                secondWord = sentence[i + 1];
            }

            if (i + 2 < sentence.length) {
                thirdWord = sentence[i + 2];
            }

            String shortestWord = firstWord;

            if (!secondWord.isEmpty() && secondWord.length() < shortestWord.length()) {
                shortestWord = secondWord;
            }

            if (!thirdWord.isEmpty() && thirdWord.length() < shortestWord.length()) {
                shortestWord = thirdWord;
            }
            shortestWords.add(shortestWord);
        }

        String finalSentence = "";
        for (int i = 0; i < shortestWords.size(); i++) {
            finalSentence += shortestWords.get(i);

            if (i < shortestWords.size() - 1) {
                finalSentence += " ";
            }
        }

        return finalSentence;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter the sentence: ");
        String sentence = scnr.nextLine();

        System.out.println("Shortest words are: " + returnString(sentence));
        scnr.close();
    }
}