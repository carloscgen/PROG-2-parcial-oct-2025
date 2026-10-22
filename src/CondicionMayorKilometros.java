
public class CondicionMayorKilometros extends Condicion {

    private double kilometros;

    public CondicionMayorKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public boolean cumple(Elemento el) {
        return el.getKilometrosRecorridos() > this.kilometros;
    }

}
