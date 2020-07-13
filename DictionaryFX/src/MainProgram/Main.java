package MainProgram;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Dictionary <<6010405076>>");
        primaryStage.setScene(new Scene(root, 950, 650));
        primaryStage.setResizable(false); //ป้องกันการปรับเเปลี่ยนหน้าต่างเกม
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
