package Basic;

public class RemoveDuplicate {
    public static int RemoveDuplicate(int arr[], int n){
    if (n==0 || n==1)
    {
        return n;
    }
    int[] temp = new int[n];
    int j = 0;
    for (int i=0; i<n-1; i++)
    { 
        if (arr[i] != arr[i+1])
        {
            temp[j++] = arr[i];
        }
     }
    temp[j++] = arr[n-1];  
    for (int i=0; i<j; i++)
    {
        arr[i] = temp[i];
    }
    return j;
    }
    public static void main (String[] args) {
    int arr[] = {1,2,2,3,4,4,5,6,7};
    int length = arr.length;
    length = RemoveDuplicate(arr, length);
    for (int i=0; i<length; i++){
       System.out.print(arr[i]+" ");
    }
    }}



// import java.util.*;
// class Main {
//     	public static List<Integer> removeDuplicates(List<Integer> inputList) {
//        	 List<Integer> result = new ArrayList<>();
//       	  for (int num : inputList) {
//             if (!result.contains(num)) {
//                 result.add(num);
//             }}
//         return result;
//  	   } 
//         public static void main(String[] args) {
//         List<Integer> inputList = Arrays.asList(1,2,2,3,4,4,5,6,6,7);
//         List<Integer> result = removeDuplicates(inputList);
//         System.out.println(result);
//        }}
    






















