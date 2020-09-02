package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
            Stage stage = new Stage();
            mainController.loadFxml("/resources/fxmlFiles/carService.fxml", stage);
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
