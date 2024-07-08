public class BancoTerminal {
    public static void main(String[] args) {
        // Primeira operação de saque
        double saldo = 25;
        double valorSolicitado = 18;

        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo após a primeira operação: " + saldo);

        // Segunda operação de saque
        saldo = 15;
        valorSolicitado = 22;

        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo após a segunda operação: " + saldo);
    }
}
