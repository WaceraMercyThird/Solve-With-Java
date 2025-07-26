import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {
    public static void main(String[] arg){
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60};
        int[] arr3 = {70, 80, 90};

        IntStream stream1and2 = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2));

        int[] merged = IntStream.concat(stream1and2, Arrays.stream(arr3)).toArray();

         System.out.println(Arrays.toString(merged));
    }
}
