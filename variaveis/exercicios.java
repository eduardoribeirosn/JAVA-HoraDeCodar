package variaveis;

public class exercicios {
    
    public static void main(String[] args) {
        
        /*  1 -
            Crie uma variável int para armazenar o valor 10.
            Crie uma segunda variável int que armazene o dobro do valor da primeira variável
            usando operadores aritméticos.
            Exiba o resultado.
        */

        int n = 10;
        int n2 = n * 2;

        System.out.println(n);
        System.out.println(n2);

        /* 2 -
            Declare uma variável char que armazene a letra 'B'.
            Faça o casting explícito dessa variável para int e exiba o valor numérico correspondente.
        */

        char letra = 'B';
        int numero = (int) letra;

        System.out.println(letra);
        System.out.println(numero);

        /* 3 -
            Declare duas variáveis double para armazenar os valores 15.75 e 20.40.
            Some os valores dessas variáveis e armazene o resultado em uma nova variável double.
            Exiba o resultado.
        */

        double d1 = 15.75, d2 = 20.40;
        double dSoma = d1 + d2;

        System.out.println(dSoma);

        /* 4 -
            Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000).
            Em seguida, declare uma variável int e faça o casting explícito do valor long para int.
            Exiba o resultado.
        */

        long valorAlto = 2_000_000_000L;
        int valorInt = (int) valorAlto;

        System.out.println(valorInt);

        /*
            Escreva um programa que crie uma variavel String com o valor "ola, Mundo!"
            Em seguida, crie outra variável String que concatene a primeira variável com o texto
            " Bem-vindo ao Java!".
            Exiba o resultado.
        */

        String hello = "Olá, Mundo!";
        String helloWelcome = hello + " Bem-vindo ao Java!";

        System.out.println(helloWelcome);

    }
}
