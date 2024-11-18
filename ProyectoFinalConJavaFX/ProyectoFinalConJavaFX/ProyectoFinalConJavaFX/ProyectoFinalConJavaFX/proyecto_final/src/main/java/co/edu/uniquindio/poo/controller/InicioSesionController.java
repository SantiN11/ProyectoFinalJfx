package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Concesionario;

public class InicioSesionController {

    Concesionario concesionario;

    public InicioSesionController(Concesionario concesionario) {
        this.concesionario = concesionario;
    } 

   
    public String iniciarSesion(String correo, String contraseña) {
        // Validar las credenciales y devolver el rol
        if ("admin".equals(correo) && "admin".equals(contraseña)) {
            return "ADMIN";
        } else if ("e".equals(correo) && "e".equals(contraseña)) {
            return "EMPLEADO";
        }
        return null; // Credenciales inválidas
    }
     public Collection<Cliente> obtenerListaClientes() {
        return concesionario.getClientes();
    }
    public boolean crearCliente(Cliente cliente) {
        return concesionario.agregarCliente(cliente);
    }

    public boolean eliminarCliente(String cedula) {
       return concesionario.eliminarCliente(cedula);
    }

    

}
