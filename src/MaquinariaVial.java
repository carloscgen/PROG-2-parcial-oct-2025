
public class MaquinariaVial extends Vehiculo {

    private double horasTrabajadas;
    private static double valorHora = 3200;

    public MaquinariaVial(String patente, int anio, double kilometos_recorridos, int asientos, double horasTrabajadas) {
        super(patente, anio, kilometos_recorridos, asientos);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double getCostoMantenimiento() {
        return horasTrabajadas * valorHora;
    }

    public static void updateValorHora(double nuevoValorHora) {
        valorHora = nuevoValorHora;
    }

}
