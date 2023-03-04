import javax.swing.plaf.synth.SynthLookAndFeel;

/*
 * You are given a string of characters that represents a sentence. 
 * Your task is to write a function that takes this string as input and returns a list of words in the sentence, sorted in descending order based on the frequency of occurrence of 
 * each word.

For example, given the sentence "the quick brown fox jumps over the lazy dog", your function should return the list ["the", "over", "brown", "fox", "jumps", "lazy", "dog", "quick"] 
because "the" occurs twice, while all other words occur only once.
 */
public class prm3 {
    

   

    public static String sortedOder(String inpt){
        
        String answer = " ";

        for (int i=0; i<inpt.length(); i++) {
            System.out.println(i);
        }

        return answer;
    }
    public static void main(String[] args) {
        String senrtence = "I am sentence Baced on the proublem ";
        sortedOder(senrtence);
        


    }
}
