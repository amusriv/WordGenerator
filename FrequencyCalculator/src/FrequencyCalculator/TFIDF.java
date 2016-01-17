package FrequencyCalculator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by amulyas on 1/16/2016.
 */
public class TFIDF {

    public static Map<String, Double> getTFIDFforDoc(List<String> docs){
        Map<String, Double> result;
        result = new HashMap<String,Double>();
        for (String doc: docs)
        {   List<String> wordsInDoc = Arrays.asList(doc.split("[\\s+\\W+]"));
            for(String word: wordsInDoc)
                if(!result.containsKey(word) && word.length()>3)
                {
                    result.put(word, getTFforWord(word, wordsInDoc) * getIDFforWord(word, docs));
                }
        }
        return result;
    }

    private static double getTFforWord(String word, List<String> words) {
        double frequency=0;
        for(String lex: words)
        {
            if(lex.equalsIgnoreCase(word))
            {
                frequency++;
            }
        }

        return frequency/words.size();
    }

    public static double getIDFforWord(String word, List<String> docs){
        int countOfDocsWithWord = 0;
        for(String doc: docs)
        {
            List<String> wordsInDoc = Arrays.asList(doc.split("[\\s+\\W+]"));
            if (wordsInDoc.contains(word))
            {
                countOfDocsWithWord++;
            }
        }
        return (1 + Math.log((double)docs.size()/countOfDocsWithWord));
    }
}
