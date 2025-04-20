import java.util.Scanner;

public class TestandoNumero {
    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Escreva um número inteiro: ");
        int numero = entradaDeDados.nextInt();

        if (numero > 0){
            System.out.println("Número positivo");
        } else if (numero <0 ){
            System.out.println("Número negativo");
        } else {
            System.out.println("O número é 0");
        }
    }
}
