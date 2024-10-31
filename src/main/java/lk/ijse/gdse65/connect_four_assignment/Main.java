package lk.ijse.gdse65.connect_four_assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.gdse65.connect_four_assignment.util.NewWindowUI;
import lk.ijse.gdse65.connect_four_assignment.util.WindowFXMLLoader;

import java.io.IOException;

public class Main extends Application {

    //TODO: main()method --> the entry point for the application , It controls the flow of the game ,
    //  including player turns , reading user input , and invoking methods to check the game state

    // KeyMethods :
    //          main(String [] args) : Starts the game loop , handling user input & alternating turns between the human and AI players

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader =  NewWindowUI.window("CreatePlayer.fxml","Create Player Form");
        WindowFXMLLoader.setFxmlLoaderCreatePlayerController(fxmlLoader);
    }

    public static void main(String[] args) {
        launch();
    }
}
