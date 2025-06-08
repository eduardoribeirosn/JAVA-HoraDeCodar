package funcoes.Ex_5_6.Função_com_System_exit_para_Verificar_Idade;

import java.util.Scanner;

public class fcsepvi {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite Sua Idade: ");
        int idade = scanner.nextInt();

        verificarIdade(idade);

        scanner.close();

    }
    
    public static void verificarIdade(int i) {
        if (i < 18) {
            System.out.println("Acesso Negado!!!");
            System.exit(0);
        } else {
            System.out.println("Acesso Permitido!!!");
        }
    }

}
