package POO.Ex_4;

public class ProdutoEletronico {
    
    private String nome;
    private double preco;
    private boolean garantia;

    public ProdutoEletronico(String nome, double preco, boolean garantia) {
        this.nome = nome;
        this.preco = preco;
        this.garantia = garantia;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public boolean getGarantia() {
        return this.garantia;
    }

    public String showInfos() {
        String garantiaT;
        if (garantia) {
            garantiaT = "Sim";
        } else {
            garantiaT = "Não";
        }
        return String.format("\nProduto: %s\nPreço: R$%.2f\nGarantia: %s\n", nome, preco, garantiaT);
    }

    public double calculeDiscount(double discount) {
        return this.preco *= (discount / 100);
    }

    public double applyDiscount(double porcentDiscount) {
        if (porcentDiscount >= 0 && porcentDiscount <= 100) {
            return this.preco -= calculeDiscount(porcentDiscount);
        } else {
            System.out.println("A porcentagem deve ser entra 0 e 100");
            return 0;
        }
    }

}
