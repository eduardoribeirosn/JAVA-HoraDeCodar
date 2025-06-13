package arrays.Ex_1_2.Encontrar_o_Elemento_Mais_Frequenta_em_um_Array;

public class Ex2 {
    
    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 4, 5, 6, 4, 6, 6, 7};

        int contagem = 0;
        int maiorC = 0;
        int maiorN = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            
            contagem = 0;

            for (int j = 0; j < numbers.length - 1; j++) {


                if (numbers[i] == numbers[j]) {
                    contagem++;
                }

            }

            if (contagem > maiorC) {
                maiorN = numbers[i];
                maiorC = contagem;
            }

        }

        System.out.println("O Número mais frequente é o Númer: " + maiorN);

    }

}
