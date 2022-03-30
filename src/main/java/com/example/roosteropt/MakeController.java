package com.example.roosteropt;

import com.example.roosteropt.ScreenController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;

public class MakeController extends ScreenController {

    @FXML
    protected void aval(ActionEvent event) {
        if (((ToggleButton)event.getSource()).getText().equals("avalible")) {
            ((ToggleButton)event.getSource()).setText("unavalible");
        } else {
            ((ToggleButton)event.getSource()).setText("avalible");
        }
    }

}
