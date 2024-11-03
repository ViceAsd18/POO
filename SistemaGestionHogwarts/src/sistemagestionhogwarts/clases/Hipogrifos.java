package sistemagestionhogwarts.clases;

public class Hipogrifos extends Criatura implements CostoMagico{
    private int temperamento,vuelos;

    public Hipogrifos() {
    }

    public Hipogrifos(int temperamento, int vuelos) {
        this.temperamento = temperamento;
        this.vuelos = vuelos;
    }

    public Hipogrifos(int temperamento, int vuelos, String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean cuidadoEspecial, int codigoMagico) {
        super(nombre, especie, peso, edad, diasBajoCuidado, cuidadoEspecial, codigoMagico);
        this.temperamento = temperamento;
        this.vuelos = vuelos;
    }

    public int getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(int temperamento) {
        this.temperamento = temperamento;
    }

    public int getVuelos() {
        return vuelos;
    }

    public void setVuelos(int vuelos) {
        this.vuelos = vuelos;
    }

    @Override
    public double costoFinalAlojamiento() {
        double contador = 0;
        contador += 250 * getDiasBajoCuidado();
         if(vuelos > 3){
            contador += contador * 1.15;
        }return contador;
    }
    
    
    
}
