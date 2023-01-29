package DesafioPersentual;

import DesafioFaturamento.Fatutamento;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

        try {
            Object obj = parser.parse(new FileReader("/home/palmerio/Programação/Vagas Java Jr/dados.json"));

            JSONArray distribuidores = (JSONArray) obj;

            for (int i = 0; i <= distribuidores.size(); i++) {
                System.out.println(distribuidores);
            }

            //Iterator<JSONObject> iterator = distribuidores.iterator();

            //while (iterator.hasNext()) {
                //System.out.println(iterator.next());
           // }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
