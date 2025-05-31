package variaveis.Projeto_Calculadora;

import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem Vindo a calculadora de IMC!!!");
        System.out.println("Favor informar seu peso em KG: ");
        float peso = scanner.nextFloat();

        System.out.println("Agora favor informar sua altura em metros: ");
        float altura = scanner.nextFloat();

        float imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do Peso.");
        } else if (imc < 24.9) {
            System.out.println("Peso Normal.");
        } else if (imc < 29.9) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidade.");
        }

        scanner.close();

    }

}
