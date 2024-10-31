package lk.ijse.gdse65.connect_four_assignment.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class NewWindowUI {
    private static FXMLLoader fxmlLoader;
    public static FXMLLoader window(String location,String title){
        try{
            fxmlLoader = new FXMLLoader(NewWindowUI.class.getResource("../view/"+location));
            Parent parent = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(parent));
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
        }catch (Exception e){
            new Alert(Alert.AlertType.WARNING, title+" not Found :0 !");
        }
        return fxmlLoader;
    }
}
