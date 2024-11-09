package sistemagestionhogwarts.clases;

public class Bowtruckles extends Criatura{
    private int reparacionesArboles;

    public Bowtruckles(int reparacionesArboles, int codigoMagico, String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean supervicionEspecial) {
        super(codigoMagico, nombre, especie, peso, edad, diasBajoCuidado, supervicionEspecial);
        this.reparacionesArboles = reparacionesArboles;
    }

    public int getReparacionesArboles() {
        return reparacionesArboles;
    }

    public void setReparacionesArboles(int reparacionesArboles) {
        this.reparacionesArboles = reparacionesArboles;
    }

    @Override
    public String toString() {
        return "Bowtruckles{" + "reparacionesArboles=" + reparacionesArboles + '}';
    }

    @Override
    public double costoFinalAlojamiento() {
        double contador = VALOR_DIA_ALOJAMIENTO * getDiasBajoCuidado();
        double condicion = reparacionesArboles / getDiasBajoCuidado();
        if(condicion > reparacionesArboles){
            contador = contador * 0.95;
        }return contador;
    }
    
    
    
    
    
}
