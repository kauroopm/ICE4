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
    private Button button;
    @FXML
    private Button button1;
    @FXML
    private Label toplbl;
    @FXML
    private Label sublbl;
    @FXML
    private Label sublbl1;
    @FXML
    private Label sublbl2;
    @FXML
    private TextArea area;
    @FXML
    private TextField txtfield;
    @FXML
    private TextField txtfield1;
    Calculation Calc = new Calculation();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        button.setOnAction(new CalculateHandler());
        button1.setOnAction(new ClearHandler());
    }

    //method to display pi calculation in textarea
    private void onCalculateClicked() {
        String get1 = txtfield.getText();
        String get2 = txtfield1.getText();

        int handle;
        int handle1;

        //try and catch block for Exception Handling 
        try {
            handle = Integer.parseInt(get1);
            handle1 = Integer.parseInt(get2);
        } catch (NumberFormatException e) {
            sublbl2.setText("Invalid input entered , please enter valid input");
            return;
        }
        BigDecimal show = Calc.calculatePi(handle, handle1);
        area.setText(" " + show);
    }

    //method to clear everything in textarea and textfield and label when invalid statement occur
    private void onClearClicked() {
        area.clear();
        txtfield.clear();
        txtfield1.clear();
        sublbl2.setText(" ");
    }

    private class CalculateHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            onCalculateClicked();// Call a method in the outer class
        }
    }

    private class ClearHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            onClearClicked(); // Call a method in the outer class
        }
    }
}
