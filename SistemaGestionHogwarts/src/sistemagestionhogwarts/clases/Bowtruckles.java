package sistemagestionhogwarts.clases;

public class Bowtruckles extends Criatura implements CostoMagico{
    private int reparacionesArboles;

    public Bowtruckles() {
    }

    public Bowtruckles(int reparacionesArboles) {
        this.reparacionesArboles = reparacionesArboles;
    }

    public Bowtruckles(int reparacionesArboles, String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean cuidadoEspecial, int codigoMagico) {
        super(nombre, especie, peso, edad, diasBajoCuidado, cuidadoEspecial, codigoMagico);
        this.reparacionesArboles = reparacionesArboles;
    }

    public int getReparacionesArboles() {
        return reparacionesArboles;
    }

    public void setReparacionesArboles(int reparacionesArboles) {
        this.reparacionesArboles = reparacionesArboles;
    }

    @Override
    public double costoFinalAlojamiento() {
        double contador = 0;
        contador += 250 * getDiasBajoCuidado();
        int reparacionesPorDia = reparacionesArboles / getDiasBajoCuidado();
        if(reparacionesPorDia > 3){
            contador = contador * 0.95;
        }return contador;
    }
    
    
}
