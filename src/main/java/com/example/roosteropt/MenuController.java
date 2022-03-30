package com.example.roosteropt;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void make() {
        welcomeText.setText("dit hoort naar make te lijden");
    }

    @FXML
    protected void view() {
        welcomeText.setText("dit hoort naar view te lijden");
    }
}