package Basic;

import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        double sqrt = Math.sqrt(num);
        if(sqrt - Math.floor(sqrt) == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    
}



