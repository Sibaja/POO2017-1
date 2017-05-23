/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uimetereologica;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Registro {
    
    
    public void Escribir(String aux){

        File f = new File("C:\\Users\\Estudiante\\Documents\\NetBeansProjects\\UIMetereologica\\src\\uimetereologica\\datosEstacion.txt");

        try{
            f.createNewFile();

            if(!f.exists()){
                f.createNewFile();
            }

            FileWriter fw = new FileWriter(f, false);

            fw.write(aux);
            fw.close();
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "No se pudo crear y/o guardar el archivo",
                                          "ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    public String LeerTodo(){

        String Texto2 = "";

        try{
            FileReader fr = new FileReader("C:\\Users\\Estudiante\\Documents\\NetBeansProjects\\UIMetereologica\\src\\uimetereologica\\datosEstacion.txt");
            BufferedReader Lector = new BufferedReader(fr);

            String S;

            while( (S = Lector.readLine() ) != null){
                Texto2 = Texto2 + S + "\n";
            }
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "No se pudo abrir el archivo",
                                          "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return Texto2;
    }

}

    
    


