/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twowindows;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author kauro
 */
public class MainController implements Initializable {

    @FXML
    private TextField txtfld;
    @FXML
    private Button btnok;
    @FXML
    private Button openbtn;
   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnok.setOnAction(e -> onOkClicked());
        openbtn.setOnAction(e -> onOpenClicked());
    }

    private void onOkClicked() {
        txtfld.setText("Java is cool, but FXML is annoying!!");
    }

    private void onOpenClicked() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("Second.fxml"));

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.show();
        } catch (IOException e) {
            System.out.println("Exception occured loading second.fxml!!");
        }

    }
}
