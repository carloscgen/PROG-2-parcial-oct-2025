public class Taxi extends Vehiculo {

    private double costoDiario;
    private int anioLimite;
    private double extra;

    public Taxi(String patente, int anio, double kilometrosRecorridos, int asientos, int anioLimite,
            double costoDiario, double extra) {
        super(patente, anio, kilometrosRecorridos, asientos);
        this.anioLimite = anioLimite;
        this.costoDiario = costoDiario;
        this.extra = extra;
    }

    public double getCostoMantenimiento() {
        double costo = this.costoDiario * getKilometrosRecorridos();
        if (getAnio() < this.anioLimite) {
            costo = costo + extra;
        }
        return costo;
    }
}
