/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uimetereologica;

/**
 *
 * @author user
 */
public class Temperatura extends Sensor {
    
    private double grados;
    
    //Constructor

    public Temperatura(double grados, String marca, int referencia, String fechaInstalacion) {
        super(marca, referencia, fechaInstalacion);
        this.grados = grados;
    }
    
    // Método devuelve el tipo de carga electrica
    public double getGrados(){
    
        return grados;
    }
    
    @Override
    
    public String toString() {
    
        return "Temperatura: " + grados + " °C ";
    }
    
    
}
