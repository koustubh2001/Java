package Basic;
public class SecondLargest {    public static void main(String[] args) {
        int[] nums = {24,21,46,32,44};
        
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
    if (nums == null || nums.length < 2) {
      
    } 
    for (int num : nums) 
    {
        if (num > firstLargest)     
        {
            secondLargest = firstLargest;
            firstLargest = num;
        } 
        else if (num > secondLargest && num != firstLargest)
        {
            secondLargest = num;
             
        }
         
    }
    System.out.println(secondLargest); 
} 
}
        