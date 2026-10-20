public class Remis extends VehiculoPasajeros {

    private static int anioLimite = 2020;

    public Remis(String patente, int anio, double kilometrosRecorridos, int asientos) {
        super(patente, anio, kilometrosRecorridos, asientos);
    }

    @Override
    public int getAnioLimite() {
        return anioLimite;
    }
}
