package HangmanGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private Label showAmountLabel, showResultLabel, showLifeLabel, showHangLabel, WinLoseLabel;
    @FXML private TextField enterAlphabetTextField;
    private Hangman hangman;

    public Controller(){
        hangman = new Hangman();
    }

    @FXML
    public void initialize(){ //ใช้เวลาset label >> ไม่ตั้งในนี้ ค่าไม่ออก
        showAmountLabel.setText(hangman.getAmount());
        showResultLabel.setText(hangman.getResult());
        showLifeLabel.setText(hangman.getLife());
        showHangLabel.setText(hangman.hang());
        WinLoseLabel.setText(hangman.checkWin());
    }

    @FXML
    public void enterAlphabet(ActionEvent actionEvent) throws Exception {
        String input = enterAlphabetTextField.getText();
        System.out.println(input);
        hangman.checkGuess(input.charAt(0));
        enterAlphabetTextField.setText("");
        //Result after get alphabet
        showAmountLabel.setText(hangman.getAmount());
        showResultLabel.setText(hangman.getResult());
        showLifeLabel.setText(hangman.getLife());
        showHangLabel.setText(hangman.hang());
        WinLoseLabel.setText(hangman.checkWin());
    }
}
