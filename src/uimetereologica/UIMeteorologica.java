/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uimetereologica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author Estudiante
 */
public class UIMeteorologica {

    /**
     * @param args the command line arguments
     */
    
    private Ciudad [] ciudades;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ciudades [0] = new Ciudad(); 
        
        Ciudad bogota = new Ciudad();
        
        EstacionMeteorologica estacion1 = null;
        
        bogota.addEstacion(estacion1);
        bogota.toString();
        
        /*
        public void registrar (){}
        
        try
        {}
        */
        
    /**
     *
     * @param archivo
     * @return
     */
    public String Archivo(String archivo){
        
            String token = null;
            try{
            File f = new File (archivo);
            Scanner entrada = new Scanner (f);
            while(entrada.hasNextLine()){
                token=entrada.nextLine();
                System.out.println(token);
                }
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }
        return token;
        }
        
         public static String nombreEstac(String infotoken){
        String datos[] = infotoken.split(",");
        String ciudad = datos[0];
            if("Bogota".equals(ciudad)){
                return datos[0]; 
            }
           return null;
        }
        
    }
    
}
