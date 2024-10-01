public class App {
    public static void main(String[] args) throws Exception {
        PartidoFutbolLigaEspanola partido = new PartidoFutbolLigaEspanola();

        System.out.println("Duración del partido: " + PartidoFutbolLigaEspanola.duracionPartidoFutbol);
        partido.setEquipoLocal("Real Madrid");
        partido.setEquipoVisitante("Barcelona");
        partido.setGolesEquipoLocal(3);
        partido.setGolesEquipoVisitante(3);
        partido.imprimirMarcador();
    }
}
