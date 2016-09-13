/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import javax.swing.JOptionPane;

/**
 *
 * @author Herrera
 */
public class Password {
    private int longitud = 8;
    private String contraseña;

    public Password(String contraseña) {
        this.contraseña = contraseña;

    }
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
 public String CambiarContraseña() {
        String aux = null;
        int re, sw, sw_1;
        boolean a = true;
        do {
            sw = 1;

            try {
                aux = JOptionPane.showInputDialog("Digite nueva contraseña");

                if (aux.length() < 6) {

                    JOptionPane.showMessageDialog(null, "La contraseña es débil, vuelva a intentar");
                    sw_1 = 0;

                } else {
                    JOptionPane.showMessageDialog(null, "Nueva contraseña guardada");
                    this.contraseña = aux;
                    sw_1 = 1;
                }

            } catch (NullPointerException e) {
                re = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                if (re == 0) {
                    a = false;
                    sw = 1;
                } else {
                    sw = 0;
                }
            }
        } while (sw == 0);

        return this.contraseña;

    }
}

   
       
       
   

  