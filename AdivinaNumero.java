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
public class AdivinaNumero {
    public static void main(String[] args) 
    {
        int num = 0;
        int i;
        Scanner s = new Scanner(System.in);
        int n = (int)(Math.random()*100);
        
        System.out.println("Adivina el numero");
        num = s.nextInt();
        
        
        
        for(i = 100;i>0&&(num!= n);i=i-10)
        {
            if(num< n)
            {
                System.out.println("El numero es mayor");
                num = s.nextInt();
            }
            else
            {
                System.out.println("El numero es menor");
                num = s.nextInt();
            }
                
        }
    
        if(num == n)
        {
            System.out.println("Correcto"); 
        }
      
                
    }

}
