package Hangman;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

//ตัวที่กำหนดในfxid(scene builder) = attributeในcontroller.java
public class Controller {
    @FXML private Label OnOffLabel;
    @FXML private Button ToggleButton, ChargeButton;
    @FXML private TextField ChargeTextField;
    private LightBulb lightBulb;

    public Controller(){
        lightBulb = new LightBulb();
    }

    @FXML
    public void initialize(){
        OnOffLabel.setText(lightBulb.getCurrentStatus());
        OnOffLabel.setStyle("-fx-font-size: 36px");
    }

    @FXML
    public void handleChargeButtonClick(ActionEvent actionEvent){
        String input = ChargeTextField.getText();
        System.out.println(input);
        try {
            lightBulb.charge(Integer.parseInt(input)); //parseInt = แปลงstring เป็นint
        } catch (Exception e){
            System.out.println("Error: Input is not integer");
        }
        ChargeTextField.setText("");
    }

    //binding event
    //handle + node name + node type + action type
    @FXML
    public void handleToggleButtonOnClick(ActionEvent actionEvent){
        System.out.println("Button is clicked");
        lightBulb.ToggleSwitch();
        OnOffLabel.setText(lightBulb.getCurrentStatus());
        System.out.println("Hit Count: " + lightBulb.getHitCount());
    }
}
