package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {

    //window == stage;
    //content inside window == scene;

    Button button;

    public static void main(String[] args) {
        launch(args); //method inside the application class. Sets up my program as a Javafx application.
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("My first Javafx application window."); //title of the window that appears.

        button = new Button("Click me"); //button with a text

        StackPane layout = new StackPane();
        layout.getChildren().add(button); //I added the button early created to the layout.

        Scene scene = new Scene(layout, 500,300); //I create a window that is 500x500.

        primaryStage.setScene(scene); //I give the stage the scene i created before.
        primaryStage.show();

    }


}
