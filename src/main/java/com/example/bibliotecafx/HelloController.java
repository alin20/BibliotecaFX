package com.example.bibliotecafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
//    @FXML
//    private Label formular;
    @FXML
    private TextField numeTextField;
    @FXML
    private TextField parolaTextField;

    @FXML
    protected void autentificare() throws IOException {
        //formular.setText("Welcome to JavaFX Application!");

        if ("xxx".equals(numeTextField.getText().trim()) && "xxx".equals(parolaTextField.getText().trim())) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("formular_bibliotecar.fxml"));
            try {
                Parent root = fxmlLoader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage) numeTextField.getScene().getWindow(); // Obține fereastra curentă
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if ("yyy".equals(numeTextField.getText().trim()) && "yyy".equals(parolaTextField.getText().trim())) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("formular_abonat.fxml"));
            try {
                Parent root = fxmlLoader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage) numeTextField.getScene().getWindow(); // Obține fereastra curentă
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}