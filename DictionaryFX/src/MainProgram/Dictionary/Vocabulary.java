package MainProgram.Dictionary;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Vocabulary {
    //StringProperty ใช้กับ javafx
    private StringProperty word;
    private StringProperty partOfSpeech;
    private StringProperty meaning;
    private StringProperty example;

    public Vocabulary(String word, String partOfSpeech, String meaning, String example) {
        //new SimpleStringProperty() ใช้ร่วมกับ StringProperty >> กรณีรับค่ามาเป็นString
        this.word = new SimpleStringProperty(word);
        this.partOfSpeech = new SimpleStringProperty(partOfSpeech);
        this.meaning = new SimpleStringProperty(meaning);
        this.example = new SimpleStringProperty(example);
    }

    public String getWord() {
        return word.get();
    }

    public String getPartOfSpeech() {
        return partOfSpeech.get();
    }

    public String getMeaning() {
        return meaning.get();
    }

    public String getExample() {
        return example.get();
    }
}