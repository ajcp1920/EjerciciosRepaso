/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.Unidad1.EjerciciosParte1;

/**
 *
 * @author Arturo Cavazos
 */
public class Multiplos {
    public static void mian(String[] args)
    {
    int resto;
    int numero1 = 21;
    int numero2 = 3;

    resto = numero1%numero2;

    if (resto==0)
    {
        System.out.println(numero1 + " es múltiplo de " + numero2);
    }
    else
    {
        System.out.println(numero1 + " NO es múltiplo de " + numero2);
    }
    }
}
