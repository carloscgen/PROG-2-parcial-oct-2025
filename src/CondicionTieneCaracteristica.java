
public class CondicionTieneCaracteristica implements Condicion {

    String caracteristica;

    public CondicionTieneCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public boolean cumpleRequisitos(Vehiculo vehiculo) {
        return vehiculo.tieneCaracteristica(this.caracteristica);
    }

}
