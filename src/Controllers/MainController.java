package Controllers;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {


    Stage prevStage;
    Group root = new Group();
    Scene scene = new Scene(root, 600, 400);

    public Scene getScene() {
        return scene;
    }

    public Group getRoot() {
        return root;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public void setPrevStage(Stage stage) {
        this.prevStage = stage;
    }

    public Stage getPrevStage() {
        return prevStage;
    }
}
