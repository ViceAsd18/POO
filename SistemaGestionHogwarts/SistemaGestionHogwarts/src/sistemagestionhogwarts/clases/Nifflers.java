package sistemagestionhogwarts.clases;

public class Nifflers extends Criatura{
    private int tesorosEncontrados;

    public Nifflers(int tesorosEncontrados, int codigoMagico, String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean supervicionEspecial) {
        super(codigoMagico, nombre, especie, peso, edad, diasBajoCuidado, supervicionEspecial);
        this.tesorosEncontrados = tesorosEncontrados;
    }

    public int getTesorosEncontrados() {
        return tesorosEncontrados;
    }

    public void setTesorosEncontrados(int tesorosEncontrados) {
        this.tesorosEncontrados = tesorosEncontrados;
    }

    @Override
    public String toString() {
        return "Nifflers{" + "tesorosEncontrados=" + tesorosEncontrados + '}';
    }

    @Override
    public double costoFinalAlojamiento() {
        double contador = VALOR_DIA_ALOJAMIENTO * getDiasBajoCuidado();
        if(tesorosEncontrados > 10){
            contador = contador * 0.88;
        }return contador;
    }
    
    
}
