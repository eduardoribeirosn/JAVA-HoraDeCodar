package POO_Avançada.Ex_3;

public class Cachorro extends Animal {
    
    private String raca;

    public Cachorro(String nome, String som, String raca) {
        super(nome, som);
        this.raca = raca;
    }

    public String showDetails() {
        return String.format("\nNome: %s\nRaça: %s\nSom: %s\n", getNome(), this.raca, getSom());
    }

}
