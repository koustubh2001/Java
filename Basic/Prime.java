package Basic;

public class Prime {
    public static void main(String[] args) {
        int [] arr={10,12,13,14,15,16,17};
       
        for(int i=0;i<arr.length;i++)
        { 
            int num=arr[i];
            int count=0;
            for(int j=1;j<=num;j++)
            {
                if(num%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println("Prime Number are : "+num);
            }
        }
        
    }
    
} 