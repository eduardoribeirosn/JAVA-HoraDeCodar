package POO_Avançada.Ex_4;

public class FuncionarioTempoIntegral extends Funcionario implements Beneficios {

    public FuncionarioTempoIntegral(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario(double sal) {
        return (sal * 3);
    }

    @Override
    public void adicionarBeneficio() {
        System.out.println("R$300,00 adicionados a conta por bater a meta.");
    }

}
