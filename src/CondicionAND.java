
public class CondicionAND extends Condicion {

    private Condicion condicion1;
    private Condicion condicion2;

    public CondicionAND(Condicion condicion1, Condicion condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumple(Elemento el) {
        return condicion1.cumple(el) && condicion2.cumple(el);
    }

}
