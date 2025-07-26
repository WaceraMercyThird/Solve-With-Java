public class BinaryToDecimal {

    public static void main(String[] arg){
        String binary = "11001010101110101010101010101010";
        long number = Long.parseLong(binary, 2);

        System.out.println("Binary: " + binary);
        System.out.println("Decimal: " + number);
    }
    
}
