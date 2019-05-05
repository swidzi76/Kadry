package kadry;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerMain {

    public ImageView backgroundImage;
    public VBox vBox;

    final static public String TITLE = "Kadry i Płace";
    final static public String VER = "0.2";
    final static public String SETTINGS_FILE = "settings.txt";

    final static public String COLOR_BLACK = "#000000";
    final static public String COLOR_GREEN = "#00f56e";
    final static public String COLOR_RED = "#ff0000";


    // dane kolejnych spotkań w ramach kursu
    public ControllerMain() {
//        labelTimeToEnd.setTextFill(Paint.valueOf(COLOR_GREEN));
//        dateOfActivities = new ArrayList<>();
//        setDateOfActivities();
//        VBox.setMargin(vBox.getChildren().get(1), new Insets(vBox.getHeight() / 2,0,0,0));
    }

    @FXML
    public void buttonKadryClicked(ActionEvent event) throws Exception {
        // pokazanie okna z ustawieniami - kadry.fxml
        //FXMLLoader loader = new FXMLLoader(getClass().getResource("kadry.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("kadry.fxml"));
        VBox vBox = (VBox) loader.load();

        ControllerKadry controllerKadry = loader.getController();
        controllerKadry.setMainWindow(this);

        controllerKadry.setTable(); // ustawienien TABLICY i wczytanie danych
        Scene scene = new Scene(vBox);
        Stage stage = new Stage();
        stage.setScene(scene);

        stage.setTitle("Kadry ");
        //stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                // sprawdzenie czy zapisać
                controllerKadry.saveDataToFile();
            }
        });
    }

    @FXML
    void buttonOprogramieClicked(ActionEvent event) throws Exception{
        // stworzenia okienka z nazwa firmy i wersją programu
        FXMLLoader loader = new FXMLLoader(getClass().getResource("oProgramie.fxml"));
        VBox vBox = (VBox) loader.load();

        ControllerOprogramie controllerOprogramie = loader.getController();
        controllerOprogramie.setMainWindow(this);
        controllerOprogramie.setVersion();
        Scene scene = new Scene(vBox);
        Stage stage = new Stage();
        stage.setScene(scene);

        stage.setTitle("O programie ");
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();

    }
//    public void buttonDefaultSettingsClicked(ActionEvent event) throws IOException{
//        defaultTime();
//        saveTimesToFile();
//    }

    private void setLabel(Label label, Duration duration){
        int hour=0, min=0, sec=0;
        if(duration.getSeconds()>=0){
            int getSec = (int) duration.getSeconds() + 1;
            hour = getSec / 3600;
            min = (getSec - hour*3600) / 60;
            sec = getSec - hour *3600 - min * 60;
//            hour = (int) duration.toHours();
//            min = (int) (duration.toMinutes() - hour*60);
//            sec = (int) (duration.getSeconds()- hour*3600 - min*60 + 1);
            label.setTextFill(Paint.valueOf(COLOR_GREEN));
        }else{
            label.setTextFill(Paint.valueOf(COLOR_RED));
        }
        label.setText(timeToStr(hour, min, sec));

    }
    private String timeToStr(int hour, int min, int sec){
        String stringHour;
        if(hour < 10){
            stringHour = "0" + hour;
        }else{
            stringHour = "" + hour;
        }
        String stringMin;
        if(min < 10){
            stringMin = "0" + min;
        }else{
            stringMin = "" + min;
        }
        String stringSec;
        if(sec < 10){
            stringSec = "0" + sec;
        }else{
            stringSec = "" + sec;
        }
        return stringHour + " : " + stringMin + " : " + stringSec;

    }

//    public void saveTimesToFile() throws IOException{
//        PrintWriter printWriter = new PrintWriter(new FileWriter(SETTINGS_FILE));
//        printWriter.println(""+localTimeFirstBreak.getHour()+","+localTimeFirstBreak.getMinute()+","+localTimeFirstBreak.getSecond());
//        printWriter.println(""+localTimeSecondBreak.getHour()+","+localTimeSecondBreak.getMinute()+","+localTimeSecondBreak.getSecond());
//        printWriter.println(""+localTimeThirdBreak.getHour()+","+localTimeThirdBreak.getMinute()+","+localTimeThirdBreak.getSecond());
//        printWriter.println(""+localTimeEnd.getHour()+","+localTimeEnd.getMinute()+","+localTimeEnd.getSecond());
//        printWriter.close();
//    }
//    public void readTimesFromFile(){
//        String s1;
//        String[] as;
//        int h,m,s;
//        try (Scanner scanner = new Scanner(new File(SETTINGS_FILE))) {
//            s1 = scanner.nextLine();
//            as = s1.split(",");
//            h = Integer.valueOf(as[0]);
//            m = Integer.valueOf(as[1]);
//            s = Integer.valueOf(as[2]);
//            localTimeFirstBreak = LocalTime.of(h,m,s);
//
//            s1 = scanner.nextLine();
//            as = s1.split(",");
//            h = Integer.valueOf(as[0]);
//            m = Integer.valueOf(as[1]);
//            s = Integer.valueOf(as[2]);
//            localTimeSecondBreak = LocalTime.of(h,m,s);
//
//            s1 = scanner.nextLine();
//            as = s1.split(",");
//            h = Integer.valueOf(as[0]);
//            m = Integer.valueOf(as[1]);
//            s = Integer.valueOf(as[2]);
//            localTimeThirdBreak = LocalTime.of(h,m,s);
//
//            s1 = scanner.nextLine();
//            as = s1.split(",");
//            h = Integer.valueOf(as[0]);
//            m = Integer.valueOf(as[1]);
//            s = Integer.valueOf(as[2]);
//            localTimeEnd = LocalTime.of(h,m,s);
//
//
//        } catch (IOException e) {
//            System.out.println("IOException!");
//        }

//    }

}
