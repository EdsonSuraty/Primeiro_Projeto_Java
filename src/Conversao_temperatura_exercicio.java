public class Conversao_temperatura_exercicio {
    public static void main(String[] args) {

        double temperaturaCelsius = 32;
        String mensagem = """
                          A temperatura %.2f°, em Celsius é igual a %.2f em Fahrenheit""".formatted(temperaturaCelsius, converterTemperatura(temperaturaCelsius));

        System.out.println(mensagem);

        int fahrenheitInteiro = (int) converterTemperatura (temperaturaCelsius);

        String mensagemFahrenheitInteiro = """
                          O valor inteiro da temperatura em Fahrenheit é: %d""".formatted(fahrenheitInteiro);

        System.out.println(mensagemFahrenheitInteiro);

    }


    public static double converterTemperatura(double temperaturaCelsius){

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) +32;

        return  temperaturaFahrenheit;

    }

}
