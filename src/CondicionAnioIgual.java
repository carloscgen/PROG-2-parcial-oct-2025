
public class CondicionAnioIgual extends Condicion {

    private int anio;

    public CondicionAnioIgual(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Elemento el) {
        return el.getAnio() == this.anio;
    }
}
