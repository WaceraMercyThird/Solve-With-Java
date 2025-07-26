public class AverageOfArray {
    public static void main(String[] arg){
        int[] numbers = {10, 20, 40};
        int sum = 0;

        for(int num : numbers){
            sum +=num;
        }

        double average = (double) sum/numbers.length;

        System.out.println(average);
    }
    
}
