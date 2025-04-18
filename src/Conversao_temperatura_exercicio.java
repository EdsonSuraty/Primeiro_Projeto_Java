public class Conversao_temperatura_exercicio {
    public static void main(String[] args) {
        double temperaturaCelsius = 32;
        String mensagem = String.format("A temperatura %.2f°, em Celsius é igual a %.2f em Fahrenheit",temperaturaCelsius, converterTemperatura(temperaturaCelsius));
        System.out.println(mensagem);

        int fahrenheitInteiro = (int) converterTemperatura (temperaturaCelsius);
        String mensagemFahrenheitInteiro = String.format("O valor inteiro da temperatura em Fahrenheit é: %d", fahrenheitInteiro);

        System.out.println(mensagemFahrenheitInteiro);
    }
    
    public static double converterTemperatura(double temperaturaCelsius){
        return (temperaturaCelsius * 1.8) +32;
    }
}
