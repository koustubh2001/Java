package Basic;

public class NonRepeateChar {
    public static void main(String[] args) {
        String str="swiss";
        int[] charCount = new int[256];
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        } 
        char firstNonRepeatingChar = '\0';
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                firstNonRepeatingChar = str.charAt(i);
                break;
            }
        } 
        if (firstNonRepeatingChar != '\0') {
            System.out.println("First non-repeating character is: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
        }
    }
