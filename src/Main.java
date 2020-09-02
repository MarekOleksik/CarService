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
        mainController.loadFxml("/resources/fxmlFiles/login.fxml", primaryStage);
        mainController.getPrevStage().show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
