
public abstract class VehiculoPasajeros extends Vehiculo {

    private static double costoPorKilometro = 2000.0;
    private static double extra = 500.0;

    public VehiculoPasajeros(String patente, int anio, double kilometos_recorridos, int asientos) {
        super(patente, anio, kilometos_recorridos, asientos);
    }

    public abstract int getAnioLimite();

    @Override
    public double getCostoMantenimiento() {
        double costoMantenimiento = costoPorKilometro * this.getKilometrosRecorridos();
        if (this.getAnio() < this.getAnioLimite()) {
            costoMantenimiento += extra;
        }
        return costoMantenimiento;
    }

}
