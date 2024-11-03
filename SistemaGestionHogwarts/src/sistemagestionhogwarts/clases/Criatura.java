package sistemagestionhogwarts.clases;

public class Criatura {
    private String nombre,especie;
    private int peso,edad,diasBajoCuidado;
    private Boolean cuidadoEspecial;
    private int codigoMagico;

    public Criatura() {
    }

    public Criatura(String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean cuidadoEspecial, int codigoMagico) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
        this.diasBajoCuidado = diasBajoCuidado;
        this.cuidadoEspecial = cuidadoEspecial;
        this.codigoMagico = codigoMagico;
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

    public Boolean getCuidadoEspecial() {
        return cuidadoEspecial;
    }

    public void setCuidadoEspecial(Boolean cuidadoEspecial) {
        this.cuidadoEspecial = cuidadoEspecial;
    }

    public int getCodigoMagico() {
        return codigoMagico;
    }

    public void setCodigoMagico(int codigoMagico) {
        this.codigoMagico = codigoMagico;
    }

    @Override
    public String toString() {
        return "Criatura{" + "nombre=" + nombre + ", especie=" + especie + ", peso=" + peso + ", edad=" + edad + ", diasBajoCuidado=" + diasBajoCuidado + ", cuidadoEspecial=" + cuidadoEspecial + ", codigoMagico=" + codigoMagico + '}';
    }
    
    
   
    
}
