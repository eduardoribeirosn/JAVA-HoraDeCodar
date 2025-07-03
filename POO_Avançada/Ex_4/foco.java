package POO_Avançada.Ex_4;

public class foco {

    public static void main(String[] args) {
        
    FuncionarioTempoIntegral matheus = new FuncionarioTempoIntegral("Matheus");
    FuncionarioMeioPeriodo eduardo = new FuncionarioMeioPeriodo("Eduardo");

    System.out.println(matheus.calcularSalario(2000));
    System.out.println(eduardo.calcularSalario(2000));

    matheus.adicionarBeneficio();
    eduardo.adicionarBeneficio();

    }
    
}
