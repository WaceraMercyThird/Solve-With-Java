public class NumberToWordsSimple {
    public static String ConvertDigitsToWords(int number) {
        String[] words = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        StringBuilder result = new StringBuilder();

        String numStr = String.valueOf(number);
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            result.append(words[digit]).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        int number = 908;
        String numberInWords = ConvertDigitsToWords(number);
        System.out.println("Number: " + number);
        System.out.println("In Words: " + numberInWords);
    }
}
