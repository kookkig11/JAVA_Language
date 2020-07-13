package i07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word, type, mean, example, choose;
        Scanner input = new Scanner(System.in);

        Dictionary dictionary = new Dictionary();
        Vocabulary vocabulary = new Vocabulary("iterate", "Verb", "To say, or do again", "She kept reiterating her request.");
        dictionary.addVocabulary(vocabulary);

        //Find
        System.out.print("Find word: ");
        word = input.next();
        if (dictionary.checkFind(word) == true) {
            System.out.println("Mean: " + dictionary.findWord(word));
        }
        else{
            System.out.println("Not Found!");
        }
    }
}
