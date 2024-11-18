
package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import co.edu.uniquindio.poo.model.NuevoUsado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class RegistrarVansLoginView {
   App app;
   InicioSesionController administradorController;

   @FXML // ResourceBundle that was given to the FXMLLoader
   private ResourceBundle resources;

   @FXML // URL location of the FXML file that was given to the FXMLLoader
   private URL location;

   @FXML // fx:id="txtModelo"
   private TextField txtModelo; // Value injected by FXMLLoader

   @FXML // fx:id="AireAcondicionadoCombo"
   private ComboBox<String> AireAcondicionadoCombo; // Value injected by FXMLLoader

   @FXML // fx:id="txtVelocidadMaxima"
   private TextField txtVelocidadMaxima; // Value injected by FXMLLoader

   @FXML // fx:id="ABSCombo"
   private ComboBox<String> ABSCombo; // Value injected by FXMLLoader

   @FXML // fx:id="txtCambios"
   private TextField txtCambios; // Value injected by FXMLLoader

   @FXML // fx:id="NuevoUsadoCombo"
   private ComboBox<NuevoUsado> NuevoUsadoCombo; // Value injected by FXMLLoader

   @FXML // fx:id="btnRegresar"
   private Button btnRegresar; // Value injected by FXMLLoader

   @FXML // fx:id="btnGuardar"
   private Button btnGuardar; // Value injected by FXMLLoader

   @FXML // fx:id="txtNumPuertas"
   private TextField txtNumPuertas; // Value injected by FXMLLoader

   @FXML // fx:id="txtCapacidadMaletero"
   private TextField txtCapacidadMaletero; // Value injected by FXMLLoader

   @FXML // fx:id="CamaraReveraCombo"
   private ComboBox<String> CamaraReveraCombo; // Value injected by FXMLLoader

   @FXML // fx:id="txtNumBolsasAire"
   private TextField txtNumBolsasAire; // Value injected by FXMLLoader

   @FXML // fx:id="txtCilindraje"
   private TextField txtCilindraje; // Value injected by FXMLLoader

   @FXML // fx:id="EstadoCombo"
   private ComboBox<String> EstadoCombo; // Value injected by FXMLLoader

   @FXML // fx:id="txtMarca"
   private TextField txtMarca; // Value injected by FXMLLoader

   @FXML // fx:id="TipoVinculoCombo"
   private ComboBox<String> TipoVinculoCombo; // Value injected by FXMLLoader

   @FXML // fx:id="txtNumPasajeros"
   private TextField txtNumPasajeros; // Value injected by FXMLLoader

   @FXML
   void GuardarAction(ActionEvent event) {

   }

   private void cargarCombos() {

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

   }

   @FXML
   void PaginaAnterior(ActionEvent event) {
      app.PaginaAnterior();
   }

   @FXML // This method is called by the FXMLLoader when initialization is complete
   void initialize() {
      assert txtModelo != null
            : "fx:id=\"txtModelo\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert AireAcondicionadoCombo != null
            : "fx:id=\"AireAcondicionadoCombo\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert txtVelocidadMaxima != null
            : "fx:id=\"txtVelocidadMaxima\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert ABSCombo != null
            : "fx:id=\"ABSCombo\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert txtCambios != null
            : "fx:id=\"txtCambios\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert NuevoUsadoCombo != null
            : "fx:id=\"NuevoUsadoCombo\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert btnRegresar != null
            : "fx:id=\"btnRegresar\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert btnGuardar != null
            : "fx:id=\"btnGuardar\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert txtNumPuertas != null
            : "fx:id=\"txtNumPuertas\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert txtCapacidadMaletero != null
            : "fx:id=\"txtCapacidadMaletero\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert CamaraReveraCombo != null
            : "fx:id=\"CamaraReveraCombo\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert txtNumBolsasAire != null
            : "fx:id=\"txtNumBolsasAire\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert txtCilindraje != null
            : "fx:id=\"txtCilindraje\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert EstadoCombo != null
            : "fx:id=\"EstadoCombo\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert txtMarca != null
            : "fx:id=\"txtMarca\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert TipoVinculoCombo != null
            : "fx:id=\"TipoVinculoCombo\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";
      assert txtNumPasajeros != null
            : "fx:id=\"txtNumPasajeros\" was not injected: check your FXML file 'RegistrarVansLoginView.fxml'.";

      cargarCombos();
   }

   public void setApp(App app) {
      this.app = app;
      administradorController = new InicioSesionController(app.getConcesionario());
   }
}
