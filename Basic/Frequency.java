package Basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
//         Count the frequency of each element in an array.
 
        int [] arr={1,1,2,3,3,3};
       
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        Arrays.stream(arr).forEach(num -> frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1));
        
        System.out.println(frequencyMap);

        /////////////////////
    

        // int [] arr={1,1,2,3,3,3};
 
        // Map<Integer, Integer> frequencyMap = new HashMap<>(); 
        // for (int num : arr) {
        //     frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        // }
        // System.out.println(frequencyMap);
    



    }
    
}
