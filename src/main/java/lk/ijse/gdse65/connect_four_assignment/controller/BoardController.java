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
    @FXML
    private AnchorPane root;

    @FXML private ImageView imgPiece_1x1;
    @FXML private ImageView imgPiece_1x2;
    @FXML private ImageView imgPiece_2x0;
    @FXML private ImageView imgPiece_1x0;
    @FXML private ImageView imgPiece_0x0;
    @FXML private ImageView imgPiece_2x1;
    @FXML private ImageView imgPiece_2x2;
    @FXML private ImageView imgPiece_0x1;
    @FXML private ImageView imgPiece_0x2;

    @FXML private ImageView btnBack;
    @FXML private Label lblPlayerName;
    @FXML private ImageView imgPlayer;
    @FXML private Label lblYou;
    @FXML private ImageView imgAI;
    @FXML private Label lblAI;
    @FXML private Label lblYourScore;
    @FXML private Label lblYourTurn;
    @FXML private Label lblYourScoreNumber;
    @FXML private Label lblAIScore;
    @FXML private Label lblAITurn;
    @FXML private Label lblAIScoreNumber;
    @FXML private ImageView btnClose;

    CreatePlayerController controller = WindowFXMLLoader.getFxmlLoaderCreatePlayerController().getController();

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
    void imgPiece_0x0_OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgPiece_0x1_OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgPiece_0x2_OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgPiece_1x0_OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgPiece_1x1_OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgPiece_1x2_OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgPiece_2x0_OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgPiece_2x1_OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgPiece_2x2_OnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btnCloseOnMouseClicked(MouseEvent mouseEvent) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();
        WindowFXMLLoader.emptyFxmlLoaderBoardController();
    }

    public void addPlayerNameToBoard(){
        lblPlayerName.setText("Hi " + controller.txtName.getText());
    }
}
