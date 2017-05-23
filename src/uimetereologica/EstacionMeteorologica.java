/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uimetereologica;


/**
 *
 * @author Estudiante
 */
public class EstacionMeteorologica {
    
    //Atributos
    private String nombre;
    private String ubicacion;
    public Sensor sensores;
    private String fechaInstalacion;

    // Constructor

    public EstacionMeteorologica(String nombre, String ubicacion, Sensor sensores, String fechaInstalacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.sensores = sensores;
        this.fechaInstalacion = fechaInstalacion;
    }
    
    // métodos Gets and Sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Sensor getSensores() {
        return sensores;
    }

    public void setSensores(Sensor sensores) {
        this.sensores = sensores;
    }

    public String getFechaInstalacion() {
        return fechaInstalacion;
    }

    public void setFechaInstalacion(String fechaInstalacion) {
        this.fechaInstalacion = fechaInstalacion;
    }
    
        
    
}
