package POO_Avançada.Ex_4;

public class FuncionarioMeioPeriodo extends Funcionario implements Beneficios{
    
    public FuncionarioMeioPeriodo(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario(double sal) {
        return (sal * 2);
    }

    @Override
    public void adicionarBeneficio() {
        System.out.println("R$200,00 adicionados a conta por bater a meta.");
    }

}
