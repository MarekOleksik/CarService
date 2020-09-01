package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import javafx.event.ActionEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lblStatus;

    @FXML
    private Button buttonForgotPassword;

    MainController mainController = new MainController();

    @FXML
    public void login(ActionEvent event) throws IOException {
        if (txtUserName.getText().equals("user") && txtPassword.getText().equals("pass")) {
            lblStatus.setText("Zalogowano");

            Parent root = FXMLLoader.load(CarServiceController.class.getResource("/resources/fxmlFiles/carService.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Program do zarządzania samochodem");
            stage.setScene(mainController.getScene());
            mainController.setPrevStage(stage);
            mainController.getRoot().getChildren().add(root);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();


        } else {
            lblStatus.setText("Nieprawidłowy login lub hasło");
        }
    }

    @FXML
    public void forgotPassword(ActionEvent event) {
        System.out.println("Zapomniałem hasła");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
