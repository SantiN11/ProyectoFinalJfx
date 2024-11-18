package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.InicioSesionController;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;

public class LoginViewController {

    InicioSesionController administradorController;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtContraseña"
    private TextField txtContraseña; // Value injected by FXMLLoader

    @FXML // fx:id="btnIniciarSesion"
    private Button btnIniciarSesion; // Value injected by FXMLLoader

    @FXML // fx:id="txtCorreo"
    private TextField txtCorreo; // Value injected by FXMLLoader

    @SuppressWarnings("unused")
     App app;
     

     @FXML
     void iniciarSesionAction(ActionEvent event) {
         String correo = txtCorreo.getText();
         String contraseña = txtContraseña.getText();
         boolean validado = validarDatos(correo, contraseña);
     
         if (validado) {
             String rolUsuario = administradorController.iniciarSesion(correo, contraseña);
             if (rolUsuario != null) {
                 switch (rolUsuario) {
                     case "ADMIN":
                         mostrarMensaje("Éxito", "Inicio de sesión exitoso", "Bienvenido, administrador.", AlertType.INFORMATION);
                         app.cargarVistaAdmin(); // Método para cargar la vista del admin
                         break;
     
                     case "EMPLEADO":
                         mostrarMensaje("Éxito", "Inicio de sesión exitoso", "Bienvenido, empleado.", AlertType.INFORMATION);
                         app.cargarVistaEmpleado(); // Método para cargar la vista del empleado
                         break;
     
                     default:
                         mostrarMensaje("Error", "Rol no reconocido", "No se pudo identificar el rol del usuario.", AlertType.ERROR);
                 }
             } else {
                 mostrarMensaje("Error", "Credenciales incorrectas", "El correo o la contraseña son incorrectos.", AlertType.ERROR);
             }
         } else {
             mostrarMensaje("Error", "Datos inválidos", "Por favor, ingresa todos los campos correctamente.", AlertType.WARNING);
         }
     }
  

    public void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(titulo);
        alert.setHeaderText(header);
        alert.setContentText(contenido);
        alert.showAndWait();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtContraseña != null
                : "fx:id=\"txtContraseña\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert btnIniciarSesion != null
                : "fx:id=\"btnIniciarSesion\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert txtCorreo != null : "fx:id=\"txtCorreo\" was not injected: check your FXML file 'LoginView.fxml'.";
    }

    private boolean validarDatos(String correo, String contraseña) {
        if (correo.isEmpty()) {
            txtCorreo.setTooltip(new Tooltip("Correo Invalido"));
            return false;
        }
        if (contraseña.isEmpty()) {
            txtContraseña.setTooltip(new Tooltip("Contraseña Invalida"));
            return false;
        }
        return true;

    }

    public void setApp(App app) {
        this.app = app;
        administradorController = new InicioSesionController(app.getConcesionario());
    }
}
