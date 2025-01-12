package Basic;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Koustubh";
       for(int i=name.length()-1;i>=0;i--)
       {
           System.out.print(name.charAt(i));
       
       }

       //////////////////////////////////////////////////  

    //    public static void reverseString(String name) {
    //    StringBuilder reversed = new StringBuilder(name);
    //    System.out.println(reversed.reverse().toString());
    //     }

    // public static void main(String[] args) {
    //     String name = "Koustubh";
    //     reverseString(name); 
    //     } 
    
}}
