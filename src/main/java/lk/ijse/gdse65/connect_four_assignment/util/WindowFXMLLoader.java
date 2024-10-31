package lk.ijse.gdse65.connect_four_assignment.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;

public class WindowFXMLLoader {

    //BoardController
    private static FXMLLoader fxmlLoaderBoardController;
    //setter
    public static void setFxmlLoaderBoardController(FXMLLoader fxmlLoader){
        fxmlLoaderBoardController=fxmlLoader;
    }
    //getter
    public static FXMLLoader getFxmlLoaderBoardController(){
        if(!(fxmlLoaderBoardController ==null)){
            return fxmlLoaderBoardController;
        }else{
            new Alert(Alert.AlertType.ERROR,"This UI is not open :(!").show();
        }
        return null;
    }
    public static void emptyFxmlLoaderBoardController(){
        fxmlLoaderBoardController=null;
    }

    //CreatePlayerController
    private static FXMLLoader fxmlLoaderCreatePlayerController;
    //setter
    public static void setFxmlLoaderCreatePlayerController(FXMLLoader fxmlLoader){
        fxmlLoaderCreatePlayerController=fxmlLoader;
    }
    //getter
    public static FXMLLoader getFxmlLoaderCreatePlayerController(){
        if(!(fxmlLoaderCreatePlayerController ==null)){
            return fxmlLoaderCreatePlayerController;
        }else{
            new Alert(Alert.AlertType.ERROR,"This UI is not open ❌!").show();
        }
        return null;
    }
    public static void emptyFxmlLoaderCreatePlayerController(){
        fxmlLoaderBoardController=null;
    }
}
