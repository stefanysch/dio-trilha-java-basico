import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String agencia, nomeCliente;
        float saldo;

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        num = scanner.nextInt();

        System.out.println("Por favor, informe seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, informe seu saldo: ");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}