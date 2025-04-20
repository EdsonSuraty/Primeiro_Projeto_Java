import java.util.Random;
import java.util.Scanner;

public class Jogo_de_Adivinhacao_FOR {
    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);
        Random gerador = new Random();

        int numeroAleatorio = gerador.nextInt(101);
        int numero = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Tentativa " + i + " de 5: Escreva um número de 0 a 100:");
            numero = entradaDeDados.nextInt();

            if (numero < 0 || numero > 100) {
                System.out.println("Número inválido. Favor escrever um número de 0 a 100.");
                i--; // Não conta como tentativa
                continue;
            }

            if (numero > numeroAleatorio) {
                System.out.println("O número escolhido é maior que o número gerado. Tente novamente.");
            } else if (numero < numeroAleatorio) {
                System.out.println("O número escolhido é menor que o número gerado. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número aleatório em " + i + " tentativa(s)!");
                break;
            }

            if (i == 5) {
                System.out.println("Você atingiu o limite de tentativas. O número era: " + numeroAleatorio);
            }
        }
    }
}
