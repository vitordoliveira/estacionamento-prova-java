package Prova;

public class Veiculo {
    String placa;
    String modelo;
    String tipo;
    long entrada;
    long saida;

    public Veiculo(String placa, String modelo, String tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public void registrarEntrada() {
        entrada = System.currentTimeMillis();
    }

    public void registrarSaida() {
        saida = System.currentTimeMillis();
    }

    public long tempoEstacionadoMinutos() {
        return (saida - entrada) / 60000;
    }

    public String tempoFormatado() {
        long totalMinutos = tempoEstacionadoMinutos();
        long horas = totalMinutos / 60;
        long minutos = totalMinutos % 60;
        return horas + "h " + minutos + "min";
    }

    public String horaFormatada(long millis) {
        long totalSegundos = millis / 1000;
        long segundos = totalSegundos % 60;
        long minutos = (totalSegundos / 60) % 60;
        long horas = (totalSegundos / 3600) % 24;
        return (horas < 10 ? "0" : "") + horas + ":" +
               (minutos < 10 ? "0" : "") + minutos + ":" +
               (segundos < 10 ? "0" : "") + segundos;
    }

    public String getHoraEntrada() {
        return horaFormatada(entrada);
    }

    public String getHoraSaida() {
        return horaFormatada(saida);
    }

    public double calcularValorBase() {
        long minutos = tempoEstacionadoMinutos();
        double valor = 0;
        if (tipo.equals("Carro")) valor = minutos * 0.10;
        else if (tipo.equals("Moto")) valor = minutos * 0.05;
        else if (tipo.equals("Caminhao")) valor = minutos * 0.20;
        return valor;
    }

    public double aplicarDesconto(double valor) {
        long minutos = tempoEstacionadoMinutos();
        if (minutos > 720) return valor * 0.8; // > 12h
        else if (minutos > 360) return valor * 0.9; // > 6h
        else return valor;
    }

    public double calcularValorFinal() {
        return aplicarDesconto(calcularValorBase());
    }

    public String getResumoPagamento() {
        double base = calcularValorBase();
        double finalValor = aplicarDesconto(base);
        double desconto = base - finalValor;
        return "Entrada: " + getHoraEntrada() + "\n" +
               "Saida:   " + getHoraSaida() + "\n" +
               "Tempo:   " + tempoFormatado() + "\n" +
               "Valor:   R$" + finalValor + "\n" +
               "Desconto aplicado: R$" + desconto;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }
}
