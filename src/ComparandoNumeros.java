//Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner entradaDeDados = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = entradaDeDados.nextInt();
        System.out.println("Digite outro inteiro: ");
        int num2 = entradaDeDados.nextInt();

        if(num1 > num2){
            System.out.println("Número 1 é maior");
        } else if (num2 > num1)  {
            System.out.println("Número 2 é maior");
        } else {
            System.out.println("São iguais");
        }
    }
}
