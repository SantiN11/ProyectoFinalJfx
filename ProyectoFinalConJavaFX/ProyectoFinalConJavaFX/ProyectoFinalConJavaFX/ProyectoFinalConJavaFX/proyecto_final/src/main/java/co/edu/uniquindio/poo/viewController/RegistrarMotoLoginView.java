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

public class RegistrarMotoLoginView {
        App app;
        InicioSesionController administradorController;

        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;

        @FXML // fx:id="txtCambios"
        private TextField txtCambios; // Value injected by FXMLLoader

        @FXML // fx:id="NuevoUsadoCombo"
        private ComboBox<NuevoUsado> NuevoUsadoCombo; // Value injected by FXMLLoader

        @FXML // fx:id="txtModelo"
        private TextField txtModelo; // Value injected by FXMLLoader

        @FXML // fx:id="btnGuardar"
        private Button btnGuardar; // Value injected by FXMLLoader

        @FXML // fx:id="txtCilindraje"
        private TextField txtCilindraje; // Value injected by FXMLLoader

        @FXML // fx:id="EstadoCombo"
        private ComboBox<String> EstadoCombo; // Value injected by FXMLLoader

        @FXML // fx:id="txtMarca"
        private TextField txtMarca; // Value injected by FXMLLoader

        @FXML // fx:id="TipoVinculoCombo"
        private ComboBox<String> TipoVinculoCombo; // Value injected by FXMLLoader

        @FXML // fx:id="txtVelocidadMaxima"
        private TextField txtVelocidadMaxima; // Value injected by FXMLLoader
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

                ObservableList<String> opcionesEstado = FXCollections.observableArrayList("Disponible",
                                "No Disponible");
                EstadoCombo.setItems(opcionesEstado);

                ObservableList<NuevoUsado> opcionesNuevoUsado = FXCollections.observableArrayList(NuevoUsado.values());
                NuevoUsadoCombo.setItems(opcionesNuevoUsado);

                ObservableList<String> opcionesTipoVinculo = FXCollections.observableArrayList("Registrado",
                                "Comprado");
                TipoVinculoCombo.setItems(opcionesTipoVinculo);

        }

        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
                assert txtCambios != null
                                : "fx:id=\"txtCambios\" was not injected: check your FXML file 'RegistrarMotoLoginView.fxml'.";
                assert NuevoUsadoCombo != null
                                : "fx:id=\"NuevoUsadoCombo\" was not injected: check your FXML file 'RegistrarMotoLoginView.fxml'.";
                assert txtModelo != null
                                : "fx:id=\"txtModelo\" was not injected: check your FXML file 'RegistrarMotoLoginView.fxml'.";
                assert btnGuardar != null
                                : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'RegistrarMotoLoginView.fxml'.";
                assert txtCilindraje != null
                                : "fx:id=\"txtCilindraje\" was not injected: check your FXML file 'RegistrarMotoLoginView.fxml'.";
                assert EstadoCombo != null
                                : "fx:id=\"EstadoCombo\" was not injected: check your FXML file 'RegistrarMotoLoginView.fxml'.";
                assert txtMarca != null
                                : "fx:id=\"txtMarca\" was not injected: check your FXML file 'RegistrarMotoLoginView.fxml'.";
                assert TipoVinculoCombo != null
                                : "fx:id=\"TipoVinculoCombo\" was not injected: check your FXML file 'RegistrarMotoLoginView.fxml'.";
                assert txtVelocidadMaxima != null
                                : "fx:id=\"txtVelocidadMaxima\" was not injected: check your FXML file 'RegistrarMotoLoginView.fxml'.";

                cargarCombos();
        }

        public void setApp(App app) {
                this.app = app;
                administradorController = new InicioSesionController(app.getConcesionario());
        }
}
