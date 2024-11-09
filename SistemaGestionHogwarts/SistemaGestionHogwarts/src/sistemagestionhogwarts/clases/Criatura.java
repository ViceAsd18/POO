package sistemagestionhogwarts.clases;

public abstract class Criatura implements ICostoMagico{
    private final int codigoMagico;
    private String nombre;
    private String especie;
    private int peso;
    private int edad;
    private int diasBajoCuidado;
    private Boolean supervicionEspecial;

    public Criatura(int codigoMagico, String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean supervicionEspecial) {
        this.codigoMagico = codigoMagico;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
        this.diasBajoCuidado = diasBajoCuidado;
        this.supervicionEspecial = supervicionEspecial;
    }

    public int getCodigoMagico(){
        return codigoMagico;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDiasBajoCuidado() {
        return diasBajoCuidado;
    }

    public void setDiasBajoCuidado(int diasBajoCuidado) {
        this.diasBajoCuidado = diasBajoCuidado;
    }

    public Boolean getSupervicionEspecial() {
        return supervicionEspecial;
    }

    public void setSupervicionEspecial(Boolean supervicionEspecial) {
        this.supervicionEspecial = supervicionEspecial;
    }

    @Override
    public abstract String toString();

}
