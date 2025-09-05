import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class DesafioPromocaoRelampago {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor da compra: ");
        String valorCompra = scanner.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scanner.close();
    }

    public static String calcularDesconto(String valorCompra) {
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal limite1 = new BigDecimal("50");
        BigDecimal limite2 = new BigDecimal("100");
        BigDecimal descontoPercentual;
        if (valor.compareTo(limite1) < 0) {
            descontoPercentual = BigDecimal.ZERO;
        } else if (valor.compareTo(limite2) <= 0) {
            descontoPercentual = new BigDecimal("0.10");
        } else {
            descontoPercentual = new BigDecimal("0.20");
        }
        BigDecimal valorDesconto = valor.multiply(descontoPercentual).setScale(2, RoundingMode.HALF_UP);
        BigDecimal valorFinal = valor.subtract(valorDesconto).setScale(2, RoundingMode.HALF_UP);

        return "Valor original: R$" + valor.setScale(2, RoundingMode.HALF_UP)
        + "\nPercentual de desconto: " + descontoPercentual.multiply(new BigDecimal("100")) + "%"
        + "\nValor do desconto: R$" + valorDesconto
        + "\nValor final: R$" + valorFinal;
    }
}