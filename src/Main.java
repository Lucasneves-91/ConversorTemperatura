import java.text.DecimalFormat;
import java.util.Scanner;

/** Criar um conversor de Celsius para Fahrenheit e de Fahrenheit para Celsius
 * Etapas:
 * 1 - Obter do usuário se ele quer converter Celsius ou Fahrenheit
 * 2 - Criar duas funções, uma para cada conversão
 * 3 - Obter a temperatura em cada uma das funções escolhidas
 * 4 - Exibir uma mensagem com a temperatura convertida.
 */

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#.##");
        double temperatura;

        System.out.println("""
                Qual a conversão que deseja realizar?
                1 - Celsius para Fahrenheit.
                2 - Fahrenheit para Celsius.
                """);

        switch (leitor.nextInt()) {
            case 1:
                System.out.println("Qual a temperatura que deseja converter: ");
                temperatura = leitor.nextDouble();
                System.out.println("De " + temperatura + "ºC para " + f.format(celsiusFahrenheit(temperatura)) + "ºF.");
                break;
            case 2:
                System.out.println("Qual a temperatura que deseja converter: ");
                temperatura = leitor.nextDouble();
                System.out.println("De " + temperatura + "ºF para " + f.format(fahrenheitCelsius(temperatura)) + "ºC.");
                break;
        }
    }

    public static double celsiusFahrenheit(double c) {
        return (c * 1.8) + 32;
    }

    public static double fahrenheitCelsius(double f) {
        return (f - 32) / 1.8;
    }
}
