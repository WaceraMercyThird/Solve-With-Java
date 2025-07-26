public class CountDigit {
    public static void main(String[] args) {
        int num = 987543;
        String numStr = Integer.toString(num);
        int count = numStr.length();

        System.out.println("Number of digits: "+ count);
    }
}
