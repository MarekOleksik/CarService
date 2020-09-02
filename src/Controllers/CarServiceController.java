package Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class CarServiceController {

    @FXML
    private Button buttonAddRefueling;

    MainController mainController = new MainController();

    @FXML
    void addRefueling(ActionEvent event) throws IOException {
        Stage stage = new Stage();;
       mainController.loadFxml("/resources/fxmlFiles/addRefueling.fxml", stage);

    }

}

