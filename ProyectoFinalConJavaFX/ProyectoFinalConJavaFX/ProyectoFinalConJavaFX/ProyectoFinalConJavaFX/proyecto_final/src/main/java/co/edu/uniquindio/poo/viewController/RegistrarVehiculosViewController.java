package co.edu.uniquindio.poo.viewController;

 import java.net.URL;
 import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
 import javafx.scene.control.Button;
 
 public class RegistrarVehiculosViewController {
 App app;
  InicioSesionController administradorController;
     @FXML // ResourceBundle that was given to the FXMLLoader
     private ResourceBundle resources;
 
     @FXML // URL location of the FXML file that was given to the FXMLLoader
     private URL location;
 
     @FXML // fx:id="btnDeportivo"
     private Button btnDeportivo; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnCamioneta"
     private Button btnCamioneta; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnCamion"
     private Button btnCamion; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnBus"
     private Button btnBus; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnVan"
     private Button btnVan; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnPickup"
     private Button btnPickup; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnMoto"
     private Button btnMoto; // Value injected by FXMLLoader
 
     @FXML // fx:id="btnSedan"
     private Button btnSedan; // Value injected by FXMLLoader
     @FXML
    private Button btnRegresar;
    @FXML
    void PaginaAnterior(ActionEvent event) {
app.PaginaAnterior();
    }
 
     @FXML
     void CamionetaAction(ActionEvent event) {
      app.RegistrarCamioneta(); 
     }
 
     @FXML
     void SedanAction(ActionEvent event) {
      app.RegistrarSedan();
     }
 
     @FXML
     void DeportivoAction(ActionEvent event) {
      app.RegistrarDeportivo();
     }
 
     @FXML
     void BusAction(ActionEvent event) {
        app.RegistrarBus(); 
 
     }
 
     @FXML
     void CamionAction(ActionEvent event) {
      app.RegistrarCamion();
     }
 
     @FXML
     void VanAction(ActionEvent event) {
      app.RegistrarVan();
     }
 
     @FXML
     void PickupAction(ActionEvent event) {
      app.RegistrarPickUp();
     }
 
     @FXML
     void MotoAction(ActionEvent event) {
      app.RegistrarMoto();
     }
 
     @FXML // This method is called by the FXMLLoader when initialization is complete
     void initialize() {
         assert btnDeportivo != null : "fx:id=\"btnDeportivo\" was not injected: check your FXML file 'RegistrosComprasLoginView.fxml'.";
         assert btnCamioneta != null : "fx:id=\"btnCamioneta\" was not injected: check your FXML file 'RegistrosComprasLoginView.fxml'.";
         assert btnCamion != null : "fx:id=\"btnCamion\" was not injected: check your FXML file 'RegistrosComprasLoginView.fxml'.";
         assert btnBus != null : "fx:id=\"btnBus\" was not injected: check your FXML file 'RegistrosComprasLoginView.fxml'.";
         assert btnVan != null : "fx:id=\"btnVan\" was not injected: check your FXML file 'RegistrosComprasLoginView.fxml'.";
         assert btnPickup != null : "fx:id=\"btnPickup\" was not injected: check your FXML file 'RegistrosComprasLoginView.fxml'.";
         assert btnMoto != null : "fx:id=\"btnMoto\" was not injected: check your FXML file 'RegistrosComprasLoginView.fxml'.";
         assert btnSedan != null : "fx:id=\"btnSedan\" was not injected: check your FXML file 'RegistrosComprasLoginView.fxml'.";
 
     }
     public void setApp(App app) {
        this.app = app;
   
    }
 }