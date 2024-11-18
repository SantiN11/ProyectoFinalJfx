package co.edu.uniquindio.poo.viewController;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import co.edu.uniquindio.poo.model.Cliente;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RegistroClienteLoginViewController {
  App app;
        InicioSesionController empleadoController;
        ObservableList<Cliente> listClientes = FXCollections.observableArrayList();
    Cliente selectedCliente;
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="columNombre"
    private TableColumn<Cliente, String> columNombre; // Value injected by FXMLLoader

    @FXML // fx:id="btnLimpiar"
    private Button btnLimpiar; // Value injected by FXMLLoader

    @FXML // fx:id="columTelefono"
    private TableColumn<Cliente, String> columTelefono; // Value injected by FXMLLoader

    @FXML // fx:id="columCedula"
    private TableColumn<Cliente, String> columCedula; // Value injected by FXMLLoader

    @FXML // fx:id="txtCedula"
    private TextField txtCedula; // Value injected by FXMLLoader

    @FXML // fx:id="txtCorreo"
    private TextField txtCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="columCorreo"
    private TableColumn<Cliente, String> columCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="txtNombre"
    private TextField txtNombre; // Value injected by FXMLLoader
    @FXML
    private TableView<Cliente> tblListCliente;

    @FXML // fx:id="columApellido"
    private TableColumn<Cliente, String> columApellido; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegresar"
    private Button btnRegresar; // Value injected by FXMLLoader

    @FXML // fx:id="btnGuardar"
    private Button btnGuardar; // Value injected by FXMLLoader

    @FXML // fx:id="btnEliminar"
    private Button btnEliminar; // Value injected by FXMLLoader

    @FXML // fx:id="txtTelefono"
    private TextField txtTelefono; // Value injected by FXMLLoader

    @FXML // fx:id="txtApellido"
    private TextField txtApellido; // Value injected by FXMLLoader


    @FXML
    void guardarAction(ActionEvent event) {
        agregarCliente();
    }

    @FXML
    void limpiarAction(ActionEvent event) {
        limpiarSeleccion();
    }

    @FXML
    void eliminarAction(ActionEvent event) {
        eliminarCliente();
    }

    @FXML
    void PaginaAnterior(ActionEvent event) {
        app.PaginaAnterior();
    }
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        empleadoController = new InicioSesionController(app.concesionario);
        initView();

    }
 private void initView() {
        // Traer los datos del cliente a la tabla
        initDataBinding();

        // Obtiene la lista
        obtenerClientes();

        // Limpiar la tabla
        tblListCliente.getItems().clear();

        // Agregar los elementos a la tabla
        tblListCliente.setItems(listClientes);

        // Seleccionar elemento de la tabla
        listenerSelection();
    }

    private void initDataBinding() {
        columCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        columNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        columApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        columCorreo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
        columTelefono.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTelefono()));
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerClientes() {
        listClientes.addAll(empleadoController.obtenerListaClientes());
    }

    private void listenerSelection() {
        tblListCliente.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedCliente = newSelection;
            mostrarInformacionCliente(selectedCliente);
        });
    }

    private void mostrarInformacionCliente(Cliente cliente) {
        if (cliente != null) {
            txtCedula.setText(cliente.getCedula());
            txtNombre.setText(cliente.getNombre());
            txtApellido.setText(cliente.getApellido());
            txtTelefono.setText(cliente.getTelefono());
            txtCorreo.setText(cliente.getCorreo());
        }
    }

    private void agregarCliente() {
        Cliente cliente = buildCliente();
        if (empleadoController.crearCliente(cliente)) {
            listClientes.add(cliente);
            limpiarCamposCliente();
        }
    }

    private Cliente buildCliente() {
        Cliente cliente = new Cliente(txtNombre.getText(), txtApellido.getText(), txtCedula.getText(), txtTelefono.getText(), txtCorreo.getText());
        return cliente;
    }

    private void eliminarCliente() {
        if (empleadoController.eliminarCliente(txtCedula.getText())) {
            listClientes.remove(selectedCliente);
            limpiarCamposCliente();
            limpiarSeleccion();
        }
    }


    private void limpiarSeleccion() {
        tblListCliente.getSelectionModel().clearSelection();
        limpiarCamposCliente();
    }


    private void limpiarCamposCliente() {
        txtCedula.clear();
        txtNombre.clear();
        txtApellido.clear();
        txtTelefono.clear();
        txtCorreo.clear();
    }
    
    public void setApp(App app) {
        this.app = app;
   
    }
}