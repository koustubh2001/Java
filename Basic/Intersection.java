package Basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
//   Find the intersection of two arrays.
//  Example: For the arrays [1, 2, 3] and [2, 3, 4], the output should be [2, 3]

int [] arr1={1,2,3};
int [] arr2={2,3,4};
 Set<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        Set<Integer> intersection = new HashSet<>();
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            } } 
        System.out.println(intersection);
        

        ///////////////////////////////////////////////////////////




    //     int[] array1 = {1, 2, 3};
    //     int[] array2 = {2, 3, 4};
        
    //     int[] intersection = findIntersection(array1, array2);
        
    //     System.out.print("[");
    //     for (int i = 0; i < intersection.length; i++) {
    //         System.out.print(intersection[i]);
    //         if (i < intersection.length - 1) {
    //             System.out.print(", ");
    //         }
    //     }
    //     System.out.println("]");
    // }
    
    // public static int[] findIntersection(int[] array1, int[] array2) {
    //     int[] temp = new int[Math.min(array1.length, array2.length)];
    //     int index = 0;
        
    //     for (int i = 0; i < array1.length; i++) {
    //         for (int j = 0; j < array2.length; j++) {
    //             if (array1[i] == array2[j]) {
    //                 boolean alreadyExists = false;
    //                 for (int k = 0; k < index; k++) {
    //                     if (temp[k] == array1[i]) {
    //                         alreadyExists = true;
    //                         break;
    //                     }  }
    //                 if (!alreadyExists) {
    //                     temp[index++] = array1[i];
    //                 } }  }   } 
    //     int[] result = new int[index];
    //     System.arraycopy(temp, 0, result, 0, index);
    //     return result;
    } 
}
