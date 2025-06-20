package POO.Projeto_Loteria;

import java.util.Arrays;
import java.util.Random;

/*
    > 1 - Criar a Classe Bilhete:

    Defina os atributos privados numerosEscolhidos (array de inteiros) e relultadoSorteio (array de inteiros).
    Crie um construtor que receba os números escolhidos pelo jogador e atribua ao atributo numerosEscolhidos.

    > 2 - Método realizarSorteio:

    Dentro da classe Bilhete, crie o método realizarsorteio.
    Use a classe Random para gerar 6 números aleatórios entre 1 e 60.
    Armazene esses numeros no array resultadoSorteio
    e ordene os números usando Arrays.sort().

    > 3 - Método contarAcertos:

    Crie o método contarAcertos dentro da classe Bilhete.
    Compare os números escolhidos peld jogador com os números sorteados
    e conte quantos números coincidem.
    Retorne o número de acertos.

    > 4 - Método exibirResultado:

    Crie o método exibirResultado dentro da classe Bilhete.
    Use Arrays.tostring() para exibir os números escolhidos e os números sorteados.
    Chame o método contarAcertos e exiba quantos numeros foram acertados.

    > 5 - Criar a Classe SimuladorLoteria:

    No método main, use a classe Scanner para permitir que o jogador insira 6 números.
    Armazene esses números em um array e crie um novo objeto Bilhete com esses números.
    Repita esse processo para permitir o registro de vários bilhetes.

    > 6 - Realizar o Sorteio:

    Após registrar os bilhetes, para cada bilhete, chame o método realizarsorteio.
    Exiba os resultados de cada bilhete chamando o método exibirResultado.

    > 7 - Fechar o Scanner:

    Ao final do programa, lembre-se de fechar o Scanner para evitar vazamento de recursos.

 */

public class Bilhete {
    
    private int[] numerosEscolhidos;
    private int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhidos) {
        this.numerosEscolhidos = Arrays.copyOf(numerosEscolhidos, 6);
        System.out.println("\nBilhete Criado!");
    }

    public int[] realizarSorteio() {
        boolean equalNumber = false;
        Random random = new Random();
        int randomNumber;
        int[] resultadoSorteio = new int[6];
        for (int i = 0; i < 6; i++) {
            while (true) {
                randomNumber = random.nextInt(61);
                equalNumber = false;
                for (int j = 0; j < resultadoSorteio.length; j++) {
                    if (randomNumber == resultadoSorteio[j]) {
                        equalNumber = true;
                        break;
                    }
                }
                if (equalNumber == false) {
                    resultadoSorteio[i] = randomNumber;
                    break;
                }
            }
        }
        Arrays.sort(resultadoSorteio);
        this.resultadoSorteio = resultadoSorteio;
        return resultadoSorteio;
    }

    public int countHit() {
        int hits = 0;
        for (int i = 0; i < this.numerosEscolhidos.length; i++) {
            for (int j = 0; j < this.resultadoSorteio.length; j++) {
                if (this.numerosEscolhidos[i] == this.resultadoSorteio[j]) {
                    hits++;
                }
            }
        }
        return hits;
    }

    public String showResult() {
        return String.format("\n\nResultado:\n\nNúmeros Escolhidos: %s\n- - - - - - - - - -\nNúmeros Sorteados: %s\n- - - - - - - - - -\nAcertos: %d\n", Arrays.toString(this.numerosEscolhidos), Arrays.toString(this.resultadoSorteio), countHit());
    }


}
