package Session13;

import java.util.HashMap;

public class CountWords {
    public static void main(String[] args) {
        String[] words = {"Java", "Python", "C++", "C#", "JavaScript", "Java", "Python", "Java", "C++", "Java"};
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word: words) {
            if(wordCount.containsKey(word)) {
                int counter = wordCount.get(word) + 1;
                System.out.println(wordCount.get(word));
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println(wordCount);
    }
}
