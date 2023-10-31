/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Persona {
    protected String nombre; //super clases que se utilizan en una subclase
    protected String apellido;
    protected String rut;
    protected int telefono;
    public String rol;      
    
    public Persona(String nombre, String apellido, String rut, int telefono, String rol){ //atributos de cada trabajador de la obra
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.telefono = telefono;
        this.rol = rol;
        
    }

    
}
