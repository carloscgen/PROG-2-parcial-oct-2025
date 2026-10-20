
import java.util.List;

public abstract class Elemento {

    public abstract int getAnio();

    public abstract int getAsientos();

    public abstract double getKilometrosRecorridos();

    public abstract double getCostoMantenimiento();

    public abstract boolean tieneCaracteristica(String caracteristica);

    public abstract List<Vehiculo> buscar(Condicion condicion);
}
