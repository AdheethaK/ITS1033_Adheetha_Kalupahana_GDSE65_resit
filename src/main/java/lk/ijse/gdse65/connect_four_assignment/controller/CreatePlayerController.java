package lk.ijse.gdse65.connect_four_assignment.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.gdse65.connect_four_assignment.util.NewWindowUI;
import lk.ijse.gdse65.connect_four_assignment.util.WindowFXMLLoader;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class CreatePlayerController implements Initializable {

    @FXML private AnchorPane root;
    @FXML private Label lblTicTacToe;
    @FXML private Label lblName;
    @FXML private Label lblGender;
    @FXML public TextField txtName;
    @FXML private ComboBox<String> cmbGender;
    @FXML private Button btnLetsPlay;
    @FXML private ImageView btnClose;

    ObservableList<String> genderList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fill_gender_cmbBox();
        txtName.requestFocus();
    }

    public void btnLetsPlayOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader =  NewWindowUI.window("Board.fxml","BOARD");
        WindowFXMLLoader.setFxmlLoaderBoardController(fxmlLoader);
    }

    public void btnCloseOnMouseClicked(MouseEvent mouseEvent) {
        System.out.println("close pressed");
        Stage stage = (Stage) btnLetsPlay.getScene().getWindow();
        stage.close();
        WindowFXMLLoader.emptyFxmlLoaderCreatePlayerController();
    }

    public void fill_gender_cmbBox(){
        genderList.add("Female");
        genderList.add("Male");
        genderList.add("Rather not say");

        cmbGender.setItems(genderList);
    }
}
