package Basic;

import java.util.Arrays;

public class MergeSortArray {
    public static void main(String[] args) {
       int []arr1={1,3,5};
       int []arr2={2,4,6};
       int index=0;
       int [] mergeArray=new int[arr1.length+arr2.length];
       for(int num :arr1)
       {
       
        mergeArray[index++]=num;
       }
       for(int num : arr2)
       {
        mergeArray[index++]=num;
       }
       Arrays.sort(mergeArray);
       System.out.println(Arrays.toString(mergeArray));
         
        
    }
    
}
