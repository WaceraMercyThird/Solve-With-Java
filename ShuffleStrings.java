import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleStrings {
    public static void main(String[] arg){
        String[] words = {"apple", "banana", "cherry", "date", "fig"};

        List<String> wordList = Arrays.asList(words);

        Collections.shuffle(wordList);

        String[] shuffled = wordList.toArray(new String[0]);

        System.out.println(Arrays.toString(shuffled));

    }
    
}
