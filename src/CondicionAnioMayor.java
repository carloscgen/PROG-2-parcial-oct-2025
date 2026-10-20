
public class CondicionAnioMayor implements Condicion {

    int anio;

    public CondicionAnioMayor(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumpleRequisitos(Vehiculo vehiculo) {
        return vehiculo.getAnio() > this.anio;
    }
}
