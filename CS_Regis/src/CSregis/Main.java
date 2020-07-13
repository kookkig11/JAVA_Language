package CSregis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Page1.fxml"));
        primaryStage.setTitle("CS Regis");
        primaryStage.setScene(new Scene(root, 725, 485));
        primaryStage.setResizable(false); //ป้องกันการปรับเเปลี่ยนหน้าต่างเกม
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
