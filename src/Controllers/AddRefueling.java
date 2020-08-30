package Controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddRefueling {

    @FXML
    private DatePicker datePicker;

    @FXML
    private ChoiceBox<?> choiceFuel = new ChoiceBox(FXCollections.observableArrayList("First", "Second", "Third"));;

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

}
