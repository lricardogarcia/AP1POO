import java.util.Scanner;
import java.util.Arrays;

public class CircuitoResistencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resistencias = new double[4];

        for (int i = 0; i < resistencias.length; i++) {
            System.out.printf("Digite o valor da resistência %d: ", i + 1);
            resistencias[i] = scanner.nextDouble();
        }

        double resistenciaEquivalente = Arrays.stream(resistencias).sum();
        double maiorResistencia = Arrays.stream(resistencias).max().orElse(0);
        double menorResistencia = Arrays.stream(resistencias).min().orElse(0);

        System.out.printf("Resistência equivalente: %.2f Ω%n", resistenciaEquivalente);
        System.out.printf("Maior resistência: %.2f Ω%n", maiorResistencia);
        System.out.printf("Menor resistência: %.2f Ω%n", menorResistencia);
    }
}
