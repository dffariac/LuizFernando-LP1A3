package com.example.javafx;

import com.example.javafx.Animal.Animal;
import com.example.javafx.Controller.Principal;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class JavaFXController {

    @FXML
    private ComboBox<Animal> comboBox;

    @FXML
    private TextArea textArea;

    @FXML
    protected void insertOnList(){
        Principal principal = new Principal();
        ObservableList<Animal> observableListAnimais = FXCollections.observableArrayList(principal.getAnimais());
        comboBox.setItems(observableListAnimais);
    }

    @FXML
    protected void onSelectButtonClick() {
        if (comboBox.getValue() != null){
           textArea.setText(comboBox.getValue().toStringAll());
        }
    }



}