package POO.Ex_3;

public class ContaCorrente {
    
    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaCorrente(String titular, double saldo, double limiteSaque) {
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public String setTitular(String titular) {
        if (!titular.isBlank()) {
            String save = String.format("Titular %s alterado para Titular %s", this.titular, titular);
            this.titular = titular;
            return save;
        } else {
            return "O Novo Titular tem que ter um valor difente de 'vazio'";
        }
    }

    public String showInfos() {
        return String.format("\nTitular: %s\nSaldo: R$%.2f\nLimite de Saque: R$%.2f\n", titular, saldo, limiteSaque);
    }

    public double exibirSaldo() {
        return this.saldo;
    }

    public String depositar(double money) {
        if (money >= 0) {
            this.saldo += money;
            return String.format("Você depositou R$%.2f para o Titular %s e ficou com R$%.2f", money, titular, saldo);
        } else {
            return "O depósito tem que ser maior do que 0";
        }
    }
    
    public String sacar(double money) {
        if (money <= limiteSaque) {
            if (money <= this.saldo) {
                this.saldo -= money;
                return String.format("Você sacou R$%.2f do Titular %s e ficou com R$%.2f", money, titular, saldo);
            } else {
                return String.format("O valor R$%.2f ultrapassa o quanto você tem R$%.2f", money, saldo);
            }
        } else {
            return String.format("O valor R$%.2f ultrapassa o limite R$%.2f do Titular %s", money, limiteSaque, titular);
        }
    }

}
