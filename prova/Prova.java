package Prova;

/*
 Vitor de Oliveira Rodrigues CG3028704
:):)
 */
public class Prova {
    public static void main(String[] args) {
        Estacionamento e = new Estacionamento(100);

        Carro c = new Carro("ABC1234", "Gol", 4);
        Carro c1 = new Carro("ABC1234", "Prisma", 4);
        Moto m = new Moto("XYZ9876", "CG", 150);
        Caminhao cam = new Caminhao("TRK4567", "Volvo", 5000);

        e.adicionarVeiculo(c);
        e.adicionarVeiculo(m);
        e.adicionarVeiculo(cam);
        e.adicionarVeiculo(c1);//testando se permite adicionar veiculo que ja existe

        //informando entrada e saída
        c.entrada -= 400 * 60000; // 400 minutos atrás (~6h40min)
        c.registrarSaida();

        m.entrada -= 800 * 60000; // 800 minutos atrás (~13h20min)
        m.registrarSaida();

        cam.entrada -= 120 * 60000; // 120 minutos atrás (~2h)
        cam.registrarSaida();

        
        e.removerVeiculo("XYZ9876");
        e.removerVeiculo("TRK4567");

        e.relatorioVeiculos();
        e.relatorioFaturamento();
    }
}
