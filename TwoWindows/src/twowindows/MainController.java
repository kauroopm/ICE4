/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twowindows;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author kauro
 */
public class MainController implements Initializable {
    @FXML
    private TextField txtfld;
    @FXML
    private Button btnok;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnok.setOnAction(e -> onOkClicked());
    }    
    private void onOkClicked(){
        txtfld.setText("Java is cool");
    }
}
