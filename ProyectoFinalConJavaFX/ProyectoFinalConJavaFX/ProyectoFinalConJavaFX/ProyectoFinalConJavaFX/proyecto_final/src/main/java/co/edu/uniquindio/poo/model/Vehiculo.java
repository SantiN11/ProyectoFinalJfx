package co.edu.uniquindio.poo.model;

public class Vehiculo {
 
    private String empleado;
    private String placa;
    private String marca;
    private String modelo;
    private int cambios;
    private int cilindraje;
    private boolean abs;
    private String nuevoUsado;
    private String combustible; 
    private String transmision; 
    private boolean electrico; 
    private boolean enchufable; 
    private boolean hibridoLigero;
    private String estado;
    private String tipoVinculo;
    private int velocidadMaxima;

    public Vehiculo(String empleado, String placa, String marca, String modelo, int cambios, int cilindraje,
            boolean abs, String nuevoUsado, String combustible, String transmision, boolean electrico,
            boolean enchufable, boolean hibridoLigero, String estado, String tipoVinculo, int velocidadMaxima) {
        this.empleado = empleado;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cambios = cambios;
        this.cilindraje = cilindraje;
        this.abs = abs;
        this.nuevoUsado = nuevoUsado;
        this.combustible = combustible;
        this.transmision = transmision;
        this.electrico = electrico;
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
        this.estado = estado;
        this.tipoVinculo = tipoVinculo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public String getNuevoUsado() {
        return nuevoUsado;
    }

    public void setNuevoUsado(String nuevoUsado) {
        this.nuevoUsado = nuevoUsado;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public boolean isEnchufable() {
        return enchufable;
    }

    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    public boolean isHibridoLigero() {
        return hibridoLigero;
    }

    public void setHibridoLigero(boolean hibridoLigero) {
        this.hibridoLigero = hibridoLigero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(String tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
  
}
