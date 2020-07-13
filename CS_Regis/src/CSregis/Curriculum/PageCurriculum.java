package CSregis.Curriculum;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class PageCurriculum {
    @FXML private AnchorPane paneCurriculum;
    @FXML private Button backButton;
    @FXML private Button FirstSemester1Button, SecondSemester1Button; //1-year
    @FXML private Button FirstSemester2Button, SecondSemester2Button; //2-year
    @FXML private Button FirstSemester3Button, SecondSemester3Button; //3-year
    @FXML private Button FirstSemester4Button, SecondSemester4Button; //4-year


    //if click BACK, back to Page HOME
    @FXML
    public void handleBackButtonClick(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Page1.fxml"));
        paneCurriculum.getChildren().setAll(pane);
    }
}
