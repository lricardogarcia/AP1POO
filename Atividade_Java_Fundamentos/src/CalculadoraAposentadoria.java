import java.util.Scanner;

public class CalculadoraAposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite os anos de contribuição: ");
        int anosContribuicao = scanner.nextInt();

        boolean podeAposentar = (sexo == 'M' && idade >= 65 && anosContribuicao >= 35) ||
                (sexo == 'F' && idade >= 60 && anosContribuicao >= 30);

        if (podeAposentar) {
            System.out.println("Você já pode se aposentar.");
        } else {
            int anosFaltam = (sexo == 'M') ? 65 - idade : 60 - idade;
            System.out.printf("Faltam %d anos para você se aposentar.%n", anosFaltam);
        }
    }
}
