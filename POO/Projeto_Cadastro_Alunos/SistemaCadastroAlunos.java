package POO.Projeto_Cadastro_Alunos;

import java.util.Scanner;

public class SistemaCadastroAlunos {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos Alunos deseja cadastrar? ");
        int quantityStudents = scanner.nextInt();
        
        String nome;
        String matricula;
        int quantityNotes;
        
        Aluno[] alunos =  new Aluno[quantityStudents];
        
        for (int i = 0; i < quantityStudents; i++) {
            scanner.nextLine();
            System.out.println("\nQual o Nome do Aluno: ");
            nome = scanner.nextLine();
            
            System.out.println("\nQual a Matrícula do Aluno: ");
            matricula = scanner.nextLine();

            System.out.println("\nQuantas Notas ele tem? ");
            quantityNotes = scanner.nextInt();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome, matricula, quantityNotes);

            alunos[i] = aluno;

            aluno.addNotes(scanner);
        }

        for (Aluno aluno : alunos) {
            System.out.println(aluno.showResult());
        }

        scanner.close();

    }

}
