package funcoes.Ex_1_2.Função_para_Converter_Temperatura;

import java.util.Scanner;

public class fpct {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite a temperatura em Celsius: ");
        double c = scanner.nextDouble();

        System.out.println(converter(c) + "°F");

        scanner.close();

    }

    public static double converter(double x) {
        return x * 9/5 + 32;
    }

}
