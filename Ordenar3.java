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
public class Ordenar3 {
    public static void main(String[] args){
        int a,b,c;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Introduzca primer número: ");
        a=Entrada.nextInt();
        System.out.print("Introduzca segundo número: ");
        b=Entrada.nextInt();
        System.out.print("Introduzca tercer número: ");
        c=Entrada.nextInt();
        if(a>b && b>c)
            System.out.println( a+", "+b+", "+c);
        else{
            if(a>c && c>b)
                System.out.println(a+", "+c+", "+b);
            else{
               if(b>a && a>c)
                   System.out.println(b+", "+a+", "+c);
               else{
                  if(b>c && c>a)
                      System.out.println(b+", "+c+", "+a);
                  else{
                      if(c>a && a>b)
                         System.out.println(c+", "+a+", "+b);
                      else{
                         if(c>b && b>a)
                            System.out.println(c+", "+b+", "+a);
                        }
                                              
                      }
                   }
                }
            }
        }
}
