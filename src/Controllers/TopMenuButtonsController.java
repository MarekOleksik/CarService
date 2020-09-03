package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {

    private CarServiceController carServiceController;

    @FXML
    private ToggleGroup menu;

    @FXML
    void openMainPage() {

    }

    @FXML
    void openRefueling() {

    }

    @FXML
    void openServices() {

    }

    public void setCarServiceController(CarServiceController carServiceController) {
        this.carServiceController = carServiceController;
    }
}
