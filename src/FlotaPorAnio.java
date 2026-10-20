
public class FlotaPorAnio extends Flota {

    private int anio;

    public FlotaPorAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public void agregarElemento(Elemento elemento) {
        if (elemento.getAnio() > this.anio) {
            super.agregarElemento(elemento);
        }
    }

}
