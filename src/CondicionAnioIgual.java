
public class CondicionAnioIgual implements Condicion {

    int anio;

    public CondicionAnioIgual(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumpleRequisitos(Vehiculo vehiculo) {
        return vehiculo.getAnio() == this.anio;
    }
}
