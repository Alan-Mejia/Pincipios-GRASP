package Creator;

import java.util.ArrayList;
import java.util.Optional;

public class CarritoCompras {
    private int idCliente;
    private Items item;

    public CarritoCompras(int idCliente){
        this.idCliente = idCliente;
    }

    public void agregaItem()throws NullPointerException{
            Optional<Items> nuevoItem = Optional.of(new Items(item.getNombreItem(), item.getCantidad(), item.getValor()));
    }

    public float venta(ArrayList<Items> items){
        float total = 0.0F;


        return total;
    }

    public static void main(String[] args){
        CarritoCompras primerCompra = new CarritoCompras(10);
        primerCompra.agregaItem();
    }

}
