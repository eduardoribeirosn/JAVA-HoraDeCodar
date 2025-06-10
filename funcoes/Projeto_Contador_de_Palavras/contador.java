package funcoes.Projeto_Contador_de_Palavras;

import java.util.Scanner;

public class contador {
    
    public static void main(String[] args) {

        System.out.println("Contador de Palavras!\n\n");

        contadorDePalavras();

    }

    public static void contadorDePalavras() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String phrase = scanner.nextLine();
        char space = ' ';

        String newText = phrase.trim();
        long cont = newText.chars().filter(l -> l == space).count();
        // OR String[] palavras = newText.split("\\s+");
        System.out.println("A frase tem " + (cont + 1) + " Palavras.\n");

        System.out.println("Deseja digitar outra frase?");
        System.out.println("1 - Sim\n2 - Não");
        int answer = scanner.nextInt();

        if (answer == 1) {
            contadorDePalavras();
        }

        scanner.close();
        
        return;
        
    }

}
