public class StringBuilderReversed{
    public static void main(String[] arg){
        String word = "Hello";
        StringBuilder sb = new StringBuilder(word);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);


    }

}