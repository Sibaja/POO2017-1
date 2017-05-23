
package interfazgrafica;

import javax.swing.*;
import java.awt.event.*;

/*
 * Clase que crea el panel que mostrara
 * la informacion del programa
 */

public class PanelAcercaDe extends JPanel {

    private JLabel etiqueta;

    public PanelAcercaDe(){

        super();

        this.setLayout(null);

        JTextArea info = new JTextArea();
        info.setBounds(30,15,450,420);
        info.setEditable(false);
        info.setBackground(null);
        //info.setFont(Ventana.fuente1);

        info.setText("  La Unidad de Investigación Meteorología, \n\n" +
                     "  hace seguimiento en doce ciudades del estado del tiempo \n\n" +
                     "  Version 1.0\n\n" +
                     "  Desarrolladores:\n\n" +
                     "      Pérez Sibaja.\n" +
                     "      página: uim.com ");

        this.add(info);


        etiqueta = new JLabel(new ImageIcon("C:\\Users\\Estudiante\\Pictures\\Saved Pictures\\logo.jpg"));
        etiqueta.setBounds(575, 335, 133, 95);
        etiqueta.addMouseListener(new AdaptadorMouse());

        this.add(etiqueta);
    }

    /* manejo de eventos del mouse
     * cuando el mouse ingrese en un componente de
     * la interfaz se mostrara su descripcion en la
     * barra de estado
     */
    class AdaptadorMouse extends MouseAdapter{

        public void mouseEntered(MouseEvent ev){

            Object fuente = ev.getSource();

            /*
            if(fuente.equals(etiqueta)){
                Ventana.ayuda.setText("Ayuda");
            }
        }

        public void mouseExited(MouseEvent ev){
            Ventana.ayuda.setText(Ventana.help); */
        }
    }

}