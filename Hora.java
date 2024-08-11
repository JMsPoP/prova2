public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora() {
        this(0, 0, 0);
    }

    public Hora(int hora, int minuto, int segundo) {
        setHora(hora, minuto, segundo);
    }

    public void setHora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String getHora() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }
}
