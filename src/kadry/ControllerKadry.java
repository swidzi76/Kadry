package kadry;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import kadryTools.Employee;

import java.io.IOException;
import java.time.LocalTime;

public class ControllerKadry {

    private ControllerMain rootWindow;
    public TableView tableKadry = new TableView();
    private final ObservableList<Employee> data = FXCollections.observableArrayList();
    public void setMainWindow(ControllerMain rootWindow){
        this.rootWindow = rootWindow;
    }

    public ControllerKadry() {

    }
    public void setTable() {
        tableKadry.getColumns().clear();
        TableColumn nazwiskoCol = new TableColumn("Nazwisko");
        nazwiskoCol.setCellValueFactory( new PropertyValueFactory<Employee, String>("nazwisko"));
        nazwiskoCol.setMinWidth(200);

        TableColumn imionaCol = new TableColumn("Imie");
        imionaCol.setCellValueFactory( new PropertyValueFactory<Employee, String>("imiona"));
        imionaCol.setMinWidth(200);

        TableColumn nrAkt = new TableColumn("Numer Akt");
        nrAkt.setCellValueFactory( new PropertyValueFactory<Employee, String>("nrAkt"));
        nrAkt.setMinWidth(100);

        TableColumn nrEwidencyjny = new TableColumn("Numer Ewidencyjny");
        nrEwidencyjny.setCellValueFactory( new PropertyValueFactory<Employee, Integer>("nrEwidencyjny"));
        nrEwidencyjny.setMinWidth(50);

        TableColumn kodUmowyOprace = new TableColumn("Kod umowy o pracę");
        kodUmowyOprace.setCellValueFactory( new PropertyValueFactory<Employee, String>("kodUmowyOprace"));
        kodUmowyOprace.setMinWidth(50);

        loadData();
        tableKadry.setItems(data);
        tableKadry.getColumns().addAll(nazwiskoCol, imionaCol, nrAkt, nrEwidencyjny, kodUmowyOprace);

        // ustawienie obsługi podwójnego kliknięcia
        tableKadry.setOnMouseClicked( event -> {
            if( event.getClickCount() == 2){
                try {
                    tableKadryDubleClicked();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //System.out.println(tableKadry.getSelectionModel().getSelectedItem());
            }
        });

    }
    private void tableKadryDubleClicked() throws Exception{
        // pokazujemy okienko z danymi danego pracownika
        FXMLLoader loader = new FXMLLoader(getClass().getResource("employee.fxml"));
        VBox vBox = (VBox) loader.load();


        ControllerEmployee controllerEmployee = loader.getController();
        controllerEmployee.setMainWindow(this);

        Scene scene = new Scene(vBox);
        Stage stage = new Stage();
        stage.setScene(scene);

        stage.setTitle(" Dane pracownika ");
        controllerEmployee.setEmployee((Employee) tableKadry.getSelectionModel().getSelectedItem());
        controllerEmployee.setFields();
        //stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

    }

    private void loadData(){
        data.addAll( new Employee("Kowalski", "Adam", "2/2019"),
                new Employee("Nowak", "Robert", "23/2008"),
                new Employee("Kowalski", "Marian", "45/1997"),
                new Employee("Świdzicki", "Jarosław", "34/2007"),
                new Employee("Roman", "Artur", "434/1994"));
    }
    //    public void setComboBoxes(){
//        // ustawienie wartości
//        String[] tableHours =  new String[24];
//        for (int i = 0; i < 24; i++) {
//            tableHours[i] = String.valueOf(i);
//        }
//        comboBoxEndHour.getItems().addAll(tableHours);
//        comboBoxEndHour.setValue(String.valueOf(rootWindow.localTimeEnd.getHour()));
//
//        comboBox1pHour.getItems().addAll(tableHours);
//        comboBox1pHour.setValue(String.valueOf(rootWindow.localTimeFirstBreak.getHour()));
//
//        comboBox2pHour.getItems().addAll(tableHours);
//        comboBox2pHour.setValue(String.valueOf(rootWindow.localTimeSecondBreak.getHour()));
//
//        comboBox3pHour.getItems().addAll(tableHours);
//        comboBox3pHour.setValue(String.valueOf(rootWindow.localTimeThirdBreak.getHour()));
//
//        String[] tableMin =  new String[60];
//        for (int i = 0; i < 60; i++) {
//            tableMin[i] = String.valueOf(i);
//        }
//        comboBoxEndMin.getItems().addAll(tableMin);
//        comboBoxEndMin.setValue(String.valueOf(rootWindow.localTimeEnd.getMinute()));
//        comboBoxEndSec.getItems().addAll(tableMin);
//        comboBoxEndSec.setValue(String.valueOf(rootWindow.localTimeEnd.getSecond()));
//
//        comboBox1pMin.getItems().addAll(tableMin);
//        comboBox1pMin.setValue(String.valueOf(rootWindow.localTimeFirstBreak.getMinute()));
//        comboBox1pSec.getItems().addAll(tableMin);
//        comboBox1pSec.setValue(String.valueOf(rootWindow.localTimeFirstBreak.getSecond()));
//
//        comboBox2pMin.getItems().addAll(tableMin);
//        comboBox2pMin.setValue(String.valueOf(rootWindow.localTimeSecondBreak.getMinute()));
//        comboBox2pSec.getItems().addAll(tableMin);
//        comboBox2pSec.setValue(String.valueOf(rootWindow.localTimeSecondBreak.getSecond()));
//
//        comboBox3pMin.getItems().addAll(tableMin);
//        comboBox3pMin.setValue(String.valueOf(rootWindow.localTimeThirdBreak.getMinute()));
//        comboBox3pSec.getItems().addAll(tableMin);
//        comboBox3pSec.setValue(String.valueOf(rootWindow.localTimeThirdBreak.getSecond()));
//
//    }
    public void buttonOkClicked(ActionEvent event) throws IOException {
//        rootWindow.localTimeEnd = LocalTime.of(Integer.valueOf(comboBoxEndHour.getValue()),
//                Integer.valueOf(comboBoxEndMin.getValue()),
//                Integer.valueOf(comboBoxEndSec.getValue()));
//        rootWindow.localTimeFirstBreak = LocalTime.of(Integer.valueOf(comboBox1pHour.getValue()),
//                Integer.valueOf(comboBox1pMin.getValue()),
//                Integer.valueOf(comboBox1pSec.getValue()));
//        rootWindow.localTimeSecondBreak = LocalTime.of(Integer.valueOf(comboBox2pHour.getValue()),
//                Integer.valueOf(comboBox2pMin.getValue()),
//                Integer.valueOf(comboBox2pSec.getValue()));
//        rootWindow.localTimeThirdBreak = LocalTime.of(Integer.valueOf(comboBox3pHour.getValue()),
//                Integer.valueOf(comboBox3pMin.getValue()),
//                Integer.valueOf(comboBox3pSec.getValue()));
//        rootWindow.saveTimesToFile();
//
        ((Button)event.getSource()).getScene().getWindow().hide();
//        buttonClose.getScene().getWindow().hide();

    }
    public void buttonCancelClicked(ActionEvent event){
        ((Button)event.getSource()).getScene().getWindow().hide();
    }
}
