public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
        String newString = word.substring(0,1);
        for (int i = 1; i<word.length(); i++) {
        newString += "\n" + word.substring(i,i+1);
        }
        return newString;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        String newString = "";
        
        for (int i = (word.length()-1); i>=0; i--) {
        newString += word.substring(i,i+1);
        
        }
        return newString;
        
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        // TODO: Implement this method
        String newString = sentence.substring(0,1).toUpperCase();
        for (int i = 1; i<sentence.length(); i++) {
            if (sentence.substring(i-1,i).equals(" ")) {
               newString += sentence.substring(i,i+1).toUpperCase();

            } else {
               newString += sentence.substring(i,i+1);
            }
        }
        return newString;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        String backString = "";
        String frontString = "";
        for (int i = (word.length()-1); i>=0; i--) {
            backString += word.substring(i,i+1).toUpperCase(); 
        }
          
        for (int i = 0; i<word.length(); i++) {
            frontString += word.substring(i,i+1).toUpperCase();      
        }

        if (frontString.equals(backString)){
            return true;
        }
        return false;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        // TODO: Implement this method
        int counter = 0;
        for (int i = 0; i<word.length(); i++) {
             counter = 0;
             for (int j = 0; j<word.length(); j++) {
                  if (word.substring(j,j+1).equals(word.substring(i,i+1))) {
                   counter++;
                  }
             }
             if (counter == 1) {
               return word.charAt(i);
             }       
        }
        
        
        return ' ';
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("Testing printCharacters:");
        // Example:
        System.out.println(printCharacters("hello"));

        System.out.println("\nTesting reverseWord:");
        // Example:
        System.out.println(reverseWord("hello"));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        System.out.println(capitalizeString("the quick brown fox"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        System.out.println(detectPalindrome("racecar"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        System.out.println(firstUniqueChar("swiss"));
    }
}
