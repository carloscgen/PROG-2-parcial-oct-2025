public class Taxi extends VehiculoPasajeros {

    private static int anioLimite = 2010;

    public Taxi(String patente, int anio, double kilometrosRecorridos, int asientos) {
        super(patente, anio, kilometrosRecorridos, asientos);
    }

    @Override
    public int getAnioLimite() {
        return anioLimite;
    }
}
