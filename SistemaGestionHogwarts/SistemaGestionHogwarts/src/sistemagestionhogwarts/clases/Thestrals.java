package sistemagestionhogwarts.clases;

public class Thestrals extends Criatura{

    public Thestrals(int codigoMagico, String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean supervicionEspecial) {
        super(codigoMagico, nombre, especie, peso, edad, diasBajoCuidado, supervicionEspecial);
    }

    @Override
    public String toString() {
        return "Thestrals{" + '}';
    }
    
    public void encontrarThestrals(){
        System.out.println("Se encontro una criatura Thestrals...");
    }

    @Override
    public double costoFinalAlojamiento() {
        double contador = VALOR_DIA_ALOJAMIENTO * getDiasBajoCuidado();
        contador += contador * 1.08;
        return contador;
    }
}
