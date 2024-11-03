package sistemagestionhogwarts.clases;

import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Criatura> Criaturas = new ArrayList<>();
    
    public void agregarCriatura (Criatura parCriatura){
        Criaturas.add(parCriatura);
    }
    
    public void mostrarCriatura(){
        for(Criatura i : Criaturas){
            System.out.println(i);
        }
    }
    
    public void totalCriaturas(){
        System.out.println("El total de las criaturas bajo cuidado"
                + " de Hogwarts es de " + Criaturas.size());
    }
    
    public Boolean validarCodigoMagico(Criatura parCriatura){
        for(Criatura i: Criaturas){
            if(i.getCodigoMagico() == parCriatura.getCodigoMagico()){
                System.out.println("El codigo ya esta en uso");
                return false;
            }
        }return true;
    }
}
