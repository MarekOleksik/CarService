package Controllers;

import Classes.Refuel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class AddRefueling implements Initializable {

    ObservableList listOfFuel = FXCollections.observableArrayList();
    Refuel refuel = new Refuel();
    List<Refuel> refuels = new ArrayList<>();
    MainController mainController = new MainController();

    @FXML
    private DatePicker datePicker;

    @FXML
    private ChoiceBox<String> choiceFuel;

    @FXML
    private CheckBox checkIsFull;

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

    @FXML
    private TextField txtPricePerLiter;

    @FXML
    private Label lblTotalCost;


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

    public void saveRefuel(ActionEvent actionEvent) {
        //refuel.setDate(datePicker.getEditor().);
        refuel.setFuelType(choiceFuel.getValue());
        refuel.setFull(checkIsFull.isSelected());
        refuel.setLiters(Short.parseShort(txtLiters.getText()));
        refuel.setPricePerLiter(Float.parseFloat(txtPricePerLiter.getText()));
        refuel.setCounter(Integer.parseInt(txtCounter.getText()));
        refuel.setStation(txtStation.getText());
        refuel.setTotalCost(Short.parseShort(txtLiters.getText()) * Float.parseFloat(txtPricePerLiter.getText()));
        lblTotalCost.setText(String.valueOf(refuel.getTotalCost()));
        refuels.add(refuel);
        for (Refuel refuel : refuels) {
            System.out.println(refuel.getTotalCost());
        }
        mainController.getPrevStage().close();
    }
}
