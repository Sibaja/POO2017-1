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
public class AguaLluvia extends Sensor {
    
    //Atributos
    //parametro cantidadH2O guarda la cantidad en milímetros de agua lluvia por minutos
    
    double cantidadH2O;
    
    //Constructor

    public AguaLluvia(double cantidadH2O, String marca, int referencia, String fechaInstalacion) {
        super(marca, referencia, fechaInstalacion);
        this.cantidadH2O = cantidadH2O;
    }
    
    
    //métodos

    public double getCantidadH2O() {
        return cantidadH2O;
    }

    public void setCantidadH2O(double cantidadH2O) {
        this.cantidadH2O = cantidadH2O;
    }
    
    @Override
    
    public String toString() {
    
        return "Cantidad de Agua LLuvia: " + cantidadH2O + " m.m./ minutos";
    }
    
    
}
