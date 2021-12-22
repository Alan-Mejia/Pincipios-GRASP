package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.vista.multiplicarButton.addActionListener(this);

    }

    public void iniciar(){
        //vista.panel1
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNumeroUno(Integer.parseInt(vista.numero1.getText()));
        modelo.setNumeroDos(Integer.parseInt(vista.numero2.getText()));
        modelo.multiplicar();
        vista.resultado.setText(String.valueOf(modelo.getResultado()));
    }
}
