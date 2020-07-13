package MainProgram;

import MainProgram.Dictionary.Dictionary;
import MainProgram.Dictionary.MyFormatter;
import MainProgram.Dictionary.Vocabulary;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.Map;

public class Controller {
    private Dictionary dictionary;

    @FXML
    private TableView DictionaryTable;
    @FXML
    private TableColumn WordColumn, PartOfSpeechColumn, MeaningColumn, ExampleColumn;
    @FXML
    private TextField AddWordField, AddPartOfSpeechField, AddMeaningField, AddExampleField, RemoveWordField;

    @FXML
    public void initialize() {
        dictionary = new Dictionary();
        try {
            dictionary.loadFileToVocab();
        } catch (Exception e) {
            System.out.println("File not found!!");
        }

        //set DictionaryTable
        WordColumn.setCellValueFactory(new PropertyValueFactory<Dictionary, String>("word"));
        //ใช้ .setCellValueFactory() เพราะสามารถ update ได้
        PartOfSpeechColumn.setCellValueFactory(new PropertyValueFactory<Dictionary, String>("partOfSpeech"));
        MeaningColumn.setCellValueFactory(new PropertyValueFactory<Dictionary, String>("meaning"));
        ExampleColumn.setCellValueFactory(new PropertyValueFactory<Dictionary, String>("example"));
        DictionaryTable.setItems(dictionary.getData());
        DictionaryTable.getColumns().setAll(WordColumn, PartOfSpeechColumn, MeaningColumn, ExampleColumn);

        //set vocabulary 5 word
        dictionary.addWord("literate", "Adjective", "Able to read and write.", "The man was barely literate and took a long time to write his name.");
        dictionary.addWord("mind", "Noun", "The part of a person that makes it possible for him or her to think, feel emotions, and understand things.", "I just said the first thing that came into my mind.");
        dictionary.addWord("think", "Verb", "Have a particular belief or idea.", "She thought that nothing would be the same again.");
        dictionary.addWord("cat", "Noun", "A small domesticated carnivorous mammal with soft fur, a short snout, and retractable claws.", "I listen to the screams of drunks outside as they mix with the jazz of the cats on stage.");
        dictionary.addWord("game", "Noun", "An activity that one engages in for amusement or fun.", "You shall be of good behaviour toward the game of swans.");
        DictionaryTable.setItems(dictionary.getData());
    }

    //เมื่อมีการเพิ่มหรือลบข้อมูล
    @FXML
    private void updateDictionary() {
        WordColumn.setCellValueFactory(new PropertyValueFactory<Dictionary, String>("word"));
        PartOfSpeechColumn.setCellValueFactory(new PropertyValueFactory<Dictionary, String>("partOfSpeech"));
        MeaningColumn.setCellValueFactory(new PropertyValueFactory<Dictionary, String>("meaning"));
        ExampleColumn.setCellValueFactory(new PropertyValueFactory<Dictionary, String>("example"));
        DictionaryTable.setItems(dictionary.getData());
        DictionaryTable.getColumns().setAll(WordColumn, PartOfSpeechColumn, MeaningColumn, ExampleColumn);
    }


    //เปิด Alert เป็นหน้าต่างใหม่ เพื่อแสดงผล
    @FXML
    private void runAlert(String alertFormat, String type) throws IOException {
        Alert text = new Alert(Alert.AlertType.INFORMATION, alertFormat);
        text.setTitle(type);
        text.setHeaderText("");
        text.setResizable(true);
        text.showAndWait(); //button type
    }

    @FXML
    public void handleClickAddAndEditButton(ActionEvent event) {
        //เช็คว่า TextField ไม่ได้รับ String ว่าง
        if (!AddWordField.getText().equals("") && !AddPartOfSpeechField.getText().equals("") &&
                !AddMeaningField.getText().equals("") && !AddExampleField.getText().equals("")) {
            //เพิ่มคำศัพท์
            dictionary.addWord(AddWordField.getText(), AddPartOfSpeechField.getText(), AddMeaningField.getText(), AddExampleField.getText());
            //ทำให้ช่อง TextField ว่างอีกครั้ง
            AddWordField.setText("");
            AddPartOfSpeechField.setText("");
            AddMeaningField.setText("");
            AddExampleField.setText("");

            updateDictionary();
        }
    }

    @FXML
    public void handleClickDeleteButton(ActionEvent event) {
        dictionary.removeWord(RemoveWordField.getText());
        RemoveWordField.setText("");

        updateDictionary();
    }

    //show string in xml pattern
    @FXML
    public void handleClickXMLButton(ActionEvent event) throws IOException {
        MyFormatter formatter = new MyFormatter() {
            @Override
            public String format(Object obj) {
                Dictionary toVocab = (Dictionary) obj;

                String result = "<Dictionary>\n";
                for (Map.Entry i : toVocab.getWords().entrySet()) {
                    Vocabulary temp = (Vocabulary) i.getValue();
                    result += "\t<Vocab word=\"" + i.getKey() + "\">\n"
                            + "\t\t<PartOfSpeech>" + temp.getPartOfSpeech() + "</PartOfSpeech>\n"
                            + "\t\t<Meaning>" + temp.getMeaning() + "</Meaning>\n"
                            + "\t\t<Example>" + temp.getExample() + "</Example>\n"
                            + "\t</Vocab>\n";
                }
                result += "</Dictionary>";

                return result;
            }
        };
        runAlert(dictionary.format(formatter), "XML");
    }

    //show string in Json pattern
    @FXML
    public void handleClickJSONButton(ActionEvent event) throws IOException {
        MyFormatter formatter = new MyFormatter() {
            @Override
            public String format(Object obj) {
                Dictionary toVocab = (Dictionary) obj;

                String result = "[\n";
                for (Map.Entry i : toVocab.getWords().entrySet()) {
                    Vocabulary temp = (Vocabulary) i.getValue();
                    result += "\t{\n\t\tvocab: \"" + i.getKey() + "\",\n"
                            + "\t\tpartOfSpeech:\"" + temp.getPartOfSpeech() + "\",\n"
                            + "\t\tmeaning: \"" + temp.getMeaning() + "\",\n"
                            + "\t\texample:" + temp.getExample() + "\"\n"
                            + "\t}";
                    if (i.getValue() != toVocab.getWords().lastEntry().getValue()) {
                        result += ",\n";
                    } else
                        result += "\n";
                }
                result += "]\n";

                return result;
            }
        };
        runAlert(dictionary.format(formatter), "JSON");
    }
}
