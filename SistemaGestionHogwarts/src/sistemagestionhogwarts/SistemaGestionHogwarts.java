package sistemagestionhogwarts;

import sistemagestionhogwarts.clases.Criatura;
import sistemagestionhogwarts.clases.Registro;

public class SistemaGestionHogwarts {
    public static void main(String[] args) {
        
        Criatura c1 = new Criatura("Toby","Dragon",74,13,7,true,1);
        Criatura c2 = new Criatura("Toby","Dragon",74,13,7,true,2);
        
        Registro ListaCriatura = new Registro();
        ListaCriatura.agregarCriatura(c1);

        ListaCriatura.validarCodigoMagico(c2);
        ListaCriatura.agregarCriatura(c2);
        ListaCriatura.mostrarCriatura();
    }
    
}
