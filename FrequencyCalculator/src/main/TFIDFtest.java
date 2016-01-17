package main;
import FrequencyCalculator.TFIDF;

import java.util.Collections;
import java.util.Map;

/**
 * Created by amulyas on 1/16/2016.
 */
public class TFIDFtest {
    public static void main(String args[])
    {
        String s = "\n" +
                "amulya [2:26 PM] \n" +
                "Hello!\n" +
                "\n" +
                "smhaisale [2:26 PM] \n" +
                "hey\n" +
                "\n" +
                "amulya [2:26 PM] \n" +
                "https://github.com/amusriv/Taboo\n" +
                "\n" +
                "GitHub\n" +
                "amusriv/Taboo\n" +
                "Contribute to Taboo development by creating an account on GitHub.\n" +
                "\n" +
                "amulya [3:04 PM] \n" +
                "git@github.com:amusriv/Taboo.git\n" +
                "\n" +
                "smhaisale [3:10 PM] \n" +
                "https://github.com/smhaisale/WordNetAccess.git\n" +
                "\n" +
                "GitHub\n" +
                "smhaisale/WordNetAccess\n" +
                "Contribute to WordNetAccess development by creating an account on GitHub.\n" +
                "\n" +
                "smhaisale [8:24 PM] \n" +
                "added a Java snippet: FAQEntry.java \n" +
                "package mainAlgorithm;\n" +
                "\u200B\n" +
                "/*\n" +
                " * Contains FAQ data about a single FAQ term.\n" +
                " * Contains list of all documents which contain the term.\n" +
                " * Contains list of all synonyms of this term.\n" +
                " * Contains IDF of the term over the entire corpus.\n" +
                " */\n" +
                "\u200B\n" +
                "import java.util.*;\n" +
                "\u200B\n" +
                "public class FAQEntry {\n" +
                "\u200B\n" +
                "\tprivate Double IDF;\n" +
                "\tprivate List<String> FAQList = new ArrayList<String>();\n" +
                "\tprivate Set<String> Synonyms = new LinkedHashSet<String>();\n" +
                "\t\n" +
                "\tFAQEntry(String FAQ) {\n" +
                "\t\tFAQList.add(FAQ);\n" +
                "\t}\n" +
                "\t\n" +
                "\tFAQEntry(String FAQ, Set<String> synonyms) {\n" +
                "\t\tFAQList.add(FAQ);\n" +
                "\t\tthis.Synonyms = synonyms;\n" +
                "\t}\n" +
                "\t\n" +
                "\tpublic void addFAQ(String FAQ) {\n" +
                "\t\tFAQList.add(FAQ);\n" +
                "\t}\n" +
                "\u200B\n" +
                "\tpublic Double getIDF() {\n" +
                "\t\treturn IDF;\n" +
                "\t}\n" +
                "\u200B\n" +
                "\tpublic List<String> getFAQList() {\n" +
                "\t\treturn FAQList;\n" +
                "\t}\n" +
                "\t\n" +
                "\tpublic void setIDF(Double iDF) {\n" +
                "\t\tIDF = iDF;\n" +
                "\t}\n" +
                "\u200B\n" +
                "\tpublic void setIDF(int FAQCount) {\n" +
                "\t\tIDF = Math.log(FAQCount / FAQList.size());\n" +
                "\t}\n" +
                "\t\n" +
                "\tpublic Set<String> getSynonyms() {\n" +
                "\t\treturn Synonyms;\n" +
                "\t}\n" +
                "\u200B\n" +
                "\tpublic void setSynonyms(LinkedHashSet<String> synonyms) {\n" +
                "\t\tSynonyms = synonyms;\n" +
                "\t}\n" +
                "}\n" +
                "Add Comment Click to expand inline 55 lines\n" +
                "smhaisale [8:24 PM] \n" +
                "added a Java snippet: Preprocessor.java \n" +
                "package mainAlgorithm;\n" +
                "\u200B\n" +
                "/*\n" +
                " * The class Preprocessor is used for creating a domain dictionary from an XML file of FAQ entries based on the FIRE - 2012 format.\n" +
                " * \n" +
                "Add Comment Click to expand inline 68 lines\n" +
                "amulya [8:45 PM] \n" +
                "added a Plain Text snippet: Harry Potter and the Sorcerer's Stone.txt \n" +
                "\fHarry Potter and the Sorcerer's Stone\n" +
                "CHAPTER ONE\n" +
                "THE BOY WHO LIVED\n" +
                "Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say\n" +
                "that they were perfectly normal, thank you very much. They were the last\n" +
                "Add Comment Click to expand inline 8183 lines\n" +
                "amulya [10:34 PM] \n" +
                "https://github.com/amusriv/WordGenerator.git\n" +
                "\n" +
                "GitHub\n" +
                "amusriv/WordGenerator\n" +
                "Contribute to WordGenerator development by creating an account on GitHub.\n" +
                "\n" +
                "\n" +
                "slackbot [10:34 PM] Only you can see this message\n" +
                "smhaisale is currently in Do Not Disturb mode and may not be alerted of this message right away. If it’s urgent, \u200B\u200B\u200Bclick here\u200B\u200B\u200B to send a notification now. Keep in mind, if the recipient has all notifications turned off, they will only get your message when they’re back online.\n" +
                "\n" +
                "How does Do Not Disturb work? Learn more in this Help Center article: Do Not Disturb";


        Map<String, Double> result = TFIDF.getTFIDFforDoc(Collections.singletonList(s) );
        System.out.print(result);

    }
}

