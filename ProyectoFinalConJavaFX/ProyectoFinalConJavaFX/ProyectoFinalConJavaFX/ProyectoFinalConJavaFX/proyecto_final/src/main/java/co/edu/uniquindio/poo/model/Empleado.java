package co.edu.uniquindio.poo.model;

public class Empleado extends Persona {
    private int sueldo;

    public Empleado(String nombre, String apellido, String cedula, String telefono, String correo, int sueldo) {
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
        return "Empleado: \n Nombre: " + super.getNombre() + " " + super.getApellido() +"\n Cédula: " + super.getCedula() +"\n Teléfono: " + super.getTelefono() +"\n Correo: " + super.getCorreo();

}
    
}
