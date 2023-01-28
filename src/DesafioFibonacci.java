import java.util.Scanner;

public class DesafioFibonacci {
    public static void main(String[] args){

        /**
         * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
         * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
         * escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de
         * Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
         * IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode
         * ser previamente definido no código;
         */

        int n1 = 1;
        int n2 = 0;
        boolean existe = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número maior que 0: ");
        int nInformado = scanner.nextInt();

        for(int i = 0; i < 10; i++){

            n1 = n1 + n2;
            n2 = n1 - n2;

            System.out.println(n1);

            if (nInformado == n1) {
                System.out.println("Número "+nInformado+" pertence a sequência.");
                existe = true;
            }
        }
        if (existe == false){
            System.out.println("Número "+nInformado+" não pertence a sequência.");
        }
    }
}

