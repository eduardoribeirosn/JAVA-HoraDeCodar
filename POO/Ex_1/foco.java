package POO.Ex_1;

import java.util.Scanner;

public class foco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Celular s23 = new Celular();
        Celular s21 = new Celular();
        s23.setModelo("S23");
        s23.setMarca("Samsung");
        s21.setModelo("S21");
        s21.setMarca("Samsung");
        // s23.showInfos();
        s23.ligarCelular(scanner);
        s21.ligarCelular(scanner);

        scanner.close();

    }
    
}
