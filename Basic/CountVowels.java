package Basic;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter a Name:");
       String name=scan.nextLine();
        String str=name.toLowerCase();
        int count=0;
         for(int i=0;i<str.length();i++)
         {
                char ch=str.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    count++;
                }
         }
         System.out.println( count);
        

         ////////////////////////////////////////////////////////
          
    //      public static void countVowels(String s) {
    //      String vowels = "aeiouAEIOU";
    //      StringBuilder foundVowels = new StringBuilder();
    //      int count = 0;
         
    //      for (int i = 0; i < s.length(); i++) {
    //          char ch = s.charAt(i);
    //          if (vowels.indexOf(ch) != -1) {
    //              count++;
    //              foundVowels.append(ch).append(", ");
    //          }
    //      } 
    //      if (count > 0) {
              
    //          foundVowels.setLength(foundVowels.length() - 2);
    //          System.out.println(count + " (vowels are " + foundVowels + ")");
    //      } else {
    //          System.out.println("No vowels found.");
    //      }
    //  }
    //  public static void main(String[] args) {
    //      String input = "hello world";
    //      countVowels(input);  
    //  }  
    // }

        

    }  
}
