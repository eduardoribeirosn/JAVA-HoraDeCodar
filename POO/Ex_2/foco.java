package POO.Ex_2;

import java.util.Scanner;

public class foco {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Aluno eduardo = new Aluno("Eduardo", "CCO", 100);
        Aluno matheus = new Aluno("Mateus", "CCO", 80);

        eduardo.showInfos();
        matheus.showInfos();

        eduardo.setMatricula(scanner);
        matheus.setNome(scanner);
        matheus.setNotaFinal(scanner);

        eduardo.showInfos();
        matheus.showInfos();

        scanner.close();

    }
    
}
