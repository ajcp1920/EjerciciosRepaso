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
public class NumerosIguales {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n1;
	int n2;
	System.out.print("Introduce un número: ");
	n1=teclado.nextInt();
	System.out.print("Introduce otro número: ");
	n2=teclado.nextInt();
	if(n1==n2)
            System.out.println("Son iguales");
	else
            System.out.println("No son iguales");
    }
}
