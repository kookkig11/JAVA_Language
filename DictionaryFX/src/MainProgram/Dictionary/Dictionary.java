package MainProgram.Dictionary;


import MainProgram.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Dictionary {
    //ใช้ TreeMap เพื่อเรียงลำดับคำศัพท์ตามตัวอักษร
    private TreeMap<String, Vocabulary> words = new TreeMap<>();

    public File getFile() {
        try {
            String jarDirectory = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getParent();
            return new File(jarDirectory + "/Vocabulary.txt");
        } catch (Exception e) {
            return null;
        }
    }

    public void addWord(String word, String partOfSpeech, String meaning, String example) {
        //Map ใช้ .put() ในการเพิ่ม key-value
        words.put(word, new Vocabulary(word, partOfSpeech, meaning, example));
        saveToFile();
    }

    public void removeWord(String word) {
        words.remove(word);
        saveToFile();
    }

    public TreeMap<String, Vocabulary> getWords() {
        return words;
    }

    public ObservableList<Vocabulary> getData() {
        return FXCollections.observableArrayList(words.values());
    }

    public String format(MyFormatter format) {
        return format.format(this);
    }

    public void loadFileToVocab() throws Exception {
        words.clear();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(getFile()));
        String line = bufferedReader.readLine();
        while (line != null) {
            String[] data = line.split("/");
            words.put(data[0], new Vocabulary(data[0], data[1], data[2], data[3]));
            line = bufferedReader.readLine();
        }
    }

    public void saveToFile() {
        StringBuilder allVocabulary = new StringBuilder();
        for (Map.Entry i : getWords().entrySet()) {
            Vocabulary temp = (Vocabulary) i.getValue();
            allVocabulary.append(i.getKey() + "/" + temp.getPartOfSpeech() + "/" + temp.getMeaning() + "/" + temp.getExample() + "\n");
        }

        try (PrintWriter printWriter = new PrintWriter(getFile())) {
            printWriter.print(allVocabulary.toString());
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!");
        }
    }
}
