package co.edu.uniquindio.poo.model;

public class Cliente extends Persona{
    public Cliente (String nombre, String apellido, String cedula, String telefono, String correo){
        super(nombre, apellido, cedula, telefono, correo);
    }
    
    @Override
    public String toString() {
        return " Cliente: " + super.getNombre() + " " + super.getApellido() +"\n Cédula: " + super.getCedula() +"\n Teléfono: " + super.getTelefono() +"\n Correo: " + super.getCorreo();
    }
}
