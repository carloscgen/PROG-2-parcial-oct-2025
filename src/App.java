
import java.util.List;

public class App {

    public static void main(String[] args) {

        // =========================
        // VEHICULOS
        // =========================
        VehiculoPasajeros taxi1 = new VehiculoPasajeros("AA111AA", 2008, 100, 4, 50.0, 2010, 100.0);
        VehiculoPasajeros taxi2 = new VehiculoPasajeros("BB222BB", 2022, 50, 4, 50.0, 2020, 100.0);

        Colectivo urbano
                = new Colectivo("CC333CC", 2018, 5000, 30, 100.0);

        Colectivo media
                = new Colectivo("DD444DD", 2015, 120000, 40, 150.0);

        Colectivo combi
                = new Colectivo("EE555EE", 2023, 8000, 20, 120.0);

        VehiculoPasajeros remis
                = new VehiculoPasajeros("FF666FF", 2018, 200, 4, 50.0, 2020, 100.0);

        MaquinariaVial maquina
                = new MaquinariaVial(
                        "GG777GG",
                        2020,
                        0,
                        2,
                        10
                );

        taxi1.agregarCaracteristica("Buen estado");
        taxi2.agregarCaracteristica("Beige");
        urbano.agregarCaracteristica("Aire acondicionado");
        combi.agregarCaracteristica("Beige");

        // =========================
        // COSTOS INDIVIDUALES
        // =========================
        System.out.println("--- COSTOS ---");

        System.out.println("Taxi viejo: "
                + taxi1.getCostoMantenimiento());

        System.out.println("Taxi nuevo: "
                + taxi2.getCostoMantenimiento());

        System.out.println("Urbano: "
                + urbano.getCostoMantenimiento());

        System.out.println("Media distancia: "
                + media.getCostoMantenimiento());

        System.out.println("Combi escolar: "
                + combi.getCostoMantenimiento());

        System.out.println("Remis: "
                + remis.getCostoMantenimiento());

        System.out.println("Maquinaria vial: "
                + maquina.getCostoMantenimiento());

        // =========================
        // FLOTA Y SUBFLOTA
        // =========================
        Flota subFlota = new Flota();

        subFlota.agregarElemento(taxi1);
        subFlota.agregarElemento(combi);

        Flota flotaPrincipal = new Flota();

        flotaPrincipal.agregarElemento(taxi2);
        flotaPrincipal.agregarElemento(urbano);
        flotaPrincipal.agregarElemento(media);
        flotaPrincipal.agregarElemento(remis);
        flotaPrincipal.agregarElemento(maquina);

        // Acá probamos Composite de verdad:
        flotaPrincipal.agregarElemento(subFlota);

        System.out.println();
        System.out.println("--- FLOTA PRINCIPAL ---");

        System.out.println("Modelo más antiguo: "
                + flotaPrincipal.getAnio());

        System.out.println("Total asientos: "
                + flotaPrincipal.getAsientos());

        System.out.println("Total kilometros: "
                + flotaPrincipal.getKilometrosRecorridos());

        System.out.println("Costo mantenimiento total: "
                + flotaPrincipal.getCostoMantenimiento());

        System.out.println("¿Tiene Beige?: "
                + flotaPrincipal.tieneCaracteristica("Beige"));

        System.out.println("¿Tiene GPS?: "
                + flotaPrincipal.tieneCaracteristica("GPS"));

        // =========================
        // CONDICIONES
        // =========================
        Condicion posterioresA2020
                = new CondicionAnioMayor(2020);

        Condicion masDe10000Km
                = new CondicionMayorKilometros(10000);

        Condicion beige
                = new CondicionTieneCaracteristica("Beige");

        Condicion buenEstado
                = new CondicionTieneCaracteristica("Buen estado");

        Condicion condicionCombinada
                = new CondicionAND(
                        buenEstado,
                        new CondicionAnioMayor(2000)
                );

        // =========================
        // BUSQUEDAS RECURSIVAS
        // =========================
        System.out.println();
        System.out.println("--- BUSQUEDAS ---");

        List<Vehiculo> encontrados
                = flotaPrincipal.buscar(posterioresA2020);

        System.out.println(
                "Vehiculos posteriores a 2020: "
                + encontrados.size()
        );

        encontrados
                = flotaPrincipal.buscar(masDe10000Km);

        System.out.println(
                "Vehiculos con más de 10000 km: "
                + encontrados.size()
        );

        encontrados
                = flotaPrincipal.buscar(beige);

        System.out.println(
                "Vehiculos Beige: "
                + encontrados.size()
        );

        encontrados
                = flotaPrincipal.buscar(condicionCombinada);

        System.out.println(
                "Buen estado AND año > 2000: "
                + encontrados.size()
        );

        // =========================
        // FLOTAS RESTRINGIDAS
        // =========================
        System.out.println();
        System.out.println("--- FLOTAS RESTRINGIDAS ---");

        FlotaPorAnio flotaNueva
                = new FlotaPorAnio(
                        2024
                );

        flotaNueva.agregarElemento(taxi1);
        flotaNueva.agregarElemento(taxi2);

        System.out.println(
                "Flota por año - asientos: "
                + flotaNueva.getAsientos()
        );

        FlotaPorPocoUso pocoUso
                = new FlotaPorPocoUso(10000);

        pocoUso.agregarElemento(taxi1);
        pocoUso.agregarElemento(combi);
        pocoUso.agregarElemento(media);

        System.out.println(
                "Flota poco uso - asientos: "
                + pocoUso.getAsientos()
        );

        FlotaAesthetic aesthetic
                = new FlotaAesthetic();

        aesthetic.agregarElemento(taxi1);
        aesthetic.agregarElemento(taxi2);
        aesthetic.agregarElemento(combi);

        System.out.println(
                "Flota aesthetic - asientos: "
                + aesthetic.getAsientos()
        );

        // =========================
        // STATIC MAQUINARIA
        // =========================
        System.out.println();
        System.out.println("--- VALOR HORA MAQUINARIA ---");

        System.out.println(
                "Antes: "
                + maquina.getCostoMantenimiento()
        );

        MaquinariaVial.updateValorHora(4000);

        System.out.println(
                "Después: "
                + maquina.getCostoMantenimiento()
        );
    }
}
