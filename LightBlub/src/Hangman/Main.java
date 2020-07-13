package Hangman;

//เป็นController เหมือนกัน
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    //start อยู่ใน Application
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); //name=ชื่อไฟล์ที่เป็นview (fxml)
        primaryStage.setTitle("Light");
        primaryStage.setScene(new Scene(root, 500, 350)); //setหน้าจอ(windows)
        primaryStage.setResizable(false); //มาจาก ps.sr     //false=ปรับขนาดจอไม่ได้, true=ปรับได้
        primaryStage.show(); //การแสดงผล
    }


    public static void main(String[] args) {
        launch(args);
    }
}

