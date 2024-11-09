package sistemagestionhogwarts.clases;

public class Dragon extends Criatura {
    private int numeroVecesEscupeFuego;

//    public Dragon() {
//        super(0);
//    }
//
//    public Dragon(int numeroVecesEscupeFuego, int codigoMagico) {
//        super(codigoMagico);
//        this.numeroVecesEscupeFuego = numeroVecesEscupeFuego;
//    }

    public Dragon(int numeroVecesEscupeFuego, int codigoMagico, String nombre, String especie, int peso, int edad, int diasBajoCuidado, Boolean supervicionEspecial) {
        super(codigoMagico, nombre, especie, peso, edad, diasBajoCuidado, supervicionEspecial);
        this.numeroVecesEscupeFuego = numeroVecesEscupeFuego;
    }

    public int getNumeroVecesEscupeFuego() {
        return numeroVecesEscupeFuego;
    }

    public void setNumeroVecesEscupeFuego(int numeroVecesEscupeFuego) {
        this.numeroVecesEscupeFuego = numeroVecesEscupeFuego;
    }

    @Override
    public String toString() {
        return "Dragon{" + "numeroVecesEscupeFuego=" + numeroVecesEscupeFuego + '}';
    }

    @Override
    public double costoFinalAlojamiento() {
        double contador = VALOR_DIA_ALOJAMIENTO * getDiasBajoCuidado();
        if(numeroVecesEscupeFuego > 5){
            contador += contador * 1.15;
        }return contador;
    }


    
}
