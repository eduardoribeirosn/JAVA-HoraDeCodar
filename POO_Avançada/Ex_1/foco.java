package POO_Avançada.Ex_1;

public class foco {

    public static void main(String[] args) {
        
        Endereço eduA = new Endereço("Av Juscelino Kubtscheck", 1800, "São Paulo");

        Pessoa eduP = new Pessoa("Eduardo", 19, eduA);

        System.out.println(eduP.showInformation());

    }
    
}
