package sistemagestionhogwarts.clases;

public class Hipogrifos extends Criatura{
    private float temperamento;
    private int vuelosRealizados;

    public Hipogrifos(float temperamento, int vuelosRealizados, int codigoMagico, String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean supervicionEspecial) {
        super(codigoMagico, nombre, especie, peso, edad, diasBajoCuidado, supervicionEspecial);
        this.temperamento = temperamento;
        this.vuelosRealizados = vuelosRealizados;
    }

    public float getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(float temperamento) {
        this.temperamento = temperamento;
    }

    public int getVuelosRealizados() {
        return vuelosRealizados;
    }

    public void setVuelosRealizados(int vuelosRealizados) {
        this.vuelosRealizados = vuelosRealizados;
    }

    @Override
    public String toString() {
        return "Hipogrifos{" + "temperamento=" + temperamento + ", vuelosRealizados=" + vuelosRealizados + '}';
    }

    @Override
    public double costoFinalAlojamiento() {
        double contador = VALOR_DIA_ALOJAMIENTO * getDiasBajoCuidado();
        if(vuelosRealizados > 3){
            contador += contador * 1.10;
        }return contador;
    }

    
}
