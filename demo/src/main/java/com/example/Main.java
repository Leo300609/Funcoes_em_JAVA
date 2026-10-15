package com.example;

import java.util.Scanner;

public class Main {
    // Funções Calculadoras
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

    // Funções Exercícios
    public static void imprimirSaudacao() {
        System.out.println("Bem-vindo ao sistema!");
    }

    public static int dobrar(int numero) {
        return numero * 2;
    }

    public static double converterCelsiusParaFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static boolean verificarPar(int numero) {
        return numero % 2 == 0;
    }

    public static int encontrarMaior(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            System.out.println("Erro: Não é possível calcular o fatorial de um número negativo!");
            return -1;
        }
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static double calcularPotencia(int base, int expoente) {
        return Math.pow(base, expoente);
    }

    public static double calcularIMC(double peso, double altura) {
        if (altura <= 0) {
            System.out.println("Erro: A altura deve ser maior que zero!");
            return -1;
        }
        return peso / (altura * altura);
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

    public static void Exercicios_Funcoes1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1: Função que Imprime uma Mensagem​
        imprimirSaudacao();

        // Exercício 2: Função que Soma Dois Números​
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int resultadoSoma = somar(num1, num2);
        System.out.println("O resultado da soma é: " + resultadoSoma);

        // Exercício 3: Função para Calcular o Dobro de um Número​
        int numero = scanner.nextInt();
        int resultadoDobro = dobrar(numero);
        System.out.println("O dobro de " + numero + " é: " + resultadoDobro);

        // Exercício 4: Função para Converter Graus Celsius para Fahrenheit​
        double celsius = scanner.nextDouble();
        double fahrenheit = converterCelsiusParaFahrenheit(celsius);
        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");

        // Exercício 5: Função para Calcular a Média de Três Notas​
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double media = calcularMedia(nota1, nota2, nota3);
        System.out.println("A média das notas é: " + media);

        // Exercício 6: Função para Verificar se um Número é Par ou Ímpar​
        int numeroParImpar = scanner.nextInt();
        boolean isPar = verificarPar(numeroParImpar);
        if (isPar) {
            System.out.println(numeroParImpar + " é um número par.");
        } else {
            System.out.println(numeroParImpar + " é um número ímpar.");
        }

        // Exercício 7: Função para Determinar o Maior de Três Números​
        int maior1 = scanner.nextInt();
        int maior2 = scanner.nextInt();
        int maior3 = scanner.nextInt();
        int maior = encontrarMaior(maior1, maior2, maior3);
        System.out.println("O maior número é: " + maior);

        // Exercício 8: Função que Calcula o Fatorial de um Número​
        int numeroFatorial = scanner.nextInt();
        long fatorial = calcularFatorial(numeroFatorial);
        System.out.println("O fatorial de " + numeroFatorial + " é: " + fatorial);

        // Exercício 9: Função para Calcular a Potência de Um Número​´
        int base = scanner.nextInt();
        int expoente = scanner.nextInt();
        int potencia = (int) calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é: " + potencia);

        // Exercício 10: Função para Calcular o IMC​
        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double imc = calcularIMC(peso, altura);
        System.out.println("O IMC é: " + imc);

        scanner.close();
    }
}