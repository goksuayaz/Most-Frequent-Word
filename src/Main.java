import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String article = "The time is always right to do what is right.";

        String[] words = article.split("\\s+");

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for(String word : words){
            String normalizedWord = word.toLowerCase();
            if (wordCounts.containsKey(normalizedWord)) {
                int count = wordCounts.get(normalizedWord);
                wordCounts.put(normalizedWord, count + 1);
            } else {
                wordCounts.put(normalizedWord, 1);
            }
        }

        String mostFrequentWord = "";
        int maxCount = 0;

        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            if (count > maxCount) {
                mostFrequentWord = word;
                maxCount = count;
            }
        }


        System.out.println("Metinde en çok geçen kelime: " + mostFrequentWord);





    }

}
