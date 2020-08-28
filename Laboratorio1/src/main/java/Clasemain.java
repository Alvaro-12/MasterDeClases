
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvaro
 */
public class Clasemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner sc = new Scanner (System.in); 
        
        System.out.println("Escribe tu nombre: ");
        String Nombre  = sc.nextLine();
        System.out.println("Identifica tu sexo: ");
        String Sexo = sc.nextLine();
        System.out.println("Escribe tu edad: ");
        int Edad = sc.nextInt();
        System.out.println("Digite su altura: ");
        float Altura = sc.nextFloat();
        System.out.println("Digite su peso");
        float Peso = sc.nextFloat();
     
       Persona persona1 = new Persona(Nombre, Sexo, Peso, Altura, Edad);
        System.out.println(persona1.Digitalizado());
        System.out.println(persona1.esMayorDeEdad());
        
        
        
     Persona persona2 = new Persona(persona1.getNombre(),persona1.getEdad(),persona1.getSexo());
        System.out.println(persona2.Per());    
        System.out.println(persona2.esMayorDeEdad());
     
         
     Persona persona3 = new Persona();
         persona3.setNombre(Nombre);
         persona3.setEdad(Edad);
         persona3.setAltura(Altura);
         persona3.setSexo(Sexo);
         persona3.setPeso(Edad);
         System.out.println(persona1.Digitalizado());
         System.out.println(persona3.esMayorDeEdad());
        
        
       }
    
  }
