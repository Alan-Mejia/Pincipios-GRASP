package InformationExpertxxxxCreator;

public class Finanzas {
    private int productosFinancieros;
    private int gastosFinancieros;

    public Finanzas(int productosFinancieros, int gastosFinancieros){
        this.productosFinancieros = productosFinancieros;
        this.gastosFinancieros = gastosFinancieros;
    }

    public int getProductosFinancieros() {
        return productosFinancieros;
    }

    public void setProductosFinancieros(int productosFinancieros) {
        this.productosFinancieros = productosFinancieros;
    }

    public int getGastosFinancieros() {
        return gastosFinancieros;
    }

    public void setGastosFinancieros(int gastosFinancieros) {
        this.gastosFinancieros = gastosFinancieros;
    }
}
