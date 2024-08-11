

public class Data {
    private int dia;
    private int mes;
    private int ano;


    public Data(int d, int m, int a) {
        setData(d, m, a);
    }

    public void setData(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }



    public String mostraEmFormato() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    public String getData() {
        return mostraEmFormato();
    }
}
