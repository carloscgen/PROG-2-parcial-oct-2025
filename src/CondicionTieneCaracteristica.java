
public class CondicionTieneCaracteristica extends Condicion {

    private String caracteristica;

    public CondicionTieneCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public boolean cumple(Elemento el) {
        return el.tieneCaracteristica(this.caracteristica);
    }

}
