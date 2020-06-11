
package model.teste;

import model.design.Conversor;
        
/**
 *
 * @author ROBERTA  
 */
public class TesteConversor {
    
//    criacao do metodo main
    public static void main(String[] args) {
        
//        criacao e instancia de objeto da classe conversor
            Conversor c = new Conversor ();
        
//     atribuindo dois numeros depois da virgula e metodos
        System.out.println("\n\t\t\t -- CONVERSOR DE °C PARA °F \n");
        System.out.printf("%.2f°C = %.2f°F\n", 0.0, c.celFah(00.00));
        System.out.printf("%.2f°C = %.2f°F\n", -40.0, c.celFah(-40.0));
        System.out.printf("%.2f°C = %.2f°F\n", 38.0, c.celFah(38.0));
        
//        conversor de °F para °C
            System.out.println("\n\t\t\t -- CONVERSOR DE °F PARA °C \n");
            System.out.printf("%.2f°C = %.2f°F\n", 32.0, c.fahCel(32.0));
            System.out.printf("%.2f°C = %.2f°F\n", -40.0, c.fahCel(-40.0));
            System.out.printf("%.2f°C = %.2f°F\n", 100.4, c.fahCel(100.4));
    }
    
}

