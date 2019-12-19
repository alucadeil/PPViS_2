package sample;

import com.sun.org.apache.xpath.internal.operations.String;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class View{
    public void FUN() throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Модель железной дороги");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public void update() {

    }
    public void draw() {

    }

}