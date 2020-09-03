package Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CarServiceController {

    @FXML
    private Button buttonAddRefueling;

    @FXML
    private BorderPane borderPane;

    @FXML
    private TopMenuButtonsController topMenuButtonsController;

    MainController mainController = new MainController();

    @FXML
    private void initialize() {
        topMenuButtonsController.setCarServiceController(this);
    }

    @FXML
    void addRefueling(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        mainController.loadFxml("/resources/fxmlFiles/addRefueling.fxml", stage);
    }


}

