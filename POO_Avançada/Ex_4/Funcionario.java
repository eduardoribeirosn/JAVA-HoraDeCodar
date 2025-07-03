package POO_Avançada.Ex_4;

abstract class Funcionario {
    
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario(double sal);

}
