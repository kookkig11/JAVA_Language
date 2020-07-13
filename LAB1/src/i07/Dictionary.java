package i07;

import java.util.ArrayList;

public class Dictionary {
    private Vocabulary[] words;
    private int lastIndex;
    private Boolean check;
    ArrayList<Vocabulary> vocab = new ArrayList<>(); //array

    public Dictionary() {
        this.words = new Vocabulary[50];
        this.lastIndex = 0;
    }

    public void addVocabulary(Vocabulary vocabulary){
        vocab.add(vocabulary);
    }

    public Boolean checkFind(String word){
        for (int i = 0; i < vocab.size(); i++){
            if (word.equals(vocab.get(i).getWord())){
                check = true;
            }
            else{
                check = false;
            }
        }
        return  check;
    }

    public String findWord(String word){
        if (check == true){
            for (int i = 0; i < vocab.size(); i++) {
                if (word.equals(vocab.get(i).getWord())) {
                    return vocab.get(i).getMean();
                }
            }
        }
        return "";
    }

}
