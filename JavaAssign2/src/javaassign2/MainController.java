/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassign2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author kauro
 */
public class MainController implements Initializable {

    @FXML
    private Button btnCal;
    @FXML
    private Button btnClr;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private TextArea area;
    @FXML
    private TextField field1;
    @FXML
    private TextField field2;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnCal.setOnAction(new CalHandler());
        btnClr.setOnAction(new ClrHandler());
    }

    private class CalHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            // Call a method in the outer class
        }
    }

    private class ClrHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            // Call a method in the outer class
        }
    }
}
