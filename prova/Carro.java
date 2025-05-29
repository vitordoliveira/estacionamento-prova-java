package Prova;

public class Carro extends Veiculo {
    int quantidadePortas;

    public Carro(String placa, String modelo, int quantidadePortas) {
        super(placa, modelo, "Carro");
        this.quantidadePortas = quantidadePortas;
    }

    public String toString() {
        return "Carro - Placa: " + placa + ", Modelo: " + modelo + ", Portas: " + quantidadePortas;
    }
}
