
package Basic;

import java.util.HashMap;
import java.util.Map;
 


public class OccurrenceWord {
    public static void main(String[] args) {
        
        
        String sentence = "the quick brown fox jumps over the lazy fox";
        String word = "fox"; 
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }  } 
        System.out.println(count + " times ");
    }
}
