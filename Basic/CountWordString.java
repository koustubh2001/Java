package Basic;

public class CountWordString {
    public static void main(String[] args) {
        String name = "Hello World";
        String[] words = name.split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
    }
    
}
