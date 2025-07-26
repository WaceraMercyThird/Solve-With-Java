public class DivibleChecker {
    public static boolean isDivisibleBy6(String number) {
        int sum  = 0;
        char lastDigit = number.charAt(number.length() -1);

        for (int i = 0; i < number.length(); i++){
            sum+= number.charAt(i) - '0';

        }

        boolean divisibleBy2 = (lastDigit - '0') % 2 == 0;
        boolean divisibleBy3 = (sum % 3 == 0);

        return divisibleBy2 && divisibleBy3;
    }


    public static void main(String[] arg) {
        String num = "123456789123456789123456"; 

        if (isDivisibleBy6(num)) {
            System.out.println(num + " is divible by 6.");
        } else {
            System.out.println(num + " is NOT divisible by 6.");
        }
    }
}
