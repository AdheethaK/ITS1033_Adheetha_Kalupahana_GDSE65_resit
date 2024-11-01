package lk.ijse.gdse65.connect_four_assignment.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import lk.ijse.gdse65.connect_four_assignment.service.*;
import lk.ijse.gdse65.connect_four_assignment.util.Navigation;
import lk.ijse.gdse65.connect_four_assignment.util.NewWindowUI;
import lk.ijse.gdse65.connect_four_assignment.util.Routes;
import lk.ijse.gdse65.connect_four_assignment.util.WindowFXMLLoader;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BoardController implements Initializable , BoardUI {
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
    private boolean isAiPlaying;
    private boolean isGameOver;

    private Player humanPlayer;
    private Player aiPlayer;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addPlayerNameToBoard();

        lblYourTurn.setOpacity(1);
        isAiPlaying = false;
        lblAITurn.setOpacity(0);

        isGameOver = false;

        Board newBoard = new BoardImpl(this);
        humanPlayer = new HumanPlayer(newBoard);
        aiPlayer = new AiPlayers(newBoard);
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
        if (!isGameOver){
            if (!isAiPlaying){
                update(0,0,true);
                fillImage(true,imgPiece_0x0);
            } else {
                update(0,0,false);
                fillImage(false,imgPiece_0x0);
            }
        }
    }

    @FXML
    void imgPiece_0x1_OnMouseClicked(MouseEvent event) {
        if (!isGameOver){
            if (!isAiPlaying){
                update(0,0,true);
                fillImage(true,imgPiece_0x1);
            } else {
                update(0,0,false);
                fillImage(false,imgPiece_0x1);
            }
        }
    }

    @FXML
    void imgPiece_0x2_OnMouseClicked(MouseEvent event) {
        if (!isGameOver){
            if (!isAiPlaying){
                update(0,0,true);
                fillImage(true,imgPiece_0x2);
            } else {
                update(0,0,false);
                fillImage(false,imgPiece_0x2);
            }
        }
    }

    @FXML
    void imgPiece_1x0_OnMouseClicked(MouseEvent event) {
        if (!isGameOver){
            if (!isAiPlaying){
                update(0,0,true);
                fillImage(true,imgPiece_1x0);
            } else {
                update(0,0,false);
                fillImage(false,imgPiece_1x0);
            }
        }
    }

    @FXML
    void imgPiece_1x1_OnMouseClicked(MouseEvent event) {
        if (!isGameOver){
            if (!isAiPlaying){
                update(0,0,true);
                fillImage(true,imgPiece_1x1);
            } else {
                update(0,0,false);
                fillImage(false,imgPiece_1x1);
            }
        }
    }

    @FXML
    void imgPiece_1x2_OnMouseClicked(MouseEvent event) {
        if (!isGameOver){
            if (!isAiPlaying){
                update(0,0,true);
                fillImage(true,imgPiece_1x2);
            } else {
                update(0,0,false);
                fillImage(false,imgPiece_1x2);
            }
        }
    }

    @FXML
    void imgPiece_2x0_OnMouseClicked(MouseEvent event) {
        if (!isGameOver){
            if (!isAiPlaying){
                update(0,0,true);
                fillImage(true,imgPiece_2x0);
            } else {
                update(0,0,false);
                fillImage(false,imgPiece_2x0);
            }
        }
    }

    @FXML
    void imgPiece_2x1_OnMouseClicked(MouseEvent event) {
        if (!isGameOver){
            if (!isAiPlaying){
                update(0,0,true);
                fillImage(true,imgPiece_2x1);
            } else {
                update(0,0,false);
                fillImage(false,imgPiece_2x1);
            }
        }
    }

    @FXML
    void imgPiece_2x2_OnMouseClicked(MouseEvent event) {
        if (!isGameOver){
            if (!isAiPlaying){
                update(0,0,true);
                fillImage(true,imgPiece_2x2);
            } else {
                update(0,0,false);
                fillImage(false,imgPiece_2x2);
            }
        }
    }

    @Override
    public void update(int col, int row, boolean isHuman) {
        if (isHuman){
            lblYourTurn.setOpacity(0);
            lblAITurn.setOpacity(1);
            isAiPlaying = true;
            System.out.println("update for human");
        } else{
            System.out.println("update for AI");
            lblYourTurn.setOpacity(1);
            lblAITurn.setOpacity(0);
            isAiPlaying = false;
        }
    }
    public void fillImage(boolean isHuman,ImageView imageView){
        if (isHuman){
            File file = new File("src/main/resources/lk/ijse/gdse65/connect_four_assignment/asset/cross_icon.png");
            Image image = new Image(file.toURI().toString());
           imageView.setImage(image);
        }else{
            System.out.println("fillImage for Ai accessed");
            File file = new File("src/main/resources/lk/ijse/gdse65/connect_four_assignment/asset/circle_icon.png");
            Image image = new Image(file.toURI().toString());
            imageView.setImage(image);
        }
    }

    @Override
    public void NotifyWinner() {

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
