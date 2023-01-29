package DesafioFaturamento;

import java.io.Serializable;
import java.math.BigDecimal;

public class Fatutamento implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String dia;
    private String uf;
    private double valor;

    public Fatutamento() {
    }

    public Fatutamento(long id, String dia, String uf, double valor) {
        this.id = id;
        this.dia = dia;
        this.uf = uf;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
                "id=" + id +
                ", dia='" + dia + '\'' +
                ", uf='" + uf + '\'' +
                ", valor=" + valor +
                '}';
    }

}
