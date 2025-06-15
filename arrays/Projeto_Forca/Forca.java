package arrays.Projeto_Forca;

/*
    1 - Importar Scanner: Importar a classe Scanner para capturar a entrada do usuário.

    2 - Definir Palavra Secreta: Criar uma variável palavraSecreta
    com a palavra a ser adivinhada e inicializar um array palavraOculta
    com caracteres de sublinhado para representar a palavra oculta.

    3 -Configurar Tentativas: Definir o número máximo de tentativas
    e uma variável para verificar se o usuário venceu.

    4 - Loop Principal: Criar um loop que continua enquanto houver tentativas restantes.

    5 - Exibir Status: Mostrar a palavra oculta e o número de tentativas restantes.
    Solicitar a entrada do usuário para uma letra.

    6 - Verificar Letra: Comparar a letra inserida com a palavra secreta.
    Atualizar a palavra oculta se a letra for correta.
    Diminuir o número de tentativas se a letra for incorreta.

    7 - Verificar Vitória: Verificar se a palavra oculta corresponde à palavra secreta
    e sair do loop se o usuário vencer.

    8 -Finalizar Jogo: Exibir mensagem de vitória ou derrota e mostrar a palavra secreta.

    9 -Fechar Scanner: Fechar o Scanner para liberar recursos.
*/

import java.util.Scanner;
import java.util.Arrays;

public class Forca { 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String secretWord = scanner.nextLine();
        String[] hiddenWord = new String[secretWord.length()];
        Arrays.fill(hiddenWord, "_");

        int contError = 0;
        boolean youWon = false;
        boolean correctWord = false;
        String showWord = "";
        String tryWord = "";
        String attemptsLyrics = "";

        while(contError < 10) {

            showWord = "";
            correctWord = false;

            for (int i = 0; i < hiddenWord.length; i++) {
                
                showWord += hiddenWord[i];

            }

            System.out.println("\n\n\n\n\n\nTentativas restantes: " + (10 - contError) + "\nLetras erradas: " + attemptsLyrics + "\n" + showWord + "\n\nDigite uma letra: ");
            tryWord = scanner.nextLine();


            for (int i = 0; i < hiddenWord.length; i++) {
                if (tryWord.equalsIgnoreCase(secretWord.substring(i, i + 1))) {
                    hiddenWord[i] = secretWord.substring(i, i + 1);
                    correctWord = true;
                }
            }
            if (correctWord == false) {
                if(attemptsLyrics.indexOf(tryWord.toUpperCase()) == -1) {
                    contError++;
                    attemptsLyrics += tryWord.toUpperCase() + ", ";
                }
            }

            showWord = "";

            for (int i = 0; i < hiddenWord.length; i++) {
                
                showWord += hiddenWord[i];

            }

            if (showWord.equalsIgnoreCase(secretWord)) {
                youWon = true;
                break;
            }
        }

        if (youWon == true) {
            System.out.println("\nVocê Venceu!!!");
            System.out.println("\nA Palavra secreta é: " + secretWord + "\n");    
        } else {
            System.out.println("\nVocê Perdeu!!!");
            System.out.println("\nA Palavra secreta é: " + secretWord + "\n");
        }
        
        scanner.close();

    }
    
}
