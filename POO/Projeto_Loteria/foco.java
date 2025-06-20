package POO.Projeto_Loteria;

import java.util.Arrays;
import java.util.Scanner;

public class foco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberBilhete;
        boolean verifyEqual;

        int[] numbersLoterica = new int[6];

        for (int i = 0; i < 6; i++) {
            verifyEqual = false;
            while (true) {
                System.out.println("\nInsíra um Número de 0 a 60");
                numberBilhete = scanner.nextInt();
                for (int a = 0; a < 1; a++) {
                    if (numberBilhete < 0 || numberBilhete > 60) {
                        System.out.println("\nO Número deve ser entre 0 a 60");
                        verifyEqual = true;
                        break;
                    }
                    verifyEqual = false;
                    for (int j = 0; j < numbersLoterica.length; j++) {
                        if (numberBilhete == numbersLoterica[j]) {
                            verifyEqual = true;
                            break;
                        }
                    }
                    if (verifyEqual == false) {
                        numbersLoterica[i] = numberBilhete;
                        break;
                    }
                    System.out.println("\nNão pode repetir Números\n");
                }
                if (verifyEqual == false) {
                    numbersLoterica[i] = numberBilhete;
                    break;
                }
                System.out.println("\nNão pode repetir Números\n");
            }
        }

        Arrays.sort(numbersLoterica);
        Bilhete bilhete1 = new Bilhete(numbersLoterica);
        bilhete1.realizarSorteio();

        for (int i = 0; i < numbersLoterica.length; i++) {
            numbersLoterica[i] = 100;
        }

        for (int i = 0; i < 6; i++) {
            verifyEqual = false;
            while (true) {
                System.out.println("\nInsíra um Número de 0 a 60");
                numberBilhete = scanner.nextInt();
                for (int a = 0; a < 1; a++) {
                    if (numberBilhete < 0 || numberBilhete > 60) {
                        System.out.println("\nO Número deve ser entre 0 a 60");
                        verifyEqual = true;
                        break;
                    }
                    verifyEqual = false;
                    for (int j = 0; j < numbersLoterica.length; j++) {
                        if (numberBilhete == numbersLoterica[j]) {
                            verifyEqual = true;
                            break;
                        }
                    }
                    if (verifyEqual == false) {
                        numbersLoterica[i] = numberBilhete;
                        break;
                    }
                    System.out.println("\nNão pode repetir Números\n");
                }
                if (verifyEqual == false) {
                    numbersLoterica[i] = numberBilhete;
                    break;
                }
                System.out.println("\nNão pode repetir Números\n");
            }
        }

        Arrays.sort(numbersLoterica);
        Bilhete bilhete2 = new Bilhete(numbersLoterica);

        bilhete2.realizarSorteio();

        System.out.println(bilhete1.showResult());
        System.out.println(bilhete2.showResult());

        scanner.close();

    }

}
