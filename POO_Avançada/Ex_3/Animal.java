package POO_Avançada.Ex_3;

public class Animal {
    
    private String nome;
    private String som;

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
    }

    public String getNome() {
        return this.nome;
    }
    
    public String getSom() {
        return this.som;
    }

}
