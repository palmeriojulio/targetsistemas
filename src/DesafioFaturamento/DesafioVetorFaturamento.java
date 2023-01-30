package DesafioFaturamento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioVetorFaturamento {
    public static void main(String[] args){

        Fatutamento fsp = new Fatutamento();
        fsp.setUf("SP");
        fsp.setValor(78555.44);
        Fatutamento frj = new Fatutamento();
        fsp.setUf("RJ");
        fsp.setValor(36678.66);
        Fatutamento fmg = new Fatutamento();
        fsp.setUf("MG");
        fsp.setValor(29229.88);
        Fatutamento fes = new Fatutamento();
        fsp.setUf("ES");
        fsp.setValor(27165.48);
        Fatutamento foutros = new Fatutamento();
        fsp.setUf("Outros");
        fsp.setValor(19849.53);

        List<Fatutamento> fList = new ArrayList<>();
        fList.add(fsp);
        fList.add(frj);
        System.out.println(fList);

    }
}
