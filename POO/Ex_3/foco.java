package POO.Ex_3;

import java.util.Scanner;

public class foco {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ContaCorrente edu = new ContaCorrente("Eduardo", 2000, 500);
        ContaCorrente mat = new ContaCorrente("Matheus", 13000, 2000);

        System.out.println(edu.showInfos());
        System.out.println(mat.showInfos());
        
        System.out.println(edu.setTitular("Zduardo"));
        System.out.println(mat.setTitular(""));
        System.out.println(edu.depositar(5000));
        System.out.println(mat.sacar(3000));
        
        System.out.println(edu.showInfos());
        System.out.println(mat.showInfos());
        
        scanner.close();

    }
    
}
