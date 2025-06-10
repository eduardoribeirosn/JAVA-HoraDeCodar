package funcoes.Projeto_Conversor_de_Temperatura;

import java.util.Scanner;

public class conversor {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja converter qual temperatura?");
        System.out.println(
            "1 - De Celcius para Fahrenheit\n" +
            "2 - De Fahrenheit para Celcius"
        );
        int answer = scanner.nextInt();

        System.out.println("Qual a temperatura que deseja converter?");
        float temp = scanner.nextFloat();

        switch (answer) {
            case 1:
                System.out.println("A temperatura " + temp + "°C ficou " + conversorC(temp) + "°F");
                break;
            case 2:
                System.out.println("A temperatura " + temp + "°F ficou " + conversorF(temp) + "°C");
                break;
            default:
                System.out.println("Opção incorreta!");
                break;
        }

        scanner.close();

    }

    public static float conversorC(float x) {
        return x * 9/5 + 32;
    }

    public static float conversorF(float x) {
        return (x - 32) * 5/9;
    }

}
