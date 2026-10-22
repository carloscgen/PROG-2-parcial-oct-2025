
public class FlotaCondicionada extends Flota {

    private Condicion c;

    public FlotaCondicionada(Condicion c) {
        this.c = c;
    }

    @Override
    public void agregarElemento(Elemento elemento) {
        if (c.cumple(elemento)) {
            super.agregarElemento(elemento);

        }
    }

}
