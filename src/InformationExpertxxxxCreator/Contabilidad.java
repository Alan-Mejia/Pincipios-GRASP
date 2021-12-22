package InformationExpertxxxxCreator;

public class Contabilidad {
    private Finanzas finanzas;
    private Produccion produccion;
    private Ventas ventas;

    public Contabilidad(Finanzas finanzas, Produccion produccion, Ventas ventas){
        this.finanzas = finanzas;
        this.ventas = ventas;
        this.produccion = produccion;
    }

    public float gastos(){
         float totalGastos = produccion.getCostosFijos() + produccion.getCostosVariables();
        return totalGastos;
    }

    public float ingresos(){
        float totalIngresos = ventas.getUnidadesVendidas() * ventas.getPrecioPorUnidad();
        return totalIngresos;
    }

    public float estadoDeResultados(){
        float resultado = ingresos() - gastos();
        return resultado;
    }


    public static void main(String[] args){

        Produccion objProduccion = new Produccion(20,50,60);
        Finanzas objFinanzas = new Finanzas(80,20);
        Ventas objVentas = new Ventas("Gustavo", 500,80);

        Contabilidad estadoDelMes = new Contabilidad(objFinanzas,objProduccion,objVentas);
        System.out.print("Los gastos del mes: " + estadoDelMes.gastos() +
                "\nLos ingresos del mes: " + estadoDelMes.ingresos() +
                "\nEl resultado del ejercicio: " + estadoDelMes.estadoDeResultados());

    }

}
