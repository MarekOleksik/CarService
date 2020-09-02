package Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    Stage prevStage;

    public void setPrevStage(Stage stage) {
        this.prevStage = stage;
    }

    public Stage getPrevStage() {
        return prevStage;
    }

    public void loadFxml(String fxml, Stage stage) throws IOException {
        setPrevStage(stage);
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        Scene scene = new Scene(root, 600, 400);
        prevStage.setTitle("Program do zarządzania samochodem");
        prevStage.setScene(scene);
        prevStage.show();
    }
}
