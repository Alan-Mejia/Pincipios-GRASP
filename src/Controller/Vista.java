package Controller;

import javax.swing.*;

public class Vista {
    public JTextField numero1;
    public JTextField numero2;
    public JButton multiplicarButton;
    public JTextField resultado;
    public JPanel panel1;




    public static void main(String[] args){
        Modelo modelo = new Modelo();
        Vista vista = new Vista();

        Controlador controlador = new Controlador(vista,modelo);
        controlador.iniciar();
        vista.panel1.setVisible(true);
    }
    /*public JButton getMultiplicarButton() {
        return multiplicarButton;
    }*/
   /*
    public Vista(String title){
        super(title);

    }*/
}
