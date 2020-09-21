package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    Stage prevStage;

    @FXML
    private BorderPane borderPane;

    public void setPrevStage(Stage stage) {
        this.prevStage = stage;
    }

    public Stage getPrevStage() {
        return prevStage;
    }

    public Parent loadFxml(String fxml, Stage stage) throws IOException {
        setPrevStage(stage);
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        Scene scene = new Scene(root, 600, 400);
        prevStage.setTitle("Program do zarządzania samochodem");
        prevStage.setResizable(false);
        prevStage.setScene(scene);
        prevStage.show();
        return root;
    }



}
