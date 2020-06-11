
package model.design;

/**
 *
 * @author ROBERTA
 */
public class Conversor {
    
 //    metodo que converte de °C para °F e formula
    public double celFah (double cel){
        return 9 * cel / 5 + 32;
                
     
    }
//    metodo que converte de °F para °C e formula
    public double fahCel (double fah){
        return (fah - 32) / 9 * 5;
    }
    
}
