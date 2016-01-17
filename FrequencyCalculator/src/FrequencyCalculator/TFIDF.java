package FrequencyCalculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by amulyas on 1/16/2016.
 */
public class TFIDF {
    public Map<String, Double> getTFIDFforDoc(List<String> words){
        Map<String, Double> result;
        result = new HashMap<String,Double>();
        for (String word: words)
        {
            if(!result.containsKey(word))
            {
                result.put(word, getTFIDFforWord(word, words));
            }
        }
        return result;
    }

    private double getTFIDFforWord(String word, List<String> words) {
        double frequency=0;
        for(String lex: words)
        {
            if(lex.equalsIgnoreCase(word))
            {
                frequency++;
            }
        }
        double TFIDF = frequency/words.size() * (1 + Math.log(words.size()/frequency));
        return TFIDF;
    }

}
