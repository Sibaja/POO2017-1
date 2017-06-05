/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uimetereologica;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Ciudad {
    
    private ArrayList<EstacionMeteorologica> estacion; //Campo de la clase

    public Ciudad() {
        this.estacion = new ArrayList<>();
    }

    public ArrayList<EstacionMeteorologica> getEstacion() {
        return estacion;
    }

    public void setEstacion(ArrayList<EstacionMeteorologica> estacion) {
        this.estacion = estacion;
    }
    
    public void addEstacion (EstacionMeteorologica e){
        estacion.add(e);
    }
    
    @Override
    public String toString(){
        String info="";
        for (EstacionMeteorologica estacionMeteoro : estacion) {
           
            info+= " " + estacionMeteoro.toString();
        }
        return info;
        
}
    
    
    
}
