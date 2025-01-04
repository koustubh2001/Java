package Basic;

public class MissingNoArray {
 public static void main(String[] args) {
    int arr[]={1,2,3,5,6,8};
    int sum=0;
    for(int i=0;i<=arr.length-1;i++)
    {
        sum=sum+arr[i];
}
    int n=arr.length+1;
    int sum1=n*(n+1)/2;
    System.out.println(sum1-sum);
 }    
}

// public class MissingNoArray{
// public static void findMissingNumbers(int[] arr, int n) {
//     boolean[] present = new boolean[n + 1];
//     for (int i : arr) {
//         present[i] = true;
//     }
//     System.out.print("Missing numbers: ");
//     for (int i = 1; i <= n; i++) {
//         if (!present[i]) {
//             System.out.print(i + " ");
//         }
//     }
//     System.out.println();
// }

// public static void main(String[] args) {
//     int arr[] = {1, 2, 3, 5, 6, 8};
//     int n = 8;  
//     findMissingNumbers(arr, n);
// }}
    

    
