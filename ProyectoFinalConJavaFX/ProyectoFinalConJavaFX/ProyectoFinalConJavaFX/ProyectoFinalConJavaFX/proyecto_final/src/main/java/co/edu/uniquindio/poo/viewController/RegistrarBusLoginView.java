package co.edu.uniquindio.poo.viewController;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.model.NuevoUsado;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class RegistrarBusLoginView {
        App app;
        InicioSesionController administradorController;
         Concesionario concesionario = new Concesionario("Tu Carro UQ", "Calle 2", "310441", "mail");

         
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
    
        @FXML // fx:id="txtNumSalidas"
        private TextField txtNumSalidas; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtCambios"
        private TextField txtCambios; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnRegresar"
        private Button btnRegresar; // Value injected by FXMLLoader
    
        @FXML // fx:id="btnGuardar"
        private Button btnGuardar; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtNumeroPasajeros"
        private TextField txtNumeroPasajeros; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtNumeroEjes"
        private TextField txtNumeroEjes; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtCapacidadMaletero"
        private TextField txtCapacidadMaletero; // Value injected by FXMLLoader
    
        @FXML // fx:id="comboCamaraReversa"
        private ComboBox<String> comboCamaraReversa; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtNumBolsasAire"
        private TextField txtNumBolsasAire; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtVelocidadMax"
        private TextField txtVelocidadMax; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtCilindraje"
        private TextField txtCilindraje; // Value injected by FXMLLoader
    
        @FXML // fx:id="comboAireAcondicionado"
        private ComboBox<String> comboAireAcondicionado; // Value injected by FXMLLoader
    
        @FXML // fx:id="txtMarca"
        private TextField txtMarca; // Value injected by FXMLLoader
        @FXML
    void PaginaAnterior(ActionEvent event) {
     app.PaginaAnterior();
    }

    @FXML
    void GuardarAction(ActionEvent event) {

        
                String marca = txtMarca.getText();
                System.out.println(marca);
                String modelo = txtModelo.getText();
                System.out.println(modelo);
                int cambios = Integer.parseInt(txtCambios.getText());
                int velocidadMaxima = Integer.parseInt(txtVelocidadMax.getText());
                int cilindraje = Integer.parseInt(txtCilindraje.getText());
                int numeroPasajeros = Integer.parseInt(txtNumeroPasajeros.getText());
                int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
                int capacidadMaletero = Integer.parseInt(txtCapacidadMaletero.getText());
                int numeroBolsasAire = Integer.parseInt(txtNumBolsasAire.getText());
                int numeroEjes = Integer.parseInt(txtNumeroEjes.getText());
                int salidaEmergencia = Integer.parseInt(txtNumSalidas.getText());

                boolean aireAcondicionado = comboAireAcondicionado.getValue().equals("Sí");
                boolean camaraReversa = comboCamaraReversa.getValue().equals("Sí");
                boolean abs = comboAbs.getValue().equals("Sí");
                boolean es4X4 = combo4X4.getValue().equals("Sí");
                String nuevoUsado = comboNuevoUsado.getValue().toString();
                String estado = comboEstado.getValue();

             

                Bus bus1 = new Bus("Empleado1", "Placa1", marca, modelo, cambios, cilindraje, abs, nuevoUsado, "Diesel",
                                "Mecánica", true, false, false, estado, "Registrado", velocidadMaxima, numeroPasajeros,
                                numeroPuertas, capacidadMaletero, aireAcondicionado, camaraReversa, numeroBolsasAire,
                                numeroEjes, salidaEmergencia);
         

                concesionario.agregarBus(bus1);
       
                

                
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Vehículo Registrado");
                alert.setHeaderText(null);
                alert.setContentText("El vehículo ha sido registrado con éxito.");
                alert.showAndWait();

                concesionario.getDatosBus();

            
                txtMarca.clear();
                txtModelo.clear();
                txtCambios.clear();
                txtVelocidadMax.clear();
                txtCilindraje.clear();
                txtNumeroPasajeros.clear();
                txtNumeroPuertas.clear();
                txtCapacidadMaletero.clear();
                txtNumBolsasAire.clear();
                txtNumeroEjes.clear();
                txtNumSalidas.clear();
                comboAireAcondicionado.setValue(null);
                comboCamaraReversa.setValue(null);
                comboAbs.setValue(null);
                combo4X4.setValue(null);
                comboEstado.setValue(null);
                comboNuevoUsado.setValue(null);

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
   
    
        cargarCombos();
    }
        public void setApp(App app) {
        this.app = app;
        administradorController = new InicioSesionController(app.getConcesionario());
    }
    
}

