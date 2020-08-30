package Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class CarServiceController {

    @FXML
    private Button buttonAddRefueling;

    @FXML
    void addRefueling(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("fxmlFiles/addRefueling.fxml"));
        primaryStage.setTitle("Program do zarządzania samochodem");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

}

