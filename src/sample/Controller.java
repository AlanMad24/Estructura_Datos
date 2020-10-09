package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField  txtEdad;
    @FXML
    Label lbltitulo;


    public void evento1(ActionEvent event){
        int dias =Integer.parseInt(txtEdad.getText())*365;
        lbltitulo.setText("Has vivido"+dias+"dias");

    }
}
