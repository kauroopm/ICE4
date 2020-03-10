package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SecondController implements Initializable {

    @FXML private Button btnClose;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Attach event handler(s)
        btnClose.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                onCloseClicked();    // Always call a method in the outer class
            }
        });
    }

    // Event handlers

    private void onCloseClicked() {
        // Get a reference to the stage
        Stage stage = (Stage) btnClose.getScene().getWindow();
        // Close this window
        stage.close();
    }

}
