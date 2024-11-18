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

public class RegistrarPickUpsLoginView {
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

        @FXML // fx:id="txtNumeroPuertas"
        private TextField txtNumeroPuertas; // Value injected by FXMLLoader

        @FXML // fx:id="txtCapacidadCarga"
        private TextField txtCapacidadCarga; // Value injected by FXMLLoader

        @FXML // fx:id="txtCambios"
        private TextField txtCambios; // Value injected by FXMLLoader

        @FXML // fx:id="btnGuardar"
        private Button btnGuardar; // Value injected by FXMLLoader

        @FXML // fx:id="comboNumeroBolsasAire"
        private ComboBox<String> comboNumeroBolsasAire; // Value injected by FXMLLoader

        @FXML // fx:id="txtNumeroPasajeros"
        private TextField txtNumeroPasajeros; // Value injected by FXMLLoader

        @FXML // fx:id="comboNumeroSalidas"
        private ComboBox<String> comboNumeroSalidas; // Value injected by FXMLLoader

        @FXML // fx:id="comboCamaraReversa"
        private ComboBox<String> comboCamaraReversa; // Value injected by FXMLLoader

        @FXML // fx:id="txtVelocidadMax"
        private TextField txtVelocidadMax; // Value injected by FXMLLoader

        @FXML // fx:id="txtCilindraje"
        private TextField txtCilindraje; // Value injected by FXMLLoader

        @FXML // fx:id="comboAireAcondicionado"
        private ComboBox<String> comboAireAcondicionado; // Value injected by FXMLLoader

        @FXML // fx:id="txtMarca"
        private TextField txtMarca; // Value injected by FXMLLoader
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

        }

        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
                assert combo4X4 != null
                                : "fx:id=\"combo4X4\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert txtModelo != null
                                : "fx:id=\"txtModelo\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert comboAbs != null
                                : "fx:id=\"comboAbs\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert comboNuevoUsado != null
                                : "fx:id=\"comboNuevoUsado\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert comboTipoVinculo != null
                                : "fx:id=\"comboTipoVinculo\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert comboEstado != null
                                : "fx:id=\"comboEstado\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert txtNumeroPuertas != null
                                : "fx:id=\"txtNumeroPuertas\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert txtCapacidadCarga != null
                                : "fx:id=\"txtCapacidadCarga\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert txtCambios != null
                                : "fx:id=\"txtCambios\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert btnGuardar != null
                                : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert comboNumeroBolsasAire != null
                                : "fx:id=\"comboNumeroBolsasAire\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert txtNumeroPasajeros != null
                                : "fx:id=\"txtNumeroPasajeros\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert comboNumeroSalidas != null
                                : "fx:id=\"comboNumeroSalidas\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert comboCamaraReversa != null
                                : "fx:id=\"comboCamaraReversa\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert txtVelocidadMax != null
                                : "fx:id=\"txtVelocidadMax\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert txtCilindraje != null
                                : "fx:id=\"txtCilindraje\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert comboAireAcondicionado != null
                                : "fx:id=\"comboAireAcondicionado\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";
                assert txtMarca != null
                                : "fx:id=\"txtMarca\" was not injected: check your FXML file 'RegistrarPickUpsLoginView.fxml'.";

                cargarCombos();
        }

        public void setApp(App app) {
                this.app = app;
                administradorController = new InicioSesionController(app.getConcesionario());
        }
}
