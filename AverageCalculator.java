public class AverageCalculator {
    public static double findAverage(int[] arr) {
    if (arr.length == 0) return 0;

    int sum = 0;
    for (int num: arr) {
        sum += num;

    }
    return (double) sum / arr.length;
    
} 

public static void main(String[] args){
    int[] numbers = {10,2,4,2,4};
    double average = findAverage(numbers);
    System.out.println("average: " + average);
}
}   
