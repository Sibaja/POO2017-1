
package interfazgrafica;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/*
 * Clase para fltrar los tipos de archivos
 * y que el JFileChooser solo permita seleccionar
 * imagenes
 */

public class FiltroArchivos extends FileFilter{

    private String [] extension;
    private String descripcion;

    public FiltroArchivos(String [] exten, String descrip){

        this.extension = exten;
        this.descripcion = descrip;
    }

    public boolean accept(File archivo){

        if(archivo != null){

            if(archivo.isDirectory()){
                return true;
            }
            for(int i=0; i<extension.length; i++){
                if(this.getExtension(archivo).equals(extension[i])){
                    return true;
                }
            }
        }
        return false;
    }

    public String getDescription(){
        return descripcion;
    }

    public String getExtension(File archivo){

        String nombreArchivo;

        int i;

        if(archivo != null){

            nombreArchivo = archivo.getName();
            i = nombreArchivo.lastIndexOf(".");

            if(i>0 && i<(nombreArchivo.length()-1)){
                return nombreArchivo.substring(i+1).toLowerCase();
            }
        }
        return "";
    }
}
