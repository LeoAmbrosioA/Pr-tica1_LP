import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        double velocidade, tempo, distancia, kmLitro, consumo;

        System.out.println("Informe a velocidade: ");
        Scanner ler = new Scanner(System.in);
        velocidade = ler.nextDouble();

        System.out.println("Informe o tempo gasto: ");
        tempo = ler.nextDouble();
        System.out.println("Informe Km/Litro: ");
        kmLitro = ler.nextDouble();

        distancia = velocidade * tempo;
        consumo = distancia / kmLitro;

        System.out.println("Consumo médio: " + consumo);

    }



}
