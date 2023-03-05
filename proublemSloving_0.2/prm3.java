import javax.swing.plaf.synth.SynthLookAndFeel;

/*
 * You are given a string of characters that represents a sentence. 
 * Your task is to write a function that takes this string as input and returns a list of words in the sentence, sorted in descending order based on the frequency of occurrence of 
 * each word.

For example, given the sentence "the quick brown fox jumps over the lazy dog", your function should return the list ["the", "over", "brown", "fox", "jumps", "lazy", "dog", "quick"] 
because "the" occurs twice, while all other words occur only once.
 */
import java.util.*;

public class prm3 {

    public static List<String> sortWordsByFrequency(String sentence) {

        // Split the sentence into individual words
        String[] words = sentence.split(" ");

        // Create a HashMap to store the frequency of each word
        Map<String, Integer> wordCount = new HashMap<String, Integer>();

        // Iterate over each word, incrementing its count in the HashMap
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Create a List from the HashMap and sort it in descending order based on
        // frequency
        List<Map.Entry<String, Integer>> wordList = new ArrayList<Map.Entry<String, Integer>>(wordCount.entrySet());
        Collections.sort(wordList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // Create a List of words sorted by frequency and return it
        List<String> sortedWords = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : wordList) {
            sortedWords.add(entry.getKey());
        }

        return sortedWords;
    }

    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog";
        List<String> sortedWords = sortWordsByFrequency(sentence);
        System.out.println(sortedWords);
    }
}
