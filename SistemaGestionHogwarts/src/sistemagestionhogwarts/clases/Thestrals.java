package sistemagestionhogwarts.clases;

public class Thestrals extends Criatura implements CostoMagico{

    public Thestrals() {
    }

    public Thestrals(String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean cuidadoEspecial, int codigoMagico) {
        super(nombre, especie, peso, edad, diasBajoCuidado, cuidadoEspecial, codigoMagico);
    }

    public void encontrarThestrals(){
        System.out.println("Se encontro la criatura Thestrals");
    }

    @Override
    public double costoFinalAlojamiento() {
        double contador = 0;
        contador += 250 * getDiasBajoCuidado();
        contador += contador * 1.08;
        return contador;
    }
    
    
}
