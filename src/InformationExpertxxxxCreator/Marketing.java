package InformationExpertxxxxCreator;

public class Marketing {
    private String nombreDeCampania;
    private String objetivo;
    private Contabilidad contabilidad;


    public Marketing(String nombreDeCampania, String objetivo, Contabilidad contabilidad){
        this.nombreDeCampania = nombreDeCampania;
        this.objetivo = objetivo;
        this.contabilidad = contabilidad;
    }

    public void estrategiaCampania(){
        System.out.println("Se busca incrementar un 20% los ingresos del mes pasado" +
                "\nIngresos del mes pasado: " + contabilidad.ingresos() +
                "\nObjetivo para este mes: " + contabilidad.ingresos()*1.20);
    }

    public static void main(String[] args){
        Produccion objProduccion = new Produccion(20,50,60);
        Finanzas objFinanzas = new Finanzas(80,20);
        Ventas objVentas = new Ventas("Gustavo", 500,80);
        Contabilidad estadoDelMes = new Contabilidad(objFinanzas,objProduccion,objVentas);

        Marketing primerEstrategia = new Marketing("La mejor Campaña","Aumentar ingresos", estadoDelMes);
        primerEstrategia.estrategiaCampania();
    }

}
