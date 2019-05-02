package kadry;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerOprogramie {
    @FXML
    private Label labelOprogramie = new Label();
    private ControllerMain rootWindow;
    public void setMainWindow(ControllerMain rootWindow){
        this.rootWindow = rootWindow;
    }
    public void setVersion(){
        labelOprogramie.setText(ControllerMain.TITLE + " ver."+ControllerMain.VER);
    }
}
