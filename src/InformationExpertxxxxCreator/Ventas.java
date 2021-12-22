package InformationExpertxxxxCreator;

public class Ventas {
    private String cliente;
    private int unidadesVendidas;
    private int precioPorUnidad;

    public Ventas(String cliente, int unidadesVendidas, int precioPorUnidad){
        this.cliente = cliente;
        this.unidadesVendidas = unidadesVendidas;
        this.precioPorUnidad = precioPorUnidad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public int getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(int precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }
}
