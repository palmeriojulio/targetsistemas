package DesafioString;

import java.util.Scanner;

public class DesafioString01 {

    public static void main(String[] args) {

        Scanner entreda = new Scanner(System.in);
        System.out.print("Informe uma palavra para ser invertida: ");
        String palavra = entreda.nextLine();

        char[] chars = palavra.toCharArray();
        int letraesquerda = 0;//a variavel letraesquerda recebe a posição 0 do chars, primeira letra da palavra.
        int letradireita = chars.length - 1;//a variavel letradireira recebe o tamanho do chars menos -1, ulima letra da palavra.
        while (letraesquerda < letradireita) {
            char temp = chars[letraesquerda];//temp recebe o valor de char na posição do valor letraesquerda.
            chars[letraesquerda++] = chars[letradireita];//chars recebe na posição atual de esquerda+1 o mesmo chars na posição direita
            chars[letradireita--] = temp;
        }

        String palavraInvertida = new String(chars);

        System.out.println("Palavra invertida: " + palavraInvertida);
        entreda.close();




    }
}
