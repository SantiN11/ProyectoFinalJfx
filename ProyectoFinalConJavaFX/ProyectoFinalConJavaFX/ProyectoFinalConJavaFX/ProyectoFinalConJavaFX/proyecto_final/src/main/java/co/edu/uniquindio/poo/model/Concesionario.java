
package co.edu.uniquindio.poo.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Collection;
import java.util.LinkedList;

public class Concesionario {

    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;

    public Collection<Empleado> empleados;
    public Collection<Administrador> administradors;
    public Collection<Cliente> clientes;
    public Collection<Transaccion> transaccions;
    private Collection<Bus> buses;

    public Concesionario(String nombre, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;

        empleados = new LinkedList<>();
        administradors = new LinkedList<>();
        clientes = new LinkedList<>();
        transaccions = new LinkedList<>();
        buses = new LinkedList<>();

    }

    public boolean iniciarSesion(String correo, String contraseña) {
        return true;
    }

    public Collection<Bus> getBuses() {
        return buses;
    }

    public void setBuses(Collection<Bus> buses) {
        this.buses = buses;
    }

    public void agregarBus(Bus bus) {
        buses.add(bus);
    }

    public void getDatosBus() {
        System.out.println("Inicio de impresión de datos bus " + "\n");
        for (Bus bus : buses) {
            System.out.println(bus);
        }
        System.out.println("Fin de impresión de datos bus " + "\n");
    }

    public boolean verificarBus(String placa) {
        boolean centinela = false;
        for (Bus bus : buses) {
            if (bus.getPlaca().equals(placa)) {
                centinela = true;
            }
        }
        return centinela;
    }

    @Override
    public String toString() {
        return "" + nombre + "\n Direccion: " + direccion + "\n Telefono: " + telefono + "\n Correo: "
                + correo;
    }

    // Agregar Empleados a concesionario
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Agregar Administrador a concesionario
    public void agregarAdministrador(Administrador administrador) {
        administradors.add(administrador);
    }

    // Agregar Clientes a concesionario
    public boolean agregarCliente(Cliente cliente) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getCedula())) {
            clientes.add(cliente);
            centinela = true;
        }
        return centinela;
    }

    // Obtener lista de empleados
    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ObservableList<Empleado> empleados) {
        this.empleados = empleados;
    }

    // Obtener lista de administradores
    public Collection<Administrador> getAdministradors() {
        return administradors;
    }

    public void setAdministradors(ObservableList<Administrador> administradors) {
        this.administradors = administradors;
    }

    // Obtener lista de clientes

    public void setClientes(ObservableList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Collection<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setTransaccions(ObservableList<Transaccion> transaccions) {
        this.transaccions = transaccions;
    }

    // Obtener lista de transacciones
    public Collection<Transaccion> getTransaccions() {
        return transaccions;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean agregarCliente(Cliente cliente, Empleado empleado) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getCedula())) {
            clientes.add(cliente);

            registrarTransaccion2(cliente.getCedula(), "Registrado", empleado, cliente);
            centinela = true;
        }
        return centinela;
    }

    public boolean verificarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void registrarTransaccion2(String id, String tramite, Empleado empleado, Cliente cliente) {
        Transaccion transaccion = new Transaccion(id, tramite, empleado, cliente);
        transaccions.add(transaccion);

    }

    public boolean eliminarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                clientes.remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarCliente(String cedula, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                cliente.setCedula(actualizado.getCedula());
                cliente.setNombre(actualizado.getNombre());
                cliente.setApellido(actualizado.getApellido());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

}
