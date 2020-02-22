/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassign2;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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
    Calculation Calc = new Calculation();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnCal.setOnAction(new CalHandler());
        btnClr.setOnAction(new ClrHandler());
    }

    private void onCalculateClicked() {
        int get1 = Integer.parseInt(field1.getText());
        int get2 = Integer.parseInt(field2.getText());

        int x;
        int y;
        try {
            x = Integer.parseInt(get1);
            y = Integer.parseInt(get2);
            //label.setText("");
        } catch (NumberFormatException e) {
            //label.setText("Invalid Number entered , please try again");
            Alert alert = new Alert(Alert.AlertType.ERROR, "Invaid input entered, please try again!!"); // Msg to display
            //Optional<ButtonType> result = alert.showAndWait();
            alert.showAndWait();
            // Action to perform when OK is clicked goes here
            return;
        }
        BigDecimal roop = Calc.calculatePi(get1,get2);
        area.setText(" " + roop);
    }

    private void onClearClicked() {
        area.clear();
        field1.clear();
        field2.clear();
    }

    private class CalHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            onCalculateClicked();// Call a method in the outer class
        }
    }

    private class ClrHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            onClearClicked(); // Call a method in the outer class
        }
    }
}
