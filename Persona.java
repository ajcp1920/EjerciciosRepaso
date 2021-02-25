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
public class Persona {
    private final static char sexo_def = 'H';
    public static final int infrapeso = -1;
    public static final int pesoideal = 0;
    public static final int sobrepeso = 1;
    
    private String nombre;
    private int edad;
    private String RFC;
    private char sexo;
    private double peso;
    private double altura;
    
    public Persona()
    {
        this("", 0, sexo_def,0,0);
    }
    
    public Persona(String nombre, int edad, char sexo)
    {
        this(nombre, edad, sexo,0 , 0);
    }
    
    public Persona(String nombre, int edad, char sexo, double peso, double altura)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarRFC();
        this.sexo = sexo;
        comprobarSexo();
    }
    
    private void comprobarSexo()
    {
        if(sexo != 'H' && sexo != 'M')
        {
            this.sexo = sexo_def;
        }
    }
    private void generarRFC()
    {
        final int divisor = 23;
        int numRFC = ((int) Math.floor(Math.random()*(100000000 - 10000000) + 10000000));
        int res = numRFC - (numRFC / divisor * divisor);
        char letraRFC = generarLetras(res);
        
        RFC = Integer.toString(numRFC) + letraRFC;
    }
    private char generarLetras(int res)
    {
        char letras[]= {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        return letras[res];
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    public void setSexo(char sexo)
    {
        this.sexo =  sexo;
    }
    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
    }
    
    public int CalcularIMC()
    {
        double pesoActual = peso / (Math.pow(altura,2));
        if (pesoActual >= 20 && pesoActual<=25)
        {
            return pesoideal;
        }
        else 
        {
            if(pesoActual < 20)
            {
                return infrapeso;
            }
            else
            {
                return sobrepeso;
            }
        }
    }
    public boolean esMayorDeEdad()
    {
        boolean mayor = false;
        if(edad >= 18)
        {
            mayor = true;
        }
        return mayor;
    }
    
    @Override
    public String toString()
    {
        String sexo;
        if(this.sexo == 'H')
        {
            sexo = "hombre";
        }
        else
        {
            sexo = "mujer";
        }
        return "Informacion de la persona: " + " Nombre: " + nombre + " Sexo: " + sexo + " Edad: " + edad + " años " + " RFC " + RFC + " Peso:  " + peso + " kg " + " Altura " + altura + " metros"; 
                
    }
}
