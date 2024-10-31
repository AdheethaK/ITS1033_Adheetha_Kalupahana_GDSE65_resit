package lk.ijse.gdse65.connect_four_assignment.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import lk.ijse.gdse65.connect_four_assignment.util.Navigation;
import lk.ijse.gdse65.connect_four_assignment.util.NewWindowUI;
import lk.ijse.gdse65.connect_four_assignment.util.Routes;
import lk.ijse.gdse65.connect_four_assignment.util.WindowFXMLLoader;

import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BoardController implements Initializable{
    @FXML private AnchorPane root;

    @FXML private Circle circle3x1;
    @FXML private Circle circle3x2;
    @FXML private Circle circle3x3;
    @FXML private Circle circle2x1;
    @FXML private Circle circle2x2;
    @FXML private Circle circle2x3;
    @FXML private Circle circle1x1;
    @FXML private Circle circle1x2;
    @FXML private Circle circle1x3;

    @FXML private Label lblPlayerName;
    @FXML private Label lblYou;
    @FXML private Label lblAI;
    @FXML private ImageView btnBack;
    @FXML private ImageView btnClose;
    @FXML private Label lblYourScore;
    @FXML private Label lblYourTurn;
    @FXML private Label lblYourScoreNumber;
    @FXML private Label lblAIScore;
    @FXML private Label lblAITurn;
    @FXML private Label lblAIScoreNumber;

    CreatePlayerController controller = WindowFXMLLoader.getFxmlLoaderCreatePlayerController().getController();

    //yellow : #ffb600
    // red : #ff2020

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addPlayerNameToBoard();
        lblYourTurn.setOpacity(1);
        lblAITurn.setOpacity(0);
    }

    @FXML
    void btnBackOnMouseClicked(MouseEvent event) {
        try {
            Navigation.navigate(Routes.CREATE_PLAYER,root);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,"UI not found").show();
        }
    }

    @FXML
    void circle1x1_OnMouseClicked(MouseEvent event) {
        System.out.println("1 x 1 Circle Clicked :)");
    }
    @FXML
    void circle1x2_OnMouseClicked(MouseEvent event) {
        System.out.println("1 x 2 Circle Clicked :)");
    }

    @FXML
    void circle1x3_OnMouseClicked(MouseEvent event) {
        System.out.println("1 x 3 Circle Clicked :)");
    }

    @FXML
    void circle2x1_OnMouseClicked(MouseEvent event) {
        System.out.println("2 x 1 Circle Clicked :)");
    }

    @FXML
    void circle2x2_OnMouseClicked(MouseEvent event) {
        System.out.println("2 x 2 Circle Clicked :)");
    }

    @FXML
    void circle2x3_OnMouseClicked(MouseEvent event) {
        System.out.println("2 x 3 Circle Clicked :)");
    }

    @FXML
    void circle3x1_OnMouseClicked(MouseEvent event) {
        System.out.println("3 x 1 Circle Clicked :)");
    }

    @FXML
    void circle3x2_OnMouseClicked(MouseEvent event) {
        System.out.println("3 x 2 Circle Clicked :)");
    }

    @FXML
    void circle3x3_OnMouseClicked(MouseEvent event) {
        System.out.println("3 x 3 Circle Clicked :)");
    }

    @FXML
    void btnCloseOnMouseClicked(MouseEvent mouseEvent) {
        System.out.println("The Player name : "+controller.txtName.getText());
//        System.out.println("close pressed");
//        Stage stage = (Stage) btnClose.getScene().getWindow();
//        stage.close();
//        WindowFXMLLoader.emptyFxmlLoaderBoardController();
    }

    public void addPlayerNameToBoard(){
        lblPlayerName.setText("Hi " + controller.txtName.getText());
    }
}
