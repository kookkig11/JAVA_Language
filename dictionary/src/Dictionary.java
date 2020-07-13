import java.util.TreeMap;

public class Dictionary {
    private TreeMap<String,Vocabulary> vocabularies = new TreeMap<>();

    public void addWord(String word, String partOfSpeech, String meaning, String example){
        vocabularies.put(word,new Vocabulary(word, partOfSpeech, meaning, example));
        //add key-value to Map >> .put()
    }

    public TreeMap<String, Vocabulary> getVocabularies() {
        return vocabularies;
    }
}
