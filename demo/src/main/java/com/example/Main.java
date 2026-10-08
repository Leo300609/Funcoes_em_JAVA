package com.example;

import java.util.Scanner;

public class Main {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int divisao(int a, int b) {
        // Evita divisão por zero que quebra o programa
        if (b == 0) {
            System.out.println("Erro: Não é possível dividir por zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        int resultado = 0;

        do {
            System.out.println("\n=====================================");
            System.out.println("Seja bem vindo à calculadora em JAVA");
            System.out.println("=====================================");
            System.out.println("1 - Fazer um cálculo");
            System.out.println("2 - Verificar último resultado");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Qual seu primeiro número? ");
                    int a = scanner.nextInt();

                    System.out.print("Qual operação deseja fazer? [+, -, *, /]: ");
                    scanner.nextLine();
                    String operador = scanner.nextLine();

                    System.out.print("Qual seu segundo número? ");
                    int b = scanner.nextInt();

                    switch (operador) {
                        case "+":
                            resultado = somar(a, b);
                            break;
                        case "-":
                            resultado = subtrair(a, b);
                            break;
                        case "*":
                            resultado = multiplicar(a, b);
                            break;
                        case "/":
                            resultado = divisao(a, b);
                            break;
                        default:
                            System.out.println("Por favor, insira um dos operadores indicados.");
                            break;
                    }
                    System.out.println("O resultado da sua operação é: " + resultado);
                    break;

                case 2:
                    System.out.println("O último resultado foi: " + resultado);
                    break;

                case 3:
                    System.out.println("Encerrando a calculadora, volte sempre...");
                    break;
                
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 3);

        scanner.close();
    }
}