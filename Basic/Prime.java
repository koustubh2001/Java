package Basic;

import java.util.Scanner;

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


//////////////////////////////////////////////////


// public class Prime {
//     public static void main(String[] args) {
//        Scanner scan=new Scanner (System.in);
//         System.out.println("Enter a Number");
//         int num=scan.nextInt();
        
//        int count=0;
//         for(int i=1;i<=num;i++)
//         { 
//          if(num%i==0)
//          {
//             count++;
//          }
//         }
//         if(count==2)
//         {
//             System.out.println(" It is a Prime Number");
//         }
//         else
//         {
//             System.out.println("It is not a Prime Number");
//         }
        
//     }
    
// } 