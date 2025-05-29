package Prova;

public class Estacionamento {
    Veiculo[] vagas;
    int capacidade;
    int total;
    String[] datas;
    double[] faturamentos;
    int dias;

    public Estacionamento(int capacidade) {
        this.capacidade = capacidade;
        vagas = new Veiculo[capacidade];
        total = 0;
        datas = new String[100];
        faturamentos = new double[100];
        dias = 0;
    }

    public boolean veiculoJaEstacionado(String placa) {
        for (int i = 0; i < total; i++) {
            if (vagas[i] != null && vagas[i].getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }

    public boolean adicionarVeiculo(Veiculo v) {
        if (total >= capacidade) {
            System.out.println("------------------");
            System.out.println("Estacionamento lotado!!! Volte mais tarde.");
            return false;
        }
        if (veiculoJaEstacionado(v.getPlaca())) {
            System.out.println("------------------------");
            System.out.println("ERRO! Veiculo placa: " + v.getPlaca() + " ja esta estacionado.");
            return false;
        }
        v.registrarEntrada();
        vagas[total++] = v;
        System.out.println("---------------------------");
        System.out.println("Veiculo adicionado:\n" + v);
        return true;
    }

    public boolean removerVeiculo(String placa) {
        for (int i = 0; i < total; i++) {
            if (vagas[i] != null && vagas[i].getPlaca().equals(placa)) {
                vagas[i].registrarSaida();
                double valor = vagas[i].calcularValorFinal();
                String data = obterDataSimples();

                int pos = encontrarIndiceData(data);
                if (pos == -1) {
                    datas[dias] = data;
                    faturamentos[dias] = valor;
                    dias++;
                } else {
                    faturamentos[pos] += valor;
                }
                
                System.out.println("----------------------------");
                System.out.println("Saida registrada para: " + vagas[i]);
                System.out.println(vagas[i].getResumoPagamento());

                for (int j = i; j < total - 1; j++) {
                    vagas[j] = vagas[j + 1];
                }
                vagas[total - 1] = null;
                total--;
                return true;
            }
        }
        System.out.println("------------------------");
        System.out.println("Veiculo nao encontrado.");
        return false;
    }

    private int encontrarIndiceData(String data) {
        for (int i = 0; i < dias; i++) {
            if (datas[i].equals(data)) return i;
        }
        return -1;
    }

    public void relatorioVeiculos() {
        System.out.println("-----------------------------");
        System.out.println("== Veiculos Estacionados ==");
        for (int i = 0; i < total; i++) {
            System.out.println(vagas[i]);
        }
    }

    public void relatorioFaturamento() {
        System.out.println("-------------------------------");
        System.out.println("== Faturamento Diario ==");
        for (int i = 0; i < dias; i++) {
            System.out.println(datas[i] + " - R$" + faturamentos[i]);
        }
    }

    private String obterDataSimples() {
        long millis = System.currentTimeMillis();
        long dias = millis / (1000 * 60 * 60 * 24);
        long dia = (dias % 30) + 1;
        long mes = ((dias / 30) % 12) + 1;
        long ano = 2025;
        return (dia < 10 ? "0" + dia : "" + dia) + "/" + (mes < 10 ? "0" + mes : "" + mes) + "/" + ano;
    }
}
