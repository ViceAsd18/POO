package sistemagestionhogwarts.clases;

public class Nifflers extends Criatura implements CostoMagico{
    private int objetosEncontrados;

    public Nifflers() {
    }

    public Nifflers(int objetosEncontrados) {
        this.objetosEncontrados = objetosEncontrados;
    }

    public Nifflers(int objetosEncontrados, String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean cuidadoEspecial, int codigoMagico) {
        super(nombre, especie, peso, edad, diasBajoCuidado, cuidadoEspecial, codigoMagico);
        this.objetosEncontrados = objetosEncontrados;
    }

    public int getObjetosEncontrados() {
        return objetosEncontrados;
    }

    public void setObjetosEncontrados(int objetosEncontrados) {
        this.objetosEncontrados = objetosEncontrados;
    }

    @Override
    public double costoFinalAlojamiento() {
        double contador = 0;
        contador += 250 * getDiasBajoCuidado();
        if(objetosEncontrados > 10){
            contador = contador * 0.88;
        }return contador;
    }
    
    
}
