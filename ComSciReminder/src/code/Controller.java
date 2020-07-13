package code;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    private SubjectManager subjectManager;
    private HBox justSomeViewFromSubClass;

    public void initializeData(HBox justSomeViewFromSubClass) {
        this.justSomeViewFromSubClass = justSomeViewFromSubClass;
        try {
            subjectManager = new SubjectManager();
        } catch (Exception e) {
            System.out.println("Unable to load file: File not found or corrupted!");
        }
    }

    public void circleHandler(Circle circle, String id) {
        try {
            if (!subjectManager.getSubject(id).isPassed()) {
                circle.setStyle("-fx-fill: #C5283D; -fx-stroke: #1d1e2c; -fx-stroke-type: INSIDE;");
            } else {
                circle.setStyle("-fx-fill: #0DAB76; -fx-stroke: #1d1e2c; -fx-stroke-type: INSIDE;");
            }
        } catch (NullPointerException e) {
            System.out.println("Unable to load component: File not found or corrupted!");
        }
    }

    public void passButtonHandler(HBox passButton, Label passButtonText, String id) {
        try {
            subjectManager.toggleStatusOfSubject(subjectManager.getSubject(id));
            updatePassButton(passButton, passButtonText, id);
        } catch (Exception e) {
            System.out.println("Unable to save file: File not found or corrupted!");
        }
    }

    public void updatePassButton(HBox passButton, Label passButtonText, String id) {
        try {
            if (!subjectManager.getSubject(id).isPassed()) {
                passButton.setStyle("-fx-pref-width: 102; -fx-max-height: 32; -fx-background-color: #C5283D; -fx-background-radius: 4;");
                passButtonText.setStyle("-fx-font-size: 20px; -fx-text-fill: #EEEEEE;");
                passButtonText.setText("Not pass");
            } else {
                passButton.setStyle("-fx-pref-width: 92; -fx-max-height: 32; -fx-background-color: #0DAB76; -fx-background-radius: 4;");
                passButtonText.setStyle("-fx-font-size: 20px; -fx-text-fill: #444444;");
                passButtonText.setText("Passed");
            }
        } catch (NullPointerException e) {
            System.out.println("Unable to load component: File not found or corrupted!");
        }
    }

    private void openNewScene(String year, String semester) throws IOException {
        Stage currentStage = (Stage) justSomeViewFromSubClass.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/layout/Year" + year + "Semester" + semester + "Scene.fxml")), 1020, 700);
        scene.getStylesheets().add(getClass().getResource("/style/StyleSheet.css").toExternalForm());

        currentStage.setScene(scene);
        currentStage.setTitle("ComSci Reminder - Year " + year + " Semester " + semester);
        currentStage.show();
    }

    @FXML
    public void y1s1Handler(MouseEvent mouseEvent) throws IOException {
        openNewScene("1", "1");
    }

    @FXML
    public void y1s2Handler(MouseEvent mouseEvent) throws IOException {
        openNewScene("1", "2");
    }

    @FXML
    public void y2s1Handler(MouseEvent mouseEvent) throws IOException {
        openNewScene("2", "1");
    }

    @FXML
    public void y2s2Handler(MouseEvent mouseEvent) throws IOException {
        openNewScene("2", "2");
    }

    @FXML
    public void y3s1Handler(MouseEvent mouseEvent) throws IOException {
        openNewScene("3", "1");
    }

    @FXML
    public void y3s2Handler(MouseEvent mouseEvent) throws IOException {
        openNewScene("3", "2");
    }

    @FXML
    public void y4s1Handler(MouseEvent mouseEvent) throws IOException {
        openNewScene("4", "1");
    }

    @FXML
    public void y4s2Handler(MouseEvent mouseEvent) throws IOException {
        openNewScene("4", "2");
    }
}