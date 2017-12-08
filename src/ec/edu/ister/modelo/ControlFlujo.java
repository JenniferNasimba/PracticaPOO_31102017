package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

public class ControlFlujo {
    int opcion=0; String op="";
    
    public static boolean getCheck() {
        boolean check = true;
        if (check == true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean getCheckOk() {
        boolean check = true;
        return check;
    }

    public static void comparacionFor() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 25 == 0) {
                System.out.println(i + ",");
            }
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 75 == 0) {
                System.out.println(i + ",");
            }
        }
    }

    public static void unionFor() {
        for (int i = 1; i < 6; i += 2) {
            for (int j = 0; j < 3; j++) {
                if (i + j > 4) {
                    break;
                }
                System.out.println(i * j);

            }

        }
    }
    public static String estadoAnimo(){
        String result;
        int x = 1;
        do {            
            int valor= Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese "
                + "su estado de 0 a 10"));
        
        result =(valor<=10&&valor>=7)?"Emocionado"
                + "":(valor<=6&&valor>=4)?"alegre":"triste";
        x=JOptionPane.showConfirmDialog(null, "continuas");
        } while (x !=1);
        
        return result;
    }
            
}
