package co.edu.uniquindio.poo.model;

public class Transaccion {

    private String placa;      // Placa del vehículo
    private String tramite;    // Tipo de trámite: "Registrado", "Alquilado", "Vendido"
    private Empleado empleado; // Empleado que realiza la transacción
    private Cliente cliente; 
    // Constructor
    public Transaccion(String placa, String tramite, Empleado empleado, Cliente cliente) {
        this.placa = placa;
        this.tramite = tramite;
        this.empleado = empleado;
        this.cliente = cliente; 
    }

    // Getters y Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Trámite: " + tramite + ", Empleado: " + empleado.getNombre()+ " "+empleado.getApellido()+ ", Cliente: " + cliente.getNombre()+ " " +cliente.getApellido(); 
    }

}


