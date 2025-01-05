package Basic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter a Number");
        int num=scan.nextInt();
        int Factorial=1;
        for(int i=1;i<=num;i++)
        {
            Factorial=Factorial*i;
        }
        System.out.println(Factorial);  

    }
    
}
