
import java.util.ArrayList;
import java.util.List;

public class Flota extends Elemento {

    private List<Elemento> elementos;

    public Flota() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public int getAnio() {
        int anioMasAntiguo = -1;

        for (Elemento elemento : elementos) {
            int anio = elemento.getAnio();

            if (anio != -1 && (anioMasAntiguo == -1 || anio < anioMasAntiguo)) {
                anioMasAntiguo = anio;
            }
        }

        return anioMasAntiguo;
    }

    @Override
    public int getAsientos() {
        int totalAsientos = 0;
        for (Elemento elemento : elementos) {
            totalAsientos += elemento.getAsientos();
        }
        return totalAsientos;
    }

    @Override
    public double getKilometrosRecorridos() {
        double totalKilometros = 0;
        for (Elemento elemento : elementos) {
            totalKilometros += elemento.getKilometrosRecorridos();
        }
        return totalKilometros;
    }

    @Override
    public double getCostoMantenimiento() {
        double totalCostoMantenimiento = 0;
        for (Elemento elemento : elementos) {
            totalCostoMantenimiento += elemento.getCostoMantenimiento();
        }
        return totalCostoMantenimiento;
    }

    @Override
    public boolean tieneCaracteristica(String caracteristica) {
        for (Elemento elemento : elementos) {
            if (elemento.tieneCaracteristica(caracteristica)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Vehiculo> buscar(Condicion condicion) {

        List<Vehiculo> resultado = new ArrayList<>();

        for (Elemento elemento : elementos) {
            resultado.addAll(elemento.buscar(condicion));
        }

        return resultado;
    }

    public void agregarElemento(Elemento elemento) {
        this.elementos.add(elemento);
    }

}
