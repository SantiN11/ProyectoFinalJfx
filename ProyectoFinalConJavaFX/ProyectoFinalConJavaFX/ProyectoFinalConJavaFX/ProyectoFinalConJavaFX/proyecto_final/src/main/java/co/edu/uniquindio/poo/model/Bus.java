package co.edu.uniquindio.poo.model;

public class Bus extends Vehiculo {

    int numeroPasajeros;
    int numeroPuertas;
    int capacidadMaletero;
    boolean aireAcondicionado;
    boolean camaraReversa;
    int numeroBolsasAire;
    int numeroEjes;
    int salidaEmergencia;


    




    

    public Bus(String empleado, String placa, String marca, String modelo, int cambios, int cilindraje, boolean abs,
            String nuevoUsado, String combustible, String transmision, boolean electrico, boolean enchufable,
            boolean hibridoLigero, String estado, String tipoVinculo, int velocidadMaxima) {
        super(empleado, placa, marca, modelo, cambios, cilindraje, abs, nuevoUsado, combustible, transmision, electrico,
                enchufable, hibridoLigero, estado, tipoVinculo, velocidadMaxima);
    }

    public Bus(String empleado, String placa, String marca, String modelo, int cambios, int cilindraje, boolean abs,
            String nuevoUsado, String combustible, String transmision, boolean electrico, boolean enchufable,
            boolean hibridoLigero, String estado, String tipoVinculo, int velocidadMaxima, int numeroPasajeros,
            int numeroPuertas, int capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa,
            int numeroBolsasAire, int numeroEjes, int salidaEmergencia) {
        super(empleado, placa, marca, modelo, cambios, cilindraje, abs, nuevoUsado, combustible, transmision, electrico,
                enchufable, hibridoLigero, estado, tipoVinculo, velocidadMaxima);
        this.numeroPasajeros = numeroPasajeros;
        this.numeroPuertas = numeroPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numeroBolsasAire = numeroBolsasAire;
        this.numeroEjes = numeroEjes;
        this.salidaEmergencia = salidaEmergencia;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public int getSalidaEmergencia() {
        return salidaEmergencia;
    }

    public void setSalidaEmergencia(int salidaEmergencia) {
        this.salidaEmergencia = salidaEmergencia;
    }


    @Override
    public String toString() {
        return "Bus [marca " + getMarca() + ", Nuevo o usado " + getNuevoUsado() + ", Placa " + getPlaca() + ", Modelo " + getModelo() + ", cambios " + getCambios()
                + ", velocidad maxima " + getVelocidadMaxima() + ", cilindraje " + getCilindraje() + ",  numero pasajeros " + getNumeroPasajeros()
                + ", numero puertas " + getNumeroPuertas() + ", capacidad del maletero "+getCapacidadMaletero()+ ", aire acondicionado "+aireAcondicionado
                + ", camara de reversa "+camaraReversa+ ", num bolsas de aire "+numeroBolsasAire+ ", abs: "+isAbs()+
                 ", numero de ejes "+numeroEjes+ "numero salidas de emergencia: "+salidaEmergencia;
    }
    



}
