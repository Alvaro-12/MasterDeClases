/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvaro
 */
public class Persona {

private String Nombre,Sexo;
private float Peso,Altura;
private int Edad;

public Persona(){
}

    public Persona(String Nombre, int Edad, String Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public Persona(String Nombre, String Sexo, float Peso, float Altura, int Edad) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Edad = Edad;
    }

    Persona(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        int edad = this.Edad;
        return Edad;
    }

    
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

public String esMayorDeEdad () {
    
    int edad = this.Edad;
    if (edad < 18 ){
    return "Es menor de edad";    
    }
    else{
     return "Es mayor de edad";   
    }
}

    
    public String Digitalizado() {
        return "Persona{" + "Nombre=" + Nombre + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + ", Edad=" + Edad + '}';
 
  }

   
    public String Per() {
        return "Persona{" + "Nombre=" + Nombre + ", Sexo=" + Sexo + ", Edad=" + Edad + '}';
        
     
    
    }



}
