
public class CondicionMayorKilometros implements Condicion {

    double kilometros;

    public CondicionMayorKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public boolean cumpleRequisitos(Vehiculo vehiculo) {
        return vehiculo.getKilometrosRecorridos() > this.kilometros;
    }

}
