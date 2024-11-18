package co.edu.uniquindio.poo.viewController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import co.edu.uniquindio.poo.model.NuevoUsado;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class RegistrarSedanLoginView {

        App app;
        InicioSesionController administradorController;
        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;

        @FXML // fx:id="combo4X4"
        private ComboBox<String> combo4X4; // Value injected by FXMLLoader

        @FXML // fx:id="txtModelo"
        private TextField txtModelo; // Value injected by FXMLLoader

        @FXML // fx:id="comboAbs"
        private ComboBox<String> comboAbs; // Value injected by FXMLLoader

        @FXML // fx:id="comboNuevoUsado"
        private ComboBox<NuevoUsado> comboNuevoUsado; // Value injected by FXMLLoader

        @FXML // fx:id="comboTipoVinculo"
        private ComboBox<String> comboTipoVinculo; // Value injected by FXMLLoader

        @FXML // fx:id="comboEstado"
        private ComboBox<String> comboEstado; // Value injected by FXMLLoader

        @FXML // fx:id="comboVelocidadCrucero"
        private ComboBox<String> comboVelocidadCrucero; // Value injected by FXMLLoader

        @FXML // fx:id="txtNumeroPuertas"
        private TextField txtNumeroPuertas; // Value injected by FXMLLoader

        @FXML // fx:id="txtCambios"
        private TextField txtCambios; // Value injected by FXMLLoader

        @FXML // fx:id="btnGuardar"
        private Button btnGuardar; // Value injected by FXMLLoader

        @FXML // fx:id="comboNumeroBolsasAire"
        private ComboBox<String> comboNumeroBolsasAire; // Value injected by FXMLLoader

        @FXML // fx:id="txtNumeroPasajeros"
        private TextField txtNumeroPasajeros; // Value injected by FXMLLoader

        @FXML // fx:id="txtCapacidadMaletero"
        private TextField txtCapacidadMaletero; // Value injected by FXMLLoader

        @FXML // fx:id="comboCamaraReversa"
        private ComboBox<String> comboCamaraReversa; // Value injected by FXMLLoader

        @FXML // fx:id="txtVelocidadMax"
        private TextField txtVelocidadMax; // Value injected by FXMLLoader

        @FXML // fx:id="txtCilindraje"
        private TextField txtCilindraje; // Value injected by FXMLLoader

        @FXML // fx:id="comboAireAcondicionado"
        private ComboBox<String> comboAireAcondicionado; // Value injected by FXMLLoader

        @FXML // fx:id="comboSensorColision"
        private ComboBox<String> comboSensorColision; // Value injected by FXMLLoader

        @FXML // fx:id="comboAsistentePermanencia"
        private ComboBox<String> comboAsistentePermanencia; // Value injected by FXMLLoader

        @FXML // fx:id="txtMarca"
        private TextField txtMarca; // Value injected by FXMLLoader

        @FXML // fx:id="comboSensorTrafico"
        private ComboBox<String> comboSensorTrafico; // Value injected by FXMLLoader
        @FXML
        private Button btnRegresar;

        @FXML
        void PaginaAnterior(ActionEvent event) {
                app.PaginaAnterior();
        }

        @FXML
        void GuerdarAction(ActionEvent event) {

        }

        private void cargarCombos() {

                ObservableList<String> opciones4X4 = FXCollections.observableArrayList("Sí", "No");
                combo4X4.setItems(opciones4X4);

                ObservableList<String> opcionesAbs = FXCollections.observableArrayList("Sí", "No");
                comboAbs.setItems(opcionesAbs);

                ObservableList<String> opcionesEstado = FXCollections.observableArrayList("Disponible",
                                "No Disponible");
                comboEstado.setItems(opcionesEstado);

                ObservableList<NuevoUsado> opcionesNuevoUsado = FXCollections.observableArrayList(NuevoUsado.values());
                comboNuevoUsado.setItems(opcionesNuevoUsado);

                ObservableList<String> opcionesTipoVinculo = FXCollections.observableArrayList("Registrado",
                                "Comprado");
                comboTipoVinculo.setItems(opcionesTipoVinculo);

                ObservableList<String> opcionesCaramaraReversa = FXCollections.observableArrayList("Sí", "No");
                comboCamaraReversa.setItems(opcionesCaramaraReversa);

                ObservableList<String> opcionesAireAcondicionado = FXCollections.observableArrayList("Sí", "No");
                comboAireAcondicionado.setItems(opcionesAireAcondicionado);

                ObservableList<String> opcionesVelocidadCrucero = FXCollections.observableArrayList("Sí", "No");
                comboVelocidadCrucero.setItems(opcionesVelocidadCrucero);

                ObservableList<String> opcionesSensorColision = FXCollections.observableArrayList("Sí", "No");
                comboSensorColision.setItems(opcionesSensorColision);

                ObservableList<String> opcionesAsistentePermanencia = FXCollections.observableArrayList("Sí", "No");
                comboAsistentePermanencia.setItems(opcionesAsistentePermanencia);

                ObservableList<String> opcionesSensorTrafico = FXCollections.observableArrayList("Sí", "No");
                comboSensorTrafico.setItems(opcionesSensorTrafico);

        }

        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
                assert combo4X4 != null
                                : "fx:id=\"combo4X4\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert txtModelo != null
                                : "fx:id=\"txtModelo\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert comboAbs != null
                                : "fx:id=\"comboAbs\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert comboNuevoUsado != null
                                : "fx:id=\"comboNuevoUsado\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert comboTipoVinculo != null
                                : "fx:id=\"comboTipoVinculo\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert comboEstado != null
                                : "fx:id=\"comboEstado\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert comboVelocidadCrucero != null
                                : "fx:id=\"comboVelocidadCrucero\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert txtNumeroPuertas != null
                                : "fx:id=\"txtNumeroPuertas\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert txtCambios != null
                                : "fx:id=\"txtCambios\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert btnGuardar != null
                                : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert comboNumeroBolsasAire != null
                                : "fx:id=\"comboNumeroBolsasAire\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert txtNumeroPasajeros != null
                                : "fx:id=\"txtNumeroPasajeros\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert txtCapacidadMaletero != null
                                : "fx:id=\"txtCapacidadMaletero\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert comboCamaraReversa != null
                                : "fx:id=\"comboCamaraReversa\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert txtVelocidadMax != null
                                : "fx:id=\"txtVelocidadMax\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert txtCilindraje != null
                                : "fx:id=\"txtCilindraje\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert comboAireAcondicionado != null
                                : "fx:id=\"comboAireAcondicionado\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert comboSensorColision != null
                                : "fx:id=\"comboSensorColision\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert comboAsistentePermanencia != null
                                : "fx:id=\"comboAsistentePermanencia\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert txtMarca != null
                                : "fx:id=\"txtMarca\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";
                assert comboSensorTrafico != null
                                : "fx:id=\"comboSensorTrafico\" was not injected: check your FXML file 'RegistrarSedanLoginView[1].fxml'.";

                cargarCombos();
        }

        public void setApp(App app) {
                this.app = app;
                administradorController = new InicioSesionController(app.getConcesionario());
        }
}
