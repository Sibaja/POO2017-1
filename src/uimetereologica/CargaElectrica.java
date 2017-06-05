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
public class CargaElectrica extends Sensor {
    
    private int tipoQ;
    protected static final String[] TIPOC = {"1-TormentaElectrica", "2-Rayos", "3-Truenos", "4-Normal"};
    
    //Constructor del Nivel de Carga eléctrica

    public CargaElectrica(int tipoQ, String marca, int referencia, String fechaInstalacion) {
        super(marca, referencia, fechaInstalacion);
        this.tipoQ = tipoQ;
    }
    
    // Método devuelve el tipo de carga electrica
    public int getTipoQ(){
    
        return tipoQ;
    }
    
    @Override
    
    public String toString() {
    
        return "Nivel de Carga Eléctrica: " + "nivel " + tipoQ;
    }
    
    
    
    
}
