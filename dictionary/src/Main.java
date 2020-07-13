import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static String format(MyFormatter myFormatter){
        return "";
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Vocabulary vocab1 = new Vocabulary("literate",
                                            "Noun,Adjective",
                                            "able to read and write",
                                            "Mark left school barely literate.");
        dictionary.addVocab(vocab1);
        //System.out.println(dictionary.toVocab("literate"));
    }
}
