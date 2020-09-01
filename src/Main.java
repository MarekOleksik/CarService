import Controllers.LoginController;
import Controllers.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    MainController mainController = new MainController();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/resources/fxmlFiles/login.fxml"));
        mainController.setPrevStage(primaryStage);
        primaryStage.setTitle("Program do zarządzania samochodem");
        primaryStage.setScene(mainController.getScene());
        mainController.getRoot().getChildren().add(root);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
