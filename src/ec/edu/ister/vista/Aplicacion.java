package ec.edu.ister.vista;

import ec.edu.ister.modelo.ControlFlujo;
import javax.swing.JOptionPane;

/**
 * @Estructura de datos
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Aplicacion {
    public static void main(String[] args) {
        System.out.println(ControlFlujo.getCheckOk());
        JOptionPane.showMessageDialog(null,ControlFlujo.estadoAnimo());
//      int x=JOptionPane.showConfirmDialog(null, "continuas");
//      JOptionPane.showMessageDialog(null,""+x);

    }

    
}
