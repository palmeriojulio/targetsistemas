package DesafioFaturamento;

import java.util.*;

public class DesafioVetorFaturamento {
    public static void main(String[] args){

        /**
         * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
         *
         * - SP – R$67.836,43
         * - RJ – R$36.678,66
         * - MG – R$29.229,88
         * - ES – R$27.165,48
         * - Outros – R$19.849,53
         *
         * Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
         *
         */

        //usando interface HashMap para gardar os valores.
        Map<String, Double> faturamentoUf = new HashMap<>();
        faturamentoUf.put("SP", 67836.43);
        faturamentoUf.put("RJ", 36678.66);
        faturamentoUf.put("MG", 29229.88);
        faturamentoUf.put("ES", 27165.48);
        faturamentoUf.put("Outros", 19849.53);

        //Criando variável que recebera o retorno da função calcularRepresentacao
        Map<String, Double> representacaoUf = calcularRepresentacao(faturamentoUf);
        //percorendo e imprimindo os valores
        for (Map.Entry<String, Double> entrada : representacaoUf.entrySet()) {
            System.out.println("Percentual de representação do "+entrada.getKey() + ": " + entrada.getValue() + "%");
        }
    }

    private static Map<String, Double> calcularRepresentacao(Map<String, Double> faturamentoUf) {

        //calculando o total
        double totalFaturado = 0.0;
        for (double faturamento : faturamentoUf.values()) {
            totalFaturado += faturamento;
        }

        System.out.println("Total faturado: "+totalFaturado);

        //criando nova variável pra retornar o valor calculado.
        Map<String, Double> representacaoPorEstado = new HashMap<>();
        for (Map.Entry<String, Double> entrada : faturamentoUf.entrySet()) {
            String estado = entrada.getKey();
            double faturamento = entrada.getValue();
            //setando o valor ja com o calculo da porsentagem.
            representacaoPorEstado.put(estado, (faturamento / totalFaturado) * 100);
        }
        return representacaoPorEstado;
    }

}

