package Basic;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "I Love Programming";
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println( longestWord);
    }
    
}
