
public class FlotaPorPocoUso extends Flota {

    private int km;

    public FlotaPorPocoUso(int km) {
        this.km = km;

    }

    @Override
    public void agregarElemento(Elemento elemento) {
        if (elemento.getKilometrosRecorridos() <= km) {
            super.agregarElemento(elemento);
        }
    }

}
