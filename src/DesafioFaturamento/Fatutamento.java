package DesafioFaturamento;

import java.io.Serializable;
import java.math.BigDecimal;

public class Fatutamento implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dia;
    private String uf;
    private double valor;

    public Fatutamento() {
    }

    public Fatutamento(String dia, String uf, double valor) {
        this.dia = dia;
        this.uf = uf;
        this.valor = valor;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "DesafioFaturamento.Fatutamento{" +
                ", dia='" + dia + '\'' +
                ", uf='" + uf + '\'' +
                ", valor=" + valor +
                '}';
    }

}
