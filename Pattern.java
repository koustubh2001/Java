public class Pattern {
    public static void main(String[] args) {
//  Rotate an array to the right by k positions.
//  For the array [1, 2, 3, 4, 5] and k=2, the output should be [4, 5, 1, 2, 3].
        //   int [] arr={1,2,3,4,5};
        //   int k=2;
        //   for(int i=0;i<k;i++){
        //       int j,last;
        //       last=arr[arr.length-1];
        //       for(j=arr.length-1;j>0;j--){
        //           arr[j]=arr[j-1];
        //       }
        //       arr[0]=last;
        //   }
        //   System.out.println(arr);
    int[] arr = {1, 2, 3, 4, 5};
    int k = 2;
    k = k % arr.length; // In case k is greater than array length
    reverse(arr, 0, arr.length - 1);
    reverse(arr, 0, k - 1);
    reverse(arr, k, arr.length - 1);
    for (int num : arr) {
        System.out.print(num + " ");
    }
    }

    public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }

    }
    
}
