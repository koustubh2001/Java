package Basic;

public class exist {
    public static void main(String[] args) {
        int arr[]={10,24,11,99,45,33};
        int target=45;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==target)
            {
                System.out.println(true +" ,  at index : "+i);
                break;
            }
             else{
                System.out.println(false);
             }
        }
    }
    
}
