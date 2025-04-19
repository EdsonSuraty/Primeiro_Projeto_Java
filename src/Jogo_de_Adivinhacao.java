import java.util.Random;
import java.util.Scanner;

public class Jogo_de_Adivinhacao {
    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);
        Random gerador  = new Random();

        int numeroAleatorio = gerador.nextInt(100);
        int i = 0;
        int numero = 0;

        while (numero != numeroAleatorio && i < 6){

            System.out.println("Escreva um número aleatório de 0 a 100");
            numero = entradaDeDados.nextInt();

            if (numero < 0 || numero > 100){
                System.out.println("Número inválido. Favor escrever um número de 0 a 100");
            } else if (numero > numeroAleatorio){
                System.out.println("O número escolhido é maior que o número gerado. Tente novamente");
                i++;
                System.out.println("Número de tentativas: " + i);
            } else if (numero < numeroAleatorio){
                System.out.println("O número escolhido é menor que o número gerado. Tente novamente");
                i++;
                System.out.println("Número de tentativas: " + i);
            } else {
                System.out.println("Parabens, você acertou o número aleatório");
                i++;
                System.out.println("Número de tentativas: " + i);
            }
            if (i == 6) {
                System.out.println("Você atingiu o limite de tentativas, favor reiniciar.");
            }
        }
    }
}
