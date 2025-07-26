public class CHarReversed{
   
    public static void main(String[] arg){
        String words ="Bananas For Me";
        String Reversed = " ";

        for (int i = words.length()-1; i>=0; i--){
            Reversed += words.charAt(i);

        }
        System.out.println(Reversed);
    }
    
}
