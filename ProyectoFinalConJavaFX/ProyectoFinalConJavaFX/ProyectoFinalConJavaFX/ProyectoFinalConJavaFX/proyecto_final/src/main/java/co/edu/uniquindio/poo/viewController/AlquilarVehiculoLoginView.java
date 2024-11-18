package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class AlquilarVehiculoLoginView {
App app;
InicioSesionController administradorController;
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtPlacaVehiculo"
    private TextField txtPlacaVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="btnGuardar"
    private Button btnGuardar; // Value injected by FXMLLoader

    @FXML // fx:id="txtNombreCliente"
    private TextField txtNombreCliente; // Value injected by FXMLLoader

    @FXML
    void GuardarAction(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtPlacaVehiculo != null
                : "fx:id=\"txtPlacaVehiculo\" was not injected: check your FXML file 'AlquilarVehiculoLoginView.fxml'.";
        assert btnGuardar != null
                : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'AlquilarVehiculoLoginView.fxml'.";
        assert txtNombreCliente != null
                : "fx:id=\"txtNombreCliente\" was not injected: check your FXML file 'AlquilarVehiculoLoginView.fxml'.";

    }
    public void setApp(App app) {
        this.app = app;
   
    }
}
