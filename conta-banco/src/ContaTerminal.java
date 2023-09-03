import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String nomeDoCliente;
        int agencia;
        Double saldo;

        Scanner leitor = new Scanner(System.in);


        System.out.println("Por favor digite seu nome \n");
        nomeDoCliente = leitor.nextLine().toLowerCase();
        System.out.println("Por favor digite o numero da conta \n");
        numero = leitor.nextInt();
        System.out.println("por favor digite o numero a agencia \n");
        agencia = leitor.nextInt();
        System.out.println("Quanto deseja depositar? \n ");
        saldo = leitor.nextDouble();

        System.out.println("Olá senhor(a) " + nomeDoCliente +", obrigado por criar uma conta em nosso banco, sua agencia é " +
               agencia + ", conta "+ numero + " e seu saldo de " + saldo + "já está disponível");

    }
}
