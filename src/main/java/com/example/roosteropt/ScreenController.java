package com.example.roosteropt;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ScreenController {
   private Stage stage;
   private Scene scene;
   private Parent root;

   public void sceneLoad(ActionEvent event) throws IOException {
       String url = ((Button)event.getSource()).getId();
       Parent root = FXMLLoader.load(getClass().getResource(url + "-view.fxml"));
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
   }
}