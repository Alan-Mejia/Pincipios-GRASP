package InformationExpert;

public class Produccion {
    private int precioUnidad;
    private int costosFijos;
    private int costosVariables;

    public Produccion(int precioUnidad, int costosFijos, int costosVariables){
        this.precioUnidad = precioUnidad;
        this.costosFijos = costosFijos;
        this.costosVariables = costosVariables;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getCostosFijos() {
        return costosFijos;
    }

    public void setCostosFijos(int costosFijos) {
        this.costosFijos = costosFijos;
    }

    public int getCostosVariables() {
        return costosVariables;
    }

    public void setCostosVariables(int costosVariables) {
        this.costosVariables = costosVariables;
    }
}
