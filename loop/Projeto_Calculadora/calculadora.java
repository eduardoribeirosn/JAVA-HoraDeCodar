package loop.Projeto_Calculadora;

import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int option, option2;

        externo:
        do {
            System.out.println("\n---Calculadora---\n");
            System.out.println("Digite o Número 1: ");
            double n1 = scanner.nextDouble();
            System.out.println("Digite o Número 2: ");
            double n2 = scanner.nextDouble();

            System.out.println("\nEscolha uma operação: \n");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Encerrar");
            option = scanner.nextInt();

            System.out.println("\n");

            switch (option) {
                case 1:
                    System.out.println("A Soma é = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("A Subtração é = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("A Multiplicação é = " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("ERROR, Não é possível dividir por 0!!!");
                        break externo;
                    }
                    System.out.println("A Divisão é = " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("Encerrando");
                    break externo;
                default:
                    System.out.println("ERROR, opção inválida! Escolha um número de 1 a 5!");
                    break;
            }

            System.out.println("\nDeseja fazer outra conta? (1-SIM/2-NÃO)");
            option2 = scanner.nextInt();
        } while (option2 != 2);

        scanner.close();

    }

}
