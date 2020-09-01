package Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AddRefueling implements Initializable {

    ObservableList listOfFuel = FXCollections.observableArrayList();

    @FXML
    private DatePicker datePicker;

    @FXML
    private ChoiceBox<String> choiceFuel;

    @FXML
    private TextField txtLiters;

    @FXML
    private TextField txtCounter;

    @FXML
    private TextField txtStation;

    @FXML
    private Button buttonClear;

    @FXML
    private Button buttonSave;

    @FXML
    private Button buttonCancel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loadData();
    }

    private void loadData() {
        listOfFuel.removeAll(listOfFuel);
        listOfFuel.add("Benzyna");
        listOfFuel.add("LPG");
        listOfFuel.add("CNG");
        choiceFuel.getItems().addAll(listOfFuel);
    }
}
