public class Operecoes {
    public static void main(String[] args) {
        System.out.println("Aqui é um estudo para fazer operações matemáticas");

        int primeiro_numero = 10;
        int segundo_numero = 5;

        int resultado_soma = Operecoes.soma(primeiro_numero, segundo_numero);
        System.out.println("a soma é: " + resultado_soma);

        int resultado_subtracao = Operecoes.subtracao(primeiro_numero, segundo_numero);
        System.out.println("a subtração é: " + resultado_subtracao);

    }

    public static int soma(int a, int b){
      return a + b;
    }

    public static int subtracao (int a, int b){
      return a - b;
    }

}
