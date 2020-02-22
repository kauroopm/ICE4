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
    private TextArea area;
    @FXML
    private TextField txtfield;
    @FXML
    private TextField txtfield1;
    Calculation Calc = new Calculation();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        button.setOnAction(new CalHandler());
        button1.setOnAction(new ClrHandler());
    }

    //method to perform an action when Calculate button is clicked
    private void onCalClicked() {
        int get1 = Integer.parseInt(txtfield.getText());
        int get2 = Integer.parseInt(txtfield1.getText());

        BigDecimal show = Calc.calculatePi(get1, get2);
        area.setText(" " + show);
    }

    //method to clear everything in textarea and textfield
    private void onClrClicked() {
        area.clear();
        txtfield.clear();
        txtfield1.clear();
    }

    private class CalHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            onCalClicked();// Call a method in the outer class
        }
    }

    private class ClrHandler implements EventHandler<ActionEvent> {
      
        public void handle(ActionEvent e) {
            onClrClicked(); // Call a method in the outer class
        }
    }
}
