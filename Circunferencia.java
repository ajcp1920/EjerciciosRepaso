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
public class Circunferencia {
    public static void main(String[] args)
    {
        double circunferencia,radio;
        Scanner s = new Scanner(System.in);
        System.out.println("Capture el radio del circulo");
        radio = s.nextDouble();
        
        circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia es: " + circunferencia);
    }
}
