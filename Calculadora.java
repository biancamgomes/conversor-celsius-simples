package edu.projetospessoais;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Double num1;
        Double num2;
        Double resultado;
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o primeiro número: ");
        num1 = input.nextDouble();
        System.out.println("Por favor, digite o segundo número: ");
        num2 = input.nextDouble();
        System.out.println("Digite agora qual operação você quer fazer. Digite [+] se quiser fazer adição, [-] Subtração, [*] multiplicação ou [/] divisão. Digite a operação que você deseja: ");
        String operacao = input.next();
        input.close();

        try {
            switch (operacao) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Divisão por zero não é permitido");
                    } resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operação inválida!");
                    return;
            }
            System.out.println("O resultado é: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}

/* public class CepInvalidoException extends Exception */