package variaveis.Projeto_Media;

import java.util.Scanner;

public class mediaAluno {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do Aluno: ");
        String nome = scanner.nextLine();

        System.out.println("Agora digite as 3 notas do Aluno: ");
        System.out.println("Nota 1: ");
        float n1 = scanner.nextFloat();
        System.out.println("Nota 2: ");
        float n2 = scanner.nextFloat();
        System.out.println("Nota 3: ");
        float n3 = scanner.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        System.out.println("O Aluno " + nome + " teve uma média de " + media + " pontos.");

        if(media >= 7.0) {
            System.out.println("Aluno Aprovado!!");
        } else {
            System.out.println("Aluno Reprovado!!");
        }

        scanner.close();
        
    }

}
