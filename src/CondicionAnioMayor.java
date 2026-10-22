
public class CondicionAnioMayor extends Condicion {

    private int anio;

    public CondicionAnioMayor(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Elemento el) {
        return el.getAnio() > this.anio;
    }
}
