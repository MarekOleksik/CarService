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
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/resources/fxmlFiles/addRefueling.fxml"));
        stage.setTitle("Program do zarządzania samochodem");
        stage.setScene(new Scene(root, 600, 400));
        mainController.setPrevStage(stage);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

}

