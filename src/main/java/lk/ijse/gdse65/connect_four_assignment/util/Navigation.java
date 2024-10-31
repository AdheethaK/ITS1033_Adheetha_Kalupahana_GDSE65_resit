package lk.ijse.gdse65.connect_four_assignment.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Navigation {
    private static AnchorPane pane;
    public static void navigate(Routes route, AnchorPane pane) throws IOException {
        Navigation.pane = pane;
        Navigation.pane.getChildren().clear();
        Stage window = (Stage)Navigation.pane.getScene().getWindow();

        switch (route){
            case WELCOME:
//                window.setTitle("DashBoard");
//                WindowFXMLLoader.setFXMLLoaderMainLogin(initUI("/view/Login/MainLoginForm.fxml"));
                break;
            case BOARD:
                window.setTitle("Home");
                WindowFXMLLoader.setFxmlLoaderBoardController(initUI("../view/Board.fxml"));
                break;
            case CREATE_PLAYER:
                window.setTitle("Home");
                WindowFXMLLoader.setFxmlLoaderCreatePlayerController(initUI("../view/CreatePlayer.fxml"));
                break;
            default:
                new Alert(Alert.AlertType.ERROR,"UI not found :(!").show();
        }

    }
    public static FXMLLoader initUI(String location) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Navigation.class.getResource(location));
        Parent parent = fxmlLoader.load();
        Navigation.pane.getChildren().add(parent);

        return fxmlLoader;
    }
}
