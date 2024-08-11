/*
* Reescreva as propriedades e métodos da classe Data, deixando-os de acordo com
* o padrão UML (Getter e Setter).
* @author: João Marcos Teles Silva CB3026787
* O construtor ConsultaAgendada deve nos permitir a digitação dos valores de data, hora, nome do paciente e do médico;
* Os outros dois construtores devem receber os valores de data, hora, nome do
* paciente e do médico sob a forma de parâmetros;
* Qualquer construtor chamado deve acrescer 1 no atributo quantidade.
* Os métodos setData(), setHora(), setNomePaciente(), setNomeMedico() devem nos
* permitir alterar os valores das respectivas propriedades através da digitação de
* novos valores;
* Os demais métodos “set” devem alterar os valores das propriedades a partir dos
* parâmetros recebidos;
* O método getData() deve nos devolver a data no formato: dd/mm/aa;
* O método getHora() deve nos devolver a hora no formato: hh:mm:ss.
* Usando a classe ConsultaAgendada instancie o objeto p1 inicializado-o com o
* construtor ConsultaAgendada (int h, int mi, int s, int d, int m, int a, String p, String m);
* Exiba todas as propriedades de p1;
* Agora instancie o objeto p2 usando o construtor ConsultaAgendada ();
* Exiba todas as propriedades de p2;
* Usando os métodos setData(), setHora(), setNomePaciente(), setNomeMedico altere
* as propriedades de p1;
* Exiba todas as propriedades de p1 novamente.
* Exiba a quantidade final de consultas.
*/


import java.util.Scanner;

public class ConsultaAgendada {

    Scanner scanner = new Scanner(System.in);

    private Data data;
    private Hora hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0;

    public ConsultaAgendada() {
        
        System.out.println("Digite os detalhes da consulta:");

        setData();
        setHora();

        scanner.nextLine(); 

        setNomePaciente();
        setNomeMedico(); 

        quantidade++;
    }

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String nomeMedico) {
        // Inicialização do objeto 'hora'
        this.hora = new Hora(); 

        setHora(h, mi, s);
        setData(d, m, a);
        setNomePaciente(p);
        this.nomeMedico = nomeMedico; 
        quantidade++;
    }

    public ConsultaAgendada(Data d, Hora h, String p, String m) {
        this.data = d;
        this.hora = h;
        setNomePaciente(p);
        setNomeMedico(m);
        quantidade++;
    }

    public void setData() {
        System.out.print("Dia: ");
        int d = scanner.nextInt();
        System.out.print("Mês: ");
        int m = scanner.nextInt();
        System.out.print("Ano: ");
        int a = scanner.nextInt();
        this.data = new Data(d, m, a);
    }

    public void setData(int d, int m, int a) {
        this.data = new Data(d, m, a);
    }

    public void setHora() {
        System.out.print("Hora (HH MM SS): ");
        int h = scanner.nextInt();
        int mi = scanner.nextInt();
        int s = scanner.nextInt();
        this.hora = new Hora(h, mi, s);
    }

    public void setHora(int h, int mi, int s) {
        if (this.hora == null) {
            this.hora = new Hora();
        }
        this.hora.setHora(h, mi, s);
    }

    public void setNomePaciente() {
        System.out.print("Nome do paciente: ");
        this.nomePaciente = scanner.nextLine();
    }

    public void setNomePaciente(String p) {
        this.nomePaciente = p;
    }

    public void setNomeMedico() {
        System.out.print("Nome do médico: ");
        this.nomeMedico = scanner.nextLine();
    }

    public void setNomeMedico(String m) {
        this.nomeMedico = m;
    }

    public int getAmostra() {
        return quantidade;
    }

    public String getData() {
        return this.data.getData();
    }

    public String getHora() {
        return this.hora.getHora();
    }

    public String getNomePaciente() {
        return this.nomePaciente;
    }

    public String getNomeMedico() {
        return this.nomeMedico;
    }

    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 8, 2024, "João Silva", "Dr. Carlos");

        System.out.println("p1:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println();

        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("p2:");
        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());
        System.out.println();

        p1.setData(1, 9, 2024);
        p1.setHora(11, 45, 0);
        p1.setNomePaciente("Maria Oliveira");
        p1.setNomeMedico("Dra. Fernanda");

        System.out.println("p1 alterado:");
        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println();

        System.out.println("Quantidade final de consultas: " + ConsultaAgendada.quantidade);
    }
}
