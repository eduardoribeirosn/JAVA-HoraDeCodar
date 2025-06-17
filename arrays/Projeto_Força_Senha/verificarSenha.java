package arrays.Projeto_Força_Senha;

/*
    1 - Importar Scanner: Importar a classe Scanner para capturar a entrada do usuário.

    2 - Receber Senha: Solicitar ao usuário que digite uma senha
    e armazená-la em uma variável.

    3 - Verificar Forca da Senha: Chamar o metodo verificarForcaSenha
    para avaliar a força da senha.

    4 - Avaliar e Exibir Resultado: Exibir uma mensagem indicando a força da senha
    com base no valor retornado.

    5 - Fechar Scanner: Fechar o Scanner para liberar recursos.
*/

import java.util.Scanner;

public class verificarSenha {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma senha, e saiba sua força: ");
        String password = scanner.nextLine();

        verificadorForcaSenha(password);

        scanner.close();

    }

    public static void verificadorForcaSenha(String password) {

        int contPoints = 0;

        // Tem 8 ou mais caracteres
        if (password.length() >= 8) {
            contPoints++;
        }
        // Tem pelo menos 1 Letra Minúscula
        if (!password.equals(password.toUpperCase())) {
            contPoints++;
        }
        // Tem pelo menos 1 Letra Maiúscula
        if (!password.equals(password.toLowerCase())) {
            contPoints++;
        }
        // Tem pelo menos 1 Caracter Especial
        if (password.matches(".*[^a-zA-Z0-9].*")) {
            contPoints++;
        }
        // Tem pelo menos 1 Número
        for (int i = 0; i <= 9; i++) {
            if (password.contains("" + i)) {
                contPoints++;
                break;
            }
        }

        switch (contPoints) {
            case 0:
                System.out.println("Senha Muito Fraca!");
                System.out.println("Grupo 0");
                return;
            case 1:
                System.out.println("Senha Fraca!");
                System.out.println("Grupo 1");
                return;
            case 2:
                System.out.println("Senha Média!");
                System.out.println("Grupo 2");
                return;
            case 3:
                System.out.println("Senha Boa!");
                System.out.println("Grupo 3");
                return;
            case 4:
                System.out.println("Senha Muito Boa!");
                System.out.println("Grupo 4");
                return;
            case 5:
                System.out.println("Senha Ótima!");
                System.out.println("Grupo 5");
                return;
            default:
                System.out.println("Algo deu errado! rsrs...");
        }

    }

}
