package POO.Projeto_Cadastro_Alunos;

import java.util.Scanner;

/*
    Criando o Sistema de Cadastro de Alunos

    > 1 - Criar a Classe Aluno:

    Crie a classe Aluno que irá representar cada aluno do sistema.
    Declare os atributos privados: nome, matricula (do tipo String)
    e notas (um array de double).

    > 2 - Criar o Construtor da Classe Aluno:

    Defina um construtor que receba o nome, a matrícula
    e o número de notas que o aluno terá.
    Dentro do construtor, inicialize o array notas com o tamanho recebido.

    > 3 - Método para Adicionar Notas:

    Crie o método adicionarNotas(Scanner scanner) na classe Aluno.
    Dentro desse método, peça ao usuário para digitar as notas uma a uma e
    armazene cada nota no array notas.

    > 4 - Método para Calcular a Média:

    Implemente o método calcularMedia(),
    que deve somar todas as notas do array notas e dividir pelo número de notas.
    Retorne a média calculada.

    > 5 - Método para Exibir o Resultado:

    Crie o método exibirResultado() que:
    Exiba o nome do aluno, a matrícula e a média final calculada.
    Verifique se o aluno foi aprovado ou reprovado com base na média.
    (Aprovado se média >= 6.0).

    > 6 - Criar a Classe SistemaCadastroAlunos:

    Crie a classe principal SistemaCadastroAlunos.
    No método main(), use um Scanner para coletar o número de alunos que o usuário deseja cadastrar.

    > 7 - Cadastrar os Alunos:

    Dentro de um loop for, peça ao usuário o nome, a matrícula
    e o número de notas para cada aluno.
    Para cada aluno, crie um novo objeto Aluno e armazene no array alunos[].
    Use o método adicionarNotas() para permitir que o usuário insira
    as notas para cada aluno.

    > 8 - Calcular e Exibir Resultados:

    Após cadastrar todos os alunos, crie um loop para percorrer o array de alunos.
    Para cada aluno, chame o método exibirResultado() para calcular
    e exibir a média e o status (aprovado ou reprovado).

    > 9 - Fechar o Scanner:

    Ao final do programa, lembre-se de fechar o Scanner para evitar vazamento de recursos.
 */

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, int notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[notas];
    }

    public void addNotes(Scanner scanner) {
        double nota;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a Nota N° " + (i + 1));
            nota = scanner.nextDouble();
            this.notas[i] = nota;
        }
    }

    public double calculeAverage() {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return (soma / notas.length);
    }

    public String showResult() {
        double notaFinal = calculeAverage();
        String situation;
        if (notaFinal >= 6.0) {
            situation = "Aprovado!";
        } else {
            situation = "Reprovado!";
        }
        return String.format("\n- - - - - - - -\nNome: %s\nMatrícula: %s\nMédia: %.2f\nSituação: %s\n- - - - - - - -", this.nome, this.matricula, notaFinal, situation);
    }
    
}
