package sistemagestionhogwarts.clases;

public class Dragones extends Criatura implements CostoMagico{
    private int contadorEscupeFuego;

    public Dragones() {
    }

    public Dragones(int contadorEscupeFuego) {
        this.contadorEscupeFuego = contadorEscupeFuego;
    }

    public Dragones(int contadorEscupeFuego, String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean cuidadoEspecial, int codigoMagico) {
        super(nombre, especie, peso, edad, diasBajoCuidado, cuidadoEspecial, codigoMagico);
        this.contadorEscupeFuego = contadorEscupeFuego;
    }

    public int getContadorEscupeFuego() {
        return contadorEscupeFuego;
    }

    public void setContadorEscupeFuego(int contadorEscupeFuego) {
        this.contadorEscupeFuego = contadorEscupeFuego;
    }

    @Override
    public double costoFinalAlojamiento() {
        double contador = 0;
        contador += 250 * getDiasBajoCuidado();
        if(contadorEscupeFuego >= 5){
            contador += contador * 1.15;
        }return contador;
    }
    
    
}
