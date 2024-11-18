package co.edu.uniquindio.poo.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class EmpleadoLoginView {
App app;
InicioSesionController administradorController;
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnAlquilar"
    private Button btnAlquilar; // Value injected by FXMLLoader

    @FXML // fx:id="btnVender"
    private Button btnVender; // Value injected by FXMLLoader

    @FXML // fx:id="btnComprar"
    private Button btnComprar; // Value injected by FXMLLoader
    @FXML
    private Button btnRegistrarCliente;

    @FXML
    private Button btnRegistroTransaccion;

    @FXML // fx:id="btnRegistrar"
    private Button btnRegistrar; // Value injected by FXMLLoader

    @FXML
    void RegistrarVehiculosAction(ActionEvent event) {
        app.RegistrarVehiculosAction(); 
    }

    @FXML
    void AlquilarVehiculosAction(ActionEvent event) {
        app.AlquilarVehiculosAction();
    }

    @FXML
    void VenderVehiculosAction(ActionEvent event) {

    }

    @FXML
    void RegistrosAction(ActionEvent event) {

    }

    @FXML
    void RegistrarClienteAction(ActionEvent event) {
        app.RegistrarClienteAction();

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnAlquilar != null : "fx:id=\"btnAlquilar\" was not injected: check your FXML file 'empleadoLoginView.fxml'.";
        assert btnVender != null : "fx:id=\"btnVender\" was not injected: check your FXML file 'empleadoLoginView.fxml'.";
        assert btnComprar != null : "fx:id=\"btnComprar\" was not injected: check your FXML file 'empleadoLoginView.fxml'.";
        assert btnRegistrar != null : "fx:id=\"btnRegistrar\" was not injected: check your FXML file 'empleadoLoginView.fxml'.";

    }
    public void setApp(App app) {
        this.app = app;
   
    }
}

 
  



