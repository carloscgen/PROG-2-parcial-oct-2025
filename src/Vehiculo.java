
import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo extends Elemento {

    private String patente;
    private int anio;
    private double kilometos_recorridos;
    private int asientos;
    private List<String> caracteristicas;

    public Vehiculo(String patente, int anio, double kilometos_recorridos, int asientos) {
        this.patente = patente;
        this.anio = anio;
        this.kilometos_recorridos = kilometos_recorridos;
        this.asientos = asientos;
        this.caracteristicas = new ArrayList<>();
    }

    public void agregarCaracteristica(String caracteristica) {
        caracteristicas.add(caracteristica);
    }

    public boolean tieneCaracteristica(String caracteristica) {
        return caracteristicas.contains(caracteristica);
    }

    // // puede seguir siendo abstracto porque depende del tipo concreto
    // @Override
    // public abstract double getCostoMantenimiento();
    @Override
    public int getAnio() {
        return this.anio;
    }

    @Override
    public int getAsientos() {
        return this.asientos;
    }

    @Override
    public double getKilometrosRecorridos() {
        return this.kilometos_recorridos;
    }

    @Override
    public List<Vehiculo> buscar(Condicion condicion) {
        List<Vehiculo> resultado = new ArrayList<>();

        if (condicion.cumpleRequisitos(this)) {
            resultado.add(this);
        }

        return resultado;
    }
}
