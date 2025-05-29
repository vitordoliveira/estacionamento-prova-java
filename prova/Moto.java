package Prova;

public class Moto extends Veiculo {
    int cilindrada;

    public Moto(String placa, String modelo, int cilindrada) {
        super(placa, modelo, "Moto");
        this.cilindrada = cilindrada;
    }

    public String toString() {
        return "Moto - Placa: " + placa + ", Modelo: " + modelo + ", Cilindrada: " + cilindrada + "cc";
    }
}
