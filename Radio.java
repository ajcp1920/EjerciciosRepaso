/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.Unidad1.EjerciciosParte1;
import java.util.Scanner;
/**
 *
 * @author Arturo Cavazos
 */
public class Radio {
    public static void main(String[] args)
    {
        double radio,area;
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Capture el radio del circulo");
        radio = miScanner.nextDouble();
        
        area = Math.PI*Math.pow(radio, 2);
    }
    
}
