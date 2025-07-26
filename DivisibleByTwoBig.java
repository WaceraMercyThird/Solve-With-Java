public class DivisibleByTwoBig {
    public static void main(String[] args) {
        String number = "12345678";

        char lastDigit = number.charAt(number.length() - 1);
        if (lastDigit == '0' || lastDigit == '2' || lastDigit == '4' || lastDigit == '6' || lastDigit == '8') {
            System.out.println(number + " is divisible by 2");
        } else {
            System.out.println(number + " is not divisible by 2");
        }
    }
}
