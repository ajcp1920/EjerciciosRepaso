/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.Unidad1.EjerciciosPuntosExtras;
import java.util.Scanner;
/**
 *
 * @author Arturo Cavazos
 */
public class TestPersona {
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce el nombre");
    String nombre = s.next();
    
    System.out.println("Introduce la edad");
    int edad = s.nextInt();
    
    System.out.println("Introduce el sexo");
    char sexo = s.next().charAt(0);
    
    System.out.println("Introduce el peso");
    double peso = s.nextDouble();
    
    System.out.println("Introduce la altura");
    double altura = s.nextDouble();
    
    Persona persona1 = new Persona();
    Persona persona2 = new Persona(nombre, edad, sexo);
    Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
    
    persona1.setNombre("Cristina");
    persona1.setEdad(25);
    persona1.setSexo('M');
    persona1.setPeso(80);
    persona1.setAltura(1.56);
    
    persona2.setPeso(70);
    persona2.setAltura(1.70);
    
    System.out.println("Persona #1");
    MuestraMensajePeso(persona1);
    MuestraMayorDeEdad(persona1);
    System.out.println(persona1.toString());
 
    System.out.println("Persona2");
    MuestraMensajePeso(persona2);
    MuestraMayorDeEdad(persona2);
    System.out.println(persona2.toString());
 
    System.out.println("Persona3");
    MuestraMensajePeso(persona3);
    MuestraMayorDeEdad(persona3);
    System.out.println(persona3.toString());
    }
    
    public static void MuestraMensajePeso(Persona p)
    {
        int IMC = p.CalcularIMC();
        switch(IMC)
        {
            case Persona.pesoideal:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.infrapeso:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.sobrepeso:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
        
    }
     public static void MuestraMayorDeEdad(Persona p) 
     {
 
        if (p.esMayorDeEdad()) 
        {
            System.out.println("La persona es mayor de edad");
        } 
        else 
        {
            System.out.println("La persona no es mayor de edad");
        }
     }
}
