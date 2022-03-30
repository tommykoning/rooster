package com.example.roosteropt;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController extends ScreenController {


    @FXML
    private Label welcomeText;
    private Button make;
    private Button view;

    @FXML
    public static FXMLLoader scene() {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Menu-view.fxml"));
        return fxmlLoader;
    }
}