public class ExerciseOne {
    
    public static int isReversed(String string1, String string2) {
        String cleanedString1 = string1.replaceAll("\\s+", "").toLowerCase();
        String cleanedString2 = string2.replaceAll("\\s+", "").toLowerCase();

        if (cleanedString1.length() != cleanedString2.length()) {
            return 0;
        }

        for (int i = 0; i < cleanedString1.length(); i++) {
            if (cleanedString1.charAt(i) != cleanedString2.charAt(cleanedString1.length() - i - 1)) {
                return 0;
            } 
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isReversed("google", "elgoog"));
        System.out.println(isReversed("data", "ata"));
    }
}
