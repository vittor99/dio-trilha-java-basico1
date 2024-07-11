import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // todo conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        // todo exibir mensagens para o nosso usuario

        System.out.print("por favor, digite o numero da Conta: ");
        int numero = scanner.nextInt();

        // limpa o buffer do scanner
        scanner.nextLine();// para capturar a quebra de linha apos o nextInt()

        System.out.print("por favor, digite o numero da agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // TODO: exibir mensagem de conta criada

        String mensagem = "ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.";

        System.out.println(mensagem);

        // fecha scanner
        scanner.close();
    }
}
