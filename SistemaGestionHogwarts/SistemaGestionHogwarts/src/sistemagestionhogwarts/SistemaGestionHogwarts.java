package sistemagestionhogwarts;

import java.util.Scanner;
import sistemagestionhogwarts.clases.Bowtruckles;
import sistemagestionhogwarts.clases.Criatura;
import sistemagestionhogwarts.clases.Dragon;
import sistemagestionhogwarts.clases.Hipogrifos;
import sistemagestionhogwarts.clases.Nifflers;
import sistemagestionhogwarts.clases.Registro;
import sistemagestionhogwarts.clases.Thestrals;

public class SistemaGestionHogwarts {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Registro listaCriaturas = new Registro();
        
        while(true){
            System.out.println("--------MENU--------");
            System.out.println("1. Añadir Criatura");
            System.out.println("2. Mostrar Todas Las criaturas bajo cuidado");
            System.out.println("3. Calcular monto total del cuidado de todas las criaturas");
            
            int opcion = teclado.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Seleccione la especie que desea agregar\n");
                    System.out.println("1. Dragon");
                    System.out.println("2. Hipogrifos");
                    System.out.println("3. Thestrals");
                    System.out.println("4. Nifflers");
                    System.out.println("5. Bowtruckles\n");
                    
                    int opc_esp = teclado.nextInt();
                    int codigo_magico = 0;
                    while(true){
                        System.out.println("Ingrese el ID de la criatura");
                        int aux_id = teclado.nextInt();
                        codigo_magico = aux_id;
                        if(listaCriaturas.validarCodigoMagico(aux_id) == true){
                            break;
                        }else{
                            System.out.println("El codigo ya esta en uso");
                        }
                    }
                    System.out.println("\nIngrese el nombre de la criatura");
                    String aux_nombre = teclado.next();
                    
                    System.out.println("\nIngrese el peso de la criatura");
                    int aux_peso = teclado.nextInt();
                    
                    System.out.println("\nIngrese la edad de la criatura");
                    int aux_edad = teclado.nextInt();
                    
                    System.out.println("\nIngrese los dias bajo cuidado de la criatura");
                    int auxDiasBajoCuidado = teclado.nextInt();
                    
                    System.out.println("\nIngrese true si la criatura necesita cuidados especiales false en caso contrario");
                    Boolean aux_cuidadoEspecial = teclado.nextBoolean();
                    
                    switch(opc_esp){
                        case 1:
                            System.out.println("\nIngrese el numero de veces que escupe fuego");
                            int aux_escupeFuego = teclado.nextInt();
                            
                            Dragon aux_dragon = new Dragon(aux_escupeFuego,codigo_magico,aux_nombre,"Dragon",aux_peso,aux_edad,auxDiasBajoCuidado,aux_cuidadoEspecial);
                            listaCriaturas.agregarCriatura(aux_dragon);
                            break;
                        case 2:
                            System.out.println("\nIngrese el temperamento de la criatura");
                            float aux_tem  = teclado.nextFloat();
                            
                            System.out.println("\nIngrese los vuelos realizados del dragon");
                            int aux_vuelos = teclado.nextInt();
                            
                            Hipogrifos aux_hipo = new Hipogrifos(aux_tem, aux_vuelos, codigo_magico, aux_nombre, "Hipogrifos", aux_peso, aux_edad, auxDiasBajoCuidado, aux_cuidadoEspecial);
                            listaCriaturas.agregarCriatura(aux_hipo);
                            break;
                        case 3:
                            Thestrals aux_the = new Thestrals(codigo_magico, aux_nombre, "Thestrals", aux_peso, aux_edad, auxDiasBajoCuidado, aux_cuidadoEspecial);
                            listaCriaturas.agregarCriatura(aux_the);
                            break;
                        case 4:
                            System.out.println("\nIngrese la cantidad de tesoros encontrados por el Nifflers");
                            int aux_tesoros = teclado.nextInt();
                            
                            Nifflers aux_nif = new Nifflers(aux_tesoros, codigo_magico, aux_nombre, "Nifflers", aux_peso, aux_edad, auxDiasBajoCuidado, aux_cuidadoEspecial);
                            listaCriaturas.agregarCriatura(aux_nif);
                            break;
                        case 5:
                            System.out.println("\n Ingrese la cantidad de arboles reparados por el Bowtruckles");
                            int aux_repArb = teclado.nextInt();
                            
                            Bowtruckles aux_bow = new Bowtruckles(aux_repArb, codigo_magico, aux_nombre, "Bowtruckles", aux_peso, aux_edad, auxDiasBajoCuidado, aux_cuidadoEspecial);
                            listaCriaturas.agregarCriatura(aux_bow);
                            break;
                        default:
                            System.out.println("Opcion invalida...");
                    }
                    break;
                case 2:
                    listaCriaturas.listarCriaturas();
                    listaCriaturas.cantidadCriaturas();
                    break;
                case 3:
                    listaCriaturas.calcularMontoTotal();
                    break;
                default:
                    System.out.println("Opcion invalida...");
            }
            
            
        }

        
        
        
        
        
        
    }
    
}
