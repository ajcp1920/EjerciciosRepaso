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
public class Cuadratica {
    public static void main(String[] args)
    {
        double a,b,c;
        double d,x1,x2;
        
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introducir el primer coeficiente");
        a = miScanner.nextDouble();
        
        System.out.println("Introducir el primer coeficiente");
        b = miScanner.nextDouble();
        
        System.out.println("Introducir el primer coeficiente");
        c = miScanner.nextDouble();
        
        d = (b*b) - 4*a*c;
        if(d<0)
        {
            System.out.println("No existen soluciones reales");
        }
        else
        {
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b + Math.sqrt(d))/(2*a);
            System.out.println("Solucion: " + x1);
            System.out.println("Solucion: " + x2);
        }
    }
}
