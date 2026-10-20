
public class VehiculoPasajeros extends Vehiculo {

    private double costoPorKilometro;
    private int anioLimite;
    private double extra;

    public VehiculoPasajeros(String patente, int anio, double kilometos_recorridos, int asientos, double costoPorKilometro,
            int anioLimite,
            double extra) {
        super(patente, anio, kilometos_recorridos, asientos);
        this.costoPorKilometro = costoPorKilometro;
        this.anioLimite = anioLimite;
        this.extra = extra;
    }

    @Override
    public double getCostoMantenimiento() {
        if (this.getAnio() < this.anioLimite) {
            return (this.costoPorKilometro * this.getKilometrosRecorridos()) + this.extra;
        } else {
            return (this.costoPorKilometro * this.getKilometrosRecorridos());
        }
    }

}
