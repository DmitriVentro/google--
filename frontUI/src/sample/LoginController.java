package sample;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.prism.paint.LinearGradient;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Stop;

import java.awt.Color;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane pain;

    @FXML
    void initialize() {
        assert pain != null : "fx:id=\"pain\" was not injected: check your FXML file 'sample.fxml'.";
    }
}
