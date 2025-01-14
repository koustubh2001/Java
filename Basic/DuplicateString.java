package Basic;

import java.util.HashSet;
import java.util.Set;

public class DuplicateString {
    public static void main(String[] args) {
        String[] name= {"apple", "banana", "apple", "orange", "banana", "grape"};
        Set<String> uniqueStrings = new HashSet<>();

        for (String str : name) {
            uniqueStrings.add(str);
        }

        System.out.println("After Remove Duplicate Strings : " + uniqueStrings);

 
    }
    
}
