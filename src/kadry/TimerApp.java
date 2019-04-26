package kadry;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Duration;

import java.io.File;

public class TimerApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader(getClass().getResource("timer.fxml"));
        VBox vBox = loader.load();
        ControllerTimer controller = loader.getController();

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);

        primaryStage.setTitle(ControllerTimer.TITLE + " v. " + ControllerTimer.VER);
        primaryStage.setMaximized(true);
        primaryStage.setResizable(false);
        primaryStage.show();


//        controller.localTimeEnd = LocalTime.of(16,00,00);
//        controller.localTimeFirstBreak = LocalTime.of(10,30,00);
//        controller.localTimeSecondBreak = LocalTime.of(12,30,00);
//        controller.localTimeThirdBreak = LocalTime.of(14,30,00);
        //wczytaj dane z pliku
        // czy plik istnieje
        File file = new File(controller.SETTINGS_FILE);
        if(!file.exists()){
            controller.defaultTime();
            controller.saveTimesToFile();
        }

        controller.readTimesFromFile();
//        controller.saveTimesToFile();
        Timeline timeline = new Timeline(new KeyFrame(
                Duration.millis(1000),
                ae -> controller.setLabels()));
        timeline.setCycleCount(Animation.INDEFINITE);
//        timeline.play();






        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                timeline.stop();
                Platform.exit();
                System.exit(0);
            }
        });
//
    }
}
