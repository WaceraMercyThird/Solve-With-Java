public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 10; // Change this to any number you want the table for

        for (int i = 1; i <= 20; i++) {
            int num = number * i;
            System.out.println(number + " x " + i + " = " + num);
        }
    }
}

