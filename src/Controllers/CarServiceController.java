package Controllers;


import Classes.FxmlLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class CarServiceController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BorderPane borderPane;

    @FXML
    void addRefueling(ActionEvent event) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("addRefueling");
        borderPane.setCenter(view);
    }

    @FXML
    void addServices(ActionEvent event) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("addServices");
        borderPane.setCenter(view);
    }

    @FXML
    void loadMainPage(ActionEvent event) {
        FxmlLoader object = new FxmlLoader();
        Pane view = object.getPage("mainPage");
        borderPane.setCenter(view);
    }



}

