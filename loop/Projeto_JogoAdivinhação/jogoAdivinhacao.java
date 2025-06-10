package loop.Projeto_JogoAdivinhação;

import java.util.Scanner;

public class jogoAdivinhacao {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int vAleatorio = (int) (Math.random() * 99 + 1);

        int chute = 0;

        int tentativa = 0;

        while (vAleatorio != chute) {
            tentativa++;
            System.out.println("Escolha um Número entre 1 a 100: ");
            chute = scanner.nextInt();

            if (vAleatorio == chute) {
                if (chute == 1) {
                    System.out.println("Você acertou com " + tentativa + " tentativa.");
                } else { 
                    System.out.println("Você acertou com " + tentativa + " tentativas.");
                }
            } else {
                if (vAleatorio > chute) {
                    System.out.println("O Número alvo é maior que o palpite!");
                } else {
                    System.out.println("O Número alvo é menor que o palpite!");
                }
            }
        }

        scanner.close();

    }

}
