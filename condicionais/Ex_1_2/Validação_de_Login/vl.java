package condicionais.Ex_1_2.Validação_de_Login;

import java.util.Scanner;

public class vl {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String vUsuario = "admin";
        String vPassword = "1234";

        System.out.println("Insira o usuário para Login: ");
        String tUsuario = scanner.nextLine();

        System.out.println("Agora insira a senha para Login: ");
        String tPassword = scanner.nextLine();

        if (vUsuario.equals(tUsuario) && vPassword.equals(tPassword)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        scanner.close();

    }
    
}
