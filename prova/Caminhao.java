package Prova;

public class Caminhao extends Veiculo {
    float capacidadeCarga;

    public Caminhao(String placa, String modelo, float capacidadeCarga) {
        super(placa, modelo, "Caminhao");
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Caminhao - Placa: " + placa + ", Modelo: " + modelo + ", Capacidade de carga: " + capacidadeCarga + "cc";
    }

    public double getTarifaMinuto() {
        return 0.20;
    }
}