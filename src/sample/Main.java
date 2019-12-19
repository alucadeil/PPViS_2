package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception{
        Passenger passenger = new Passenger();
        Controller controller = new Controller();
        Inspector inspector = new Inspector();
        View view = new View();
        Station station = new Station();
        view.draw();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
