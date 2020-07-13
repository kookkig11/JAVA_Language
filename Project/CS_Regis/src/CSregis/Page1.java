package CSregis;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Page1{
    @FXML private AnchorPane rootPane;
    @FXML private Button CurriculumButton;
    @FXML private Button SignUpButton;

    @FXML
    public void initialize(){
    }

    //if click Curriculum, open Curriculum windows
    @FXML
    public void handleCurriculumButtonClick(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("Curriculum/Curriculum.fxml")); //not complete
        rootPane.getChildren().setAll(pane);
    }
}
