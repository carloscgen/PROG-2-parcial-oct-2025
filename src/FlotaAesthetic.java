
public class FlotaAesthetic extends Flota {

    @Override
    public void agregarElemento(Elemento elemento) {
        if (elemento.tieneCaracteristica("Beige")) {
            super.agregarElemento(elemento);
        }
    }

}
