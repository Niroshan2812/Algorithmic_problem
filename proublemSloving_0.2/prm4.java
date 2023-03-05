import java.util.HashSet;
import java.util.Set;

/*
 * Assume that you are given a set of six letters to form words. For example, the letters can be 
R, E, D, A, W, and O. some possible words that can be formed are red, ear, dear, etc.

1) Write a pseudo code algorithm to form all the possible three (03) letter words from the 
above letter set. These letters cannot be repeated inside a word. (07 Marks)



3) Write a pseudo code algorithm to track whether any duplicate words are generated in 
part (1). 
 */

public class prm4 {
    // Answer for 1st one
    public static void firstanswer() {
        String[] keyword = { "r", "e", "d", "a", "w", "o" };

        for (int i = 0; i < keyword.length; i++) {
            for (int j = 0; j < keyword.length; j++) {
                for (int k = 0; k < keyword.length; k++) {
                    if (keyword[i] != keyword[j] && keyword[i] != keyword[k] && keyword[j] != keyword[k]) {
                        System.out.print(keyword[i] + keyword[j] + keyword[k] + " ");
                    }

                }
            }
        }
    }

    // This one for third quection

    public static void thirdAnswer() {
        String[] keyword = { "r", "e", "d", "a", "w", "o" };
        Set<String> words = new HashSet<String>();

        for (int i = 0; i < keyword.length; i++) {
            for (int j = 0; j < keyword.length; j++) {
                for (int k = 0; k < keyword.length; k++) {
                    if (keyword[i] != keyword[j] && keyword[i] != keyword[k] && keyword[j] != keyword[k]) {
                        String answer = keyword[i] + keyword[j] + keyword[k] + " ";
                        words.add(answer);
                    }

                }
            }
        }
        // Check for duplicate words
        boolean hasDuplicates = false;
        Set<String> uniqueWords = new HashSet<String>();
        for (String word : words) {
            if (!uniqueWords.add(word)) {
                hasDuplicates = true;
                break;
            }
        }

        // Print result of duplicate check
        if (hasDuplicates) {
            System.out.println("Duplicate words were generated.");
        } else {
            System.out.println("No duplicate words were generated.");
        }

    }

    public static void main(String[] args) {
        thirdAnswer();

    }

}
