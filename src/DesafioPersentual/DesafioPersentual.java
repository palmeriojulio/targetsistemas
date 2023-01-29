package DesafioPersentual;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class DesafioPersentual {
    public static void main(String[] args) throws IOException, ParseException {
        /**
         * Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem
         * que desejar, que calcule e retorne:
         * O menor valor de faturamento ocorrido em um dia do mês;
         * O maior valor de faturamento ocorrido em um dia do mês;
         * Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
         * IMPORTANTE:
         *
         * a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
         * b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser
         * ignorados no cálculo da média;
         */

        JSONParser parser = new JSONParser();

        Reader reader = new FileReader("./dados.json");

        JSONObject jsonObject = (JSONObject) parser.parse(reader);

        System.out.println(jsonObject);




    }
}
