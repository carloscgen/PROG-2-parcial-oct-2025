
public class Colectivo extends Vehiculo {

    private double costoDiario;

    public Colectivo(String patente, int anio, double kilometos_recorridos, int asientos, double costoDiario) {
        super(patente, anio, kilometos_recorridos, asientos);
        this.costoDiario = costoDiario;
    }

    @Override
    public double getCostoMantenimiento() {
        return costoDiario * this.getAsientos();
    }

}
