package kadry;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.StringConverter;
import kadryTools.Employee;

public class ControllerEmployee {

    private ControllerKadry rootWindow;
    public void setMainWindow(ControllerKadry rootWindow){
        this.rootWindow = rootWindow;
    }
    private Employee pracownik;
    public void setEmployee(Employee pracownik) { this.pracownik = pracownik;}

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private Label labelNazwisko;

    // zakładka - dane podstawowe
    @FXML
    private Tab tabDanePodstawowe;
    @FXML
    private TextField employeeNazwisko = new TextField();
    @FXML
    private TextField employeeImie = new TextField();
    @FXML
    private TextField employeeNrAkt = new TextField();
    @FXML
    private TextField employeePesel = new TextField();

    // zakładka dane uzupełniające
    @FXML
    private Tab tabDaneUzupelniajace;
    @FXML
    private DatePicker employeeTerminUplywuUmowy = new DatePicker();
    @FXML
    private TextField employeeKodUmowyOprace = new TextField();

    @FXML
    void initialize() {
        assert tabDanePodstawowe != null : "fx:id=\"TabDanePodstawowe\" was not injected: check your FXML file 'employee.fxml'.";
        assert tabDaneUzupelniajace != null : "fx:id=\"TabDaneUzupelniajace\" was not injected: check your FXML file 'employee.fxml'.";
    }
    @FXML
    void employeeButtonZapisz(ActionEvent event) {
        // zapisanie i zamknięcie okienka
        // zakładka dane podstawowe
        pracownik.setNazwisko(employeeNazwisko.getText());
        pracownik.setImiona(employeeImie.getText());
        pracownik.setNrAkt(employeeNrAkt.getText());
        pracownik.setPesel(employeePesel.getText());

        // zakładka dane uzupełniające
        pracownik.setKodUmowyOprace(employeeKodUmowyOprace.getText());
        pracownik.setTetminUplywuumowy(employeeTerminUplywuUmowy.getValue());
//        Employee temp  = (Employee) rootWindow.tableKadry.getSelectionModel().getSelectedItem();
//        temp = pracownik;
        rootWindow.tableKadry.refresh();
        ((Button)event.getSource()).getScene().getWindow().hide();
    }
    @FXML
    void employeeButtonZamknij(ActionEvent event) {
        if(pracownik.getNazwisko() == null && pracownik.getImiona() == null){
            rootWindow.data.remove(pracownik);
        }
        ((Button)event.getSource()).getScene().getWindow().hide();

    }
    void setFields() {
        //inicjalizacja pól
        this.labelNazwisko.setText(pracownik.getNazwisko() + " " + pracownik.getImiona());
        // zakładka dane podtswawowe
        this.employeeNazwisko.setText(pracownik.getNazwisko());
        this.employeeImie.setText(pracownik.getImiona());
        this.employeeNrAkt.setText(pracownik.getNrAkt());
        this.employeePesel.setText(pracownik.getPesel());

        // zakładka dane uzupełniajace
        this.employeeKodUmowyOprace.setText(pracownik.getKodUmowyOprace());
        this.employeeTerminUplywuUmowy.setValue(pracownik.getTetminUplywuumowy());
    }
}
