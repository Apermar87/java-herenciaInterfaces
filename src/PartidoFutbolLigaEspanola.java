public class PartidoFutbolLigaEspanola implements PartidoFutbol {

    private String equipoLocal;
    private String equipoVisitante;
    private int golesEquipoLocal;
    private int golesEquipoVisitante;



    public String getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }
    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }
    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }
    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }
    public void setGolesEquipoVisitante(int golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    public void imprimirMarcador(){
        System.out.println(equipoLocal + " " + golesEquipoLocal + " - " + golesEquipoVisitante + " " + equipoVisitante);
    }

}
