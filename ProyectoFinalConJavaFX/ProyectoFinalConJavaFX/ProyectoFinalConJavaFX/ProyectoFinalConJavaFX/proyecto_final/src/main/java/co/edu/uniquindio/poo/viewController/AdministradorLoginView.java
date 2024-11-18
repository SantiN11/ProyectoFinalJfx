package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.event.ActionEvent;

public class AdministradorLoginView {
App app;
InicioSesionController administradorController;

@FXML // ResourceBundle that was given to the FXMLLoader
private ResourceBundle resources;

@FXML // URL location of the FXML file that was given to the FXMLLoader
private URL location;

@FXML // fx:id="btnVender"
private Button btnVender; // Value injected by FXMLLoader

@FXML // fx:id="btnRegistrar"
private Button btnRegistrar; // Value injected by FXMLLoader

@FXML
void RegistrarVehiculosAction(ActionEvent event) {

}

@FXML
void VenderVehiculosAction(ActionEvent event) {

}

@FXML // This method is called by the FXMLLoader when initialization is complete
void initialize() {
    assert btnVender != null : "fx:id=\"btnVender\" was not injected: check your FXML file 'AdministradorLoginView.fxml'.";
    assert btnRegistrar != null : "fx:id=\"btnRegistrar\" was not injected: check your FXML file 'AdministradorLoginView.fxml'.";

    }
     public void setApp(App app) {
        this.app = app;
        administradorController = new InicioSesionController(app.getConcesionario());
    }

}
