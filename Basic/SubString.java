package Basic;

public class SubString {
    public static void main(String[] args) {
      
        String name = "abc";
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j <= name.length(); j++) {
            System.out.print(" "+name.substring(i, j));
            }
        }
    }
    
}
