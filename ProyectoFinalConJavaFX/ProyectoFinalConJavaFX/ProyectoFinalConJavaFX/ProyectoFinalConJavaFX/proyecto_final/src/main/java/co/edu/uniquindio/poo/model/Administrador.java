package co.edu.uniquindio.poo.model;

public class Administrador extends Persona{
    private int sueldo;

    public Administrador(String nombre, String apellido, String cedula, String telefono, String correo, int sueldo) {
        super(nombre, apellido, cedula, telefono, correo);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
    return " Administrador: " + getNombre() + " " + getApellido() + "\n Cédula: " + getCedula() + "\n Teléfono: " + getTelefono() + "\n Correo: " + getCorreo() + "\n Sueldo: " + sueldo;
}
}


