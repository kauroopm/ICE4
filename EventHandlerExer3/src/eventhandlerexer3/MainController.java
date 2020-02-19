 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandlerexer3;

import java.net.URL;
//import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
//import javafx.scene.control.ButtonType;
//import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author kauro
 */
public class MainController implements Initializable {

    @FXML
    private Button btnStart;
    @FXML
    private Button btnClear;
    @FXML
    private TextArea area;
    @FXML
    private Button btnParse;
    @FXML
    private TextField field;
    //@FXML
    //private Label lbl;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Attach event handler(s)
        btnStart.setOnAction(new StartHandler());
        btnClear.setOnAction(new ClearHandler());
        btnParse.setOnAction(new ParseHandler());

    }

    private void onStartClicked() {
        //Write text intp the text area
        area.setText("The quick brown fox jumps over the lazy dog.");

    }

    private void onClearClicked() {
        area.clear();
    }

    private void onParseClicked() {
        //Parse the text field into an integer and add 1
        String str = field.getText();

        int i = 0;
        try {
            i = Integer.parseInt(str);
            //label.setText("");
        } catch (NumberFormatException e) {
            //label.setText("Invalid Number entered , please try again");
            Alert alert = new Alert(AlertType.ERROR, "Invaid input entered, please try again!!"); // Msg to display
            //Optional<ButtonType> result = alert.showAndWait();
            alert.showAndWait();
            // Action to perform when OK is clicked goes here
            return;
        }

        i++;
        area.setText(" " + i);//put this into the try block to get rid from the exception or use the return in catch block for proper handeling
        //System.out.println(num);  
    }

    // Inner class 
    private class StartHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            onStartClicked();   // Call a method in the outer class
        }
    }

    private class ClearHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            onClearClicked();   // Call a method in the outer class
        }
    }

    private class ParseHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent e) {
            onParseClicked();   // Call a method in the outer class
        }
    }
}
