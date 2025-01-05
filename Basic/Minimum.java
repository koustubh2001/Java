package Basic;

public class Minimum {

    public static void main(String[] args) {
        int [] arr={5,8,33,81,98,54,23};
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min){
                arr[i]=min;
            }
        }
        System.out.println(min);
    }
    
}
