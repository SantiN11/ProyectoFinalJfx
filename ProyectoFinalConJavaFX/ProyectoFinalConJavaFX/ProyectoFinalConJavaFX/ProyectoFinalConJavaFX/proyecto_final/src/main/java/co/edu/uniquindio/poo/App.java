package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Stack;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.viewController.AdministradorLoginView;
import co.edu.uniquindio.poo.viewController.AlquilarVehiculoLoginView;
import co.edu.uniquindio.poo.viewController.EmpleadoLoginView;
import co.edu.uniquindio.poo.viewController.LoginViewController;
import co.edu.uniquindio.poo.viewController.RegistrarBusLoginView;
import co.edu.uniquindio.poo.viewController.RegistrarCamionLoginView;
import co.edu.uniquindio.poo.viewController.RegistrarCamionetaLoginView;
import co.edu.uniquindio.poo.viewController.RegistrarDeportivoLoginView;
import co.edu.uniquindio.poo.viewController.RegistrarMotoLoginView;
import co.edu.uniquindio.poo.viewController.RegistrarPickUpsLoginView;
import co.edu.uniquindio.poo.viewController.RegistrarSedanLoginView;
import co.edu.uniquindio.poo.viewController.RegistrarVansLoginView;
import co.edu.uniquindio.poo.viewController.RegistrarVehiculosViewController;
import co.edu.uniquindio.poo.viewController.RegistroClienteLoginViewController;

public class App extends Application {

    private Stage primaryStage;
    private Stack<Scene> sceneStack = new Stack<>();
    App app;
    public static Concesionario concesionario = new Concesionario("Concesionario UQ", "Carrera 15 22", "3172732713",
            "ConcesionarioUQ@gmail.com");

    @SuppressWarnings("exports")
    public Concesionario getConcesionario() {
        return concesionario;
    }

    @Override
    public void start(@SuppressWarnings("exports") Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Inicio de Sesión");
        // Abrir la vista principal
        openViewPrincipal();
        // Inicializar el concesionario
        inicializarConcesionario();

    }

    private void inicializarConcesionario() {
        // Aquí inicializas el concesionario con los datos deseados
        this.concesionario = new Concesionario("Concesionario UQ", "Carrera 15 22", "3172732713",
                "ConcesionarioUQ@gmail.com");
    }

    private void openViewPrincipal() {
        inicializarData(); // Método para inicializar cualquier dato necesario para la vista

        try {
            // Cargar la vista desde el archivo FXML
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("LoginView.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();

            // Obtener el controlador de la vista cargada
            LoginViewController primaryController = loader.getController();
            primaryController.setApp(this); // Establecer la aplicación en el controlador

            // Crear la escena y mostrarla
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace(); // Manejar el error adecuadamente
        }
    }

    public static void main(String[] args) {
        launch(args); // Lanzar la aplicación
    }

    public void cargarVistaAdmin() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("AdministradorLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            AdministradorLoginView primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void cargarVistaEmpleado() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("empleadoLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            EmpleadoLoginView primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void RegistrarVehiculosAction() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }

            // Cambiar a la nueva vista
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RegistrarVehiculosLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();

            RegistrarVehiculosViewController primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void RegistrarBus() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RegistrarBusLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            RegistrarBusLoginView primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void AlquilarVehiculosAction() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("AlquilarVehiculoLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            AlquilarVehiculoLoginView primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void RegistrarCamioneta() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RegistrarCamionetaLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            RegistrarCamionetaLoginView primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void RegistrarCamion() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RegistrarCamionLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            RegistrarCamionLoginView primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void RegistrarDeportivo() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RegistrarDeportivoLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            RegistrarDeportivoLoginView primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void RegistrarPickUp() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RegistrarPickUpsLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            RegistrarPickUpsLoginView primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void RegistrarClienteAction() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RegistroClienteLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            RegistroClienteLoginViewController primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Cliente cliente = new Cliente("12233", "juan", "apellido", "123", "2@gmail.com");
        concesionario.agregarCliente(cliente);
    }

    public void RegistrarSedan() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RegistrarSedanLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            RegistrarSedanLoginView primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void RegistrarVan() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RegistrarVansLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            RegistrarVansLoginView primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void RegistrarMoto() {
        try {
            // Apilar la escena actual
            if (primaryStage.getScene() != null) {
                sceneStack.push(primaryStage.getScene());
            }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RegistrarMotoLoginView.fxml"));
            AnchorPane rootLayout = (AnchorPane) loader.load();
            RegistrarMotoLoginView primaryController = loader.getController();
            primaryController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.centerOnScreen();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void PaginaAnterior() {
        if (!sceneStack.isEmpty()) {
            // Recupera la escena anterior desde la pila
            Scene previousScene = sceneStack.pop();
            primaryStage.setScene(previousScene); // Establece la escena anterior
            primaryStage.show();
            primaryStage.centerOnScreen();
        } else {
            System.out.println("No hay una página anterior en el historial."); // Mensaje en caso de que no haya escenas
        }
    }

    public void inicializarData() {

    }

}