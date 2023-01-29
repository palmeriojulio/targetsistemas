package DesafioSoma;

public class DesafioSoma {

    public static void main (String[] args) {

    /**
     * 1) Observe o trecho de código abaixo:
     * int indice = 13, SOMA = 0, K = 0;
     * enquanto K < indice faça { K = K + 1; SOMA = SOMA + K; }
     * imprimir(SOMA);
     * Ao final do processamento, qual será o valor da variável SOMA?
     }*/

     int i  = 13;
     int SOMA = 0;
     int K = 0;

     while (K < i) {
     K = K + K + 1;
     SOMA = SOMA + K;
     }
     System.out.println("O valor de SOMA final: "+SOMA);

    }
}
