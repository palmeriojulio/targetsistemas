import java.math.BigDecimal;

public class FatutamentoDiario {

    static String dia;
    static BigDecimal valor;
    public FatutamentoDiario(String dia, BigDecimal valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public FatutamentoDiario() {

    }

    public static String getDia() {
        return dia;
    }

    public static void setDia(String dia) {
        FatutamentoDiario.dia = dia;
    }

    public static BigDecimal getValor() {
        return valor;
    }

    public static void setValor(BigDecimal valor) {
        FatutamentoDiario.valor = valor;
    }
}
