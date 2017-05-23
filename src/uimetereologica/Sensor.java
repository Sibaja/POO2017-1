/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uimetereologica;

/**
 *Clase abstracta
 * @author Estudiante
 */
public abstract class Sensor {
    
    //Atributos
    protected String marca;
    protected int referencia;
    protected String fechaInstalacion;

    //Constructor del sensor
    
    public Sensor(String marca, int referencia, String fechaInstalacion) {
        this.marca = marca;
        this.referencia = referencia;
        this.fechaInstalacion = fechaInstalacion;
    }
    
    // Gets the name of the marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(String fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }
    
    
    
    
    // método abstracto
    public abstract String toString();
    
    
    
}
