import java.util.Scanner;

public class ConversorCelsius {
    public static void main(String[] args) {
        System.out.println("Digite a temperatura em Celsius: ");
        Scanner entrada = new Scanner(System.in);
        double celsius = entrada.nextDouble();
        entrada.close();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Essa temperatura em Celsius: " + celsius + "°" + " equivale a " + fahrenheit + "°" + " Fahrenheit");
    }
}
