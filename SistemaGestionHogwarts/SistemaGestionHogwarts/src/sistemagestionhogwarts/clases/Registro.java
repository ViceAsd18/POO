package sistemagestionhogwarts.clases;

import java.util.ArrayList;
import java.util.List;

public class Registro {
private List<Criatura> listaCriaturas = new ArrayList<>();

    public Registro() {
    }
    
    public void agregarCriatura(Criatura parCriatura){
        listaCriaturas.add(parCriatura);
        System.out.println("Se agrego la criatura al registro con exito");
    }
    
    public void cantidadCriaturas(){
        System.out.println("La cantidad de criaturas que estan bajo cuidado es de " + listaCriaturas.size());
    }
    
    public Boolean validarCodigoMagico(int parCodigoMagico){
        for(Criatura i: listaCriaturas){
            if(i.getCodigoMagico() == parCodigoMagico){
                System.out.println("El codigo ingresado ya esta en uso");
                return false;
            }
        }return true;
    }

    public void listarCriaturas(){
        for(Criatura i: listaCriaturas){
            if(i instanceof Dragon){
                Dragon insDra = (Dragon) i;
                System.out.println("CODIGO MAGICO: " + i.getCodigoMagico() + " NOMBRE: " + i.getNombre() + " ESPECIE: " + i.getEspecie()
                                 + " VECES QUE ESCUPIO FUEGO: " + insDra.getNumeroVecesEscupeFuego());
            }
            if(i instanceof Hipogrifos){
                Hipogrifos insHipo = (Hipogrifos) i;
                System.out.println("CODIGO MAGICO: " + i.getCodigoMagico() + " NOMBRE: " + i.getNombre() + " ESPECIE: " + i.getEspecie()
                                 + " TEMPERAMENTO: " + insHipo.getTemperamento() + " VUELOS REALIZADOS: " + insHipo.getVuelosRealizados() );
            }
            
            if(i instanceof Thestrals){
                Thestrals insThe = (Thestrals) i;
                System.out.println("CODIGO MAGICO: " + i.getCodigoMagico() + " NOMBRE: " + i.getNombre() + " ESPECIE: " + i.getEspecie());
            }
            
            if(i instanceof  Nifflers){
                Nifflers insNif = (Nifflers) i;
                System.out.println("CODIGO MAGICO: " + i.getCodigoMagico() + " NOMBRE: " + i.getNombre() + " ESPECIE: " + i.getEspecie()
                                  + " TESOROS ENCONTRADOS: " + insNif.getTesorosEncontrados());
            }
            
            if(i instanceof Bowtruckles){
                Bowtruckles insBow = (Bowtruckles) i;
                System.out.println("CODIGO MAGICO: " + i.getCodigoMagico() + " NOMBRE: " + i.getNombre() + " ESPECIE: " + i.getEspecie()
                                  + " TESOROS ENCONTRADOS: " + insBow.getReparacionesArboles());
            }
            
            
        }
    
    } 
    
    public void calcularMontoTotal(){
        double contador = 0;
        for(Criatura i: listaCriaturas){
            contador += i.costoFinalAlojamiento();
        }
        System.out.println("El monto final del cuidado de todos las criaturas es de " + contador);
    }
    
}
