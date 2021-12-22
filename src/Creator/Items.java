package Creator;

import java.util.ArrayList;

public class Items {
    private String nombreItem;
    private int cantidad;
    public int valor;

    public Items(String nombreItem, int cantidad, int valor){
        this.nombreItem = nombreItem;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getValor() {
        return valor;
    }

    public void crear(String nombreItem, int cantidad, int valor){
        Items nuevo = new Items(getNombreItem(),getCantidad(),getValor());
    }

    public float subtotal(ArrayList<Items> items){
        float subtotal = 0.0F;

        for(Items item : items){
            subtotal+=item.valor;
        }
        return subtotal;
    }

}
