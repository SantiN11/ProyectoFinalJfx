package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import co.edu.uniquindio.poo.model.NuevoUsado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class RegistrarCamionetaLoginView {
App app;
InicioSesionController administradorController;
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="VelocidadCruceroCombo"
    private ComboBox<String> VelocidadCruceroCombo; // Value injected by FXMLLoader

    @FXML // fx:id="NumBolsasAireCombo"
    private ComboBox<String> NumBolsasAireCombo; // Value injected by FXMLLoader

    @FXML // fx:id="combo4X4"
    private ComboBox<String> combo4X4; // Value injected by FXMLLoader

    @FXML // fx:id="txtModelo"
    private TextField txtModelo; // Value injected by FXMLLoader

    @FXML // fx:id="AireAcondicionadoCombo"
    private ComboBox<String> AireAcondicionadoCombo; // Value injected by FXMLLoader

    @FXML // fx:id="SensorTraficoCombo"
    private ComboBox<String> SensorTraficoCombo; // Value injected by FXMLLoader

    @FXML // fx:id="ABSCombo"
    private ComboBox<String> ABSCombo; // Value injected by FXMLLoader

    @FXML // fx:id="txtCambios"
    private TextField txtCambios; // Value injected by FXMLLoader

    @FXML // fx:id="NuevoUsadoCombo"
    private ComboBox<NuevoUsado> NuevoUsadoCombo; // Value injected by FXMLLoader

    @FXML // fx:id="btnGuardar"
    private Button btnGuardar; // Value injected by FXMLLoader

    @FXML // fx:id="CamaraReveraCombo"
    private ComboBox<String> CamaraReveraCombo; // Value injected by FXMLLoader

    @FXML // fx:id="EstadoCombo"
    private ComboBox<String> EstadoCombo; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarca"
    private TextField txtMarca; // Value injected by FXMLLoader

    @FXML // fx:id="AsistentePermanenciaCombo"
    private ComboBox<String> AsistentePermanenciaCombo; // Value injected by FXMLLoader

    @FXML // fx:id="TipoVinculoCombo"
    private ComboBox<String> TipoVinculoCombo; // Value injected by FXMLLoader

    @FXML // fx:id="SensorColisionCombo"
    private ComboBox<String> SensorColisionCombo; // Value injected by FXMLLoader
    @FXML
    private Button btnRegresar;
    @FXML
    void PaginaAnterior(ActionEvent event) {
     app.PaginaAnterior();
    }

    @FXML
    void GuardarAction(ActionEvent event) {

    }

    private void cargarCombos() {
    
                ObservableList<String> opciones4X4 = FXCollections.observableArrayList("Sí", "No");
                combo4X4.setItems(opciones4X4);

      
                ObservableList<String> opcionesAbs = FXCollections.observableArrayList("Sí", "No");
                ABSCombo.setItems(opcionesAbs);

                ObservableList<String> opcionesEstado = FXCollections.observableArrayList("Disponible",
                                "No Disponible");
                EstadoCombo.setItems(opcionesEstado);

                ObservableList<NuevoUsado> opcionesNuevoUsado = FXCollections.observableArrayList(NuevoUsado.values());
                NuevoUsadoCombo.setItems(opcionesNuevoUsado);

                ObservableList<String> opcionesTipoVinculo = FXCollections.observableArrayList("Registrado",
                                "Comprado");
                TipoVinculoCombo.setItems(opcionesTipoVinculo);

                ObservableList<String> opcionesCaramaraReversa = FXCollections.observableArrayList("Sí", "No");
                CamaraReveraCombo.setItems(opcionesCaramaraReversa);

                ObservableList<String> opcionesAireAcondicionado = FXCollections.observableArrayList("Sí", "No");
                AireAcondicionadoCombo.setItems(opcionesAireAcondicionado);

                ObservableList<String> opcionesVelocidadCrucero = FXCollections.observableArrayList("Sí", "No");
                VelocidadCruceroCombo.setItems(opcionesVelocidadCrucero);

                ObservableList<String> opcionesSensorTrafico = FXCollections.observableArrayList("Sí", "No");
                SensorTraficoCombo.setItems(opcionesSensorTrafico);

                ObservableList<String> opcionesAsistentePermanencia = FXCollections.observableArrayList("Sí", "No");
                AsistentePermanenciaCombo.setItems(opcionesAsistentePermanencia);

                ObservableList<String> opcionesSensorColision = FXCollections.observableArrayList("Sí", "No");
                SensorColisionCombo.setItems(opcionesSensorColision);
        }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert VelocidadCruceroCombo != null
                : "fx:id=\"VelocidadCruceroCombo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert NumBolsasAireCombo != null
                : "fx:id=\"NumBolsasAireCombo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert combo4X4 != null
                : "fx:id=\"combo4X4\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert txtModelo != null
                : "fx:id=\"txtModelo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert AireAcondicionadoCombo != null
                : "fx:id=\"AireAcondicionadoCombo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert SensorTraficoCombo != null
                : "fx:id=\"SensorTraficoCombo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert ABSCombo != null
                : "fx:id=\"ABSCombo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert txtCambios != null
                : "fx:id=\"txtCambios\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert NuevoUsadoCombo != null
                : "fx:id=\"NuevoUsadoCombo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert btnGuardar != null
                : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert CamaraReveraCombo != null
                : "fx:id=\"CamaraReveraCombo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert EstadoCombo != null
                : "fx:id=\"EstadoCombo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert txtMarca != null
                : "fx:id=\"txtMarca\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert AsistentePermanenciaCombo != null
                : "fx:id=\"AsistentePermanenciaCombo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert TipoVinculoCombo != null
                : "fx:id=\"TipoVinculoCombo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";
        assert SensorColisionCombo != null
                : "fx:id=\"SensorColisionCombo\" was not injected: check your FXML file 'RegistrarCamionetaLoginView.fxml'.";

                cargarCombos();
    }
     public void setApp(App app) {
        this.app = app;
        administradorController = new InicioSesionController(app.getConcesionario());
    }
}
