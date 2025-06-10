package loop.Ex_1_2.Impressão_de_Números_Pares_com_While;

public class ex2 {
    
    public static void main(String[] args) {

        int n = 1;
        
        System.out.println("---");
        while (n <= 20) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }
        System.out.println("---");

    }

}
