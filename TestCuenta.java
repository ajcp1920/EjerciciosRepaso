/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.Unidad1.EjerciciosPuntosExtras;

/**
 *
 * @author Arturo Cavazos
 */
public class TestCuenta {
    public static void main(String[] args)
    {
        Cuenta cuenta1 = new Cuenta("Pedro");
        Cuenta cuenta2 = new Cuenta("Fernando",300);
        
        cuenta1.ingresar(300);
        cuenta2.ingresar(400);
        
        cuenta1.retirar(500);
        cuenta2.retirar(100);
        
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}
