package Controllers;

import com.sun.tools.javac.Main;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;

public class TopMenuButtonsController {

    private CarServiceController carServiceController;

    @FXML
    private ToggleGroup menu;

    @FXML
    void openMainPage() {

    }

    @FXML
    void openRefueling() throws IOException {

    }

    @FXML
    void openServices() {

    }

    public void setCarServiceController(CarServiceController carServiceController) {
        this.carServiceController = carServiceController;
    }
}
