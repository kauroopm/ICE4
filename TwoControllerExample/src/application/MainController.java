package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController implements Initializable {

    // These fields are linked with the GUI objects with fx:id corresponding to the variable name
    @FXML private TextField text1;
    @FXML private Button btnOK;
    @FXML private Button btnOpenSesame;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Attach event handler(s)
        btnOK.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                onOkClicked();    // Always call a method in the outer class
            }
        });
        
        btnOpenSesame.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                onOpenSesameClicked();    // Always call a method in the outer class
            }
        });
        
    }    


    // Click handler for OK button
    private void onOkClicked() {
        text1.setText("Java is cool");
    }

    // Click handler for Open Sesame button
    private void onOpenSesameClicked() {
        // Open the second window (stage)
        try {        
            Parent root = FXMLLoader.load(getClass().getResource("Second.fxml"));
            Scene scene = new Scene(root);
            
            Stage secondStage = new Stage();
            secondStage.setScene(scene);
            secondStage.initModality(Modality.APPLICATION_MODAL);  // Use this to make the 2nd window modal (must close 2nd window to return to main window)
            secondStage.show();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
