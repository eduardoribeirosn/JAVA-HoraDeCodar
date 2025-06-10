package loop.Ex_1_2.Somatório_com_for;

public class ex1 {
    
    public static void main(String[] args) {

        int soma = 0;
        
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("O valor total ficou: " + soma);
        
    }

}
