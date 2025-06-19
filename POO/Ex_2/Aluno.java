package POO.Ex_2;

import java.util.Scanner;

public class Aluno {
    
    private String nome;
    private String matricula;
    private double notaFinal;
    
    public Aluno(String nome, String matricula, double notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public double getNotaFinal() {
        return this.notaFinal;
    }

    public void showInfos() {
        System.out.println(
            "\nNome do Aluno: " + getNome() +
            "\nMatricula: " + getMatricula() + 
            "\nNota Final: " + getNotaFinal() +
            "\n"
        );
    }

    public void setNome(Scanner scanner) {
        String name = "";
        while (name.isBlank()) {
            System.out.println("Digite o Nome do Aluno: ");
            name = scanner.nextLine();
        }
        this.nome = name;
    }

    public void setMatricula(Scanner scanner) {
        String matricula = "";
        while (matricula.isBlank()) {
            System.out.println("Digite a Matricula do Aluno: ");
            matricula = scanner.nextLine();
        }
        this.matricula = matricula;
    }

    public void setNotaFinal(Scanner scanner) {
        double notaFinal = -1;
        while (notaFinal < 0 || notaFinal > 100) {
            System.out.println("Digite a Nota Final do Aluno: (0 a 100)");
            notaFinal = scanner.nextDouble();
        }
        this.notaFinal = notaFinal;
    }
}
