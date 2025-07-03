package POO_Avançada.Ex_5;

public class foco {

    public static void operarVeiculo(Object vec) {

        if (vec instanceof Navegavel) {
            ((Navegavel) vec).navegar();
        }

        if (vec instanceof Pilotavel) {
            ((Pilotavel) vec).pilotar();
        }

    }

    public static void main(String[] args) {
        
        Hidroavio hidro = new Hidroavio();
        Navegavel navio = new Barco();
        Pilotavel aviao = new Aviao();

        operarVeiculo(hidro);
        operarVeiculo(navio);
        operarVeiculo(aviao);


    }
    
}
