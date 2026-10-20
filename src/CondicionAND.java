
public class CondicionAND implements Condicion {

    private Condicion condicion1;
    private Condicion condicion2;

    public CondicionAND(Condicion condicion1, Condicion condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    @Override
    public boolean cumpleRequisitos(Vehiculo vehiculo) {
        return condicion1.cumpleRequisitos(vehiculo) && condicion2.cumpleRequisitos(vehiculo);
    }

}
