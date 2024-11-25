import javax.swing.*;

public class CalculadoraITBI {
    public static void main(String[] args) {
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de transação do imóvel: "));
        double valorVenal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor venal do imóvel: "));
        double porcentagemImposto = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do ITBI (%): "));

        double baseCalculo = Math.max(valorTransacao, valorVenal);
        double imposto = (baseCalculo * porcentagemImposto) / 100;

        JOptionPane.showMessageDialog(null, String.format("Valor do imposto ITBI: R$ %.2f", imposto));
    }
}
