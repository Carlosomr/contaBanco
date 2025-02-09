import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar informações ao usuário
        System.out.println("Seja bem-vindo!");

        System.out.print("Informe seu nome para prosseguirmos: ");
        String nomeCliente = entrada.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int numero = entrada.nextInt();
        entrada.nextLine();  // Consumir a nova linha deixada por nextInt()

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = entrada.nextLine();

        System.out.print("Informe o saldo inicial: ");
        double saldo = entrada.nextDouble();

        // Criação de um objeto conta usando o construtor
        conta minhaConta = new conta(numero, agencia, nomeCliente, saldo);

        // Exibindo informações da conta
        System.out.println("Olá " + minhaConta.nomeCliente + " Obrigado por criar uma conta em nossa banco, ");
        System.out.println("sua agencia é, " + minhaConta.agencia);
        System.out.println("conta " + minhaConta.numero);
        System.out.println("e seu Saldo: " + minhaConta.saldo + "\njá está disponivel para saque");

        entrada.close();
    }

    public static class conta {
        public int numero;
        public String agencia;
        public String nomeCliente;
        public double saldo;

        // Construtor da classe conta
        public conta(int numero, String agencia, String nomeCliente, double saldo) {
            this.numero = numero;
            this.agencia = agencia;
            this.nomeCliente = nomeCliente;
            this.saldo = saldo;
        }
    }
}
