import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "java8";
        int tentativas = 3;

        while (tentativas > 0) {
            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Acesso concedido!");
                return;
            } else {
                tentativas--;
                System.out.printf("Senha incorreta. Você tem %d tentativa(s) restante(s).%n", tentativas);
            }
        }

        System.out.println("Acesso bloqueado!");
    }
}
