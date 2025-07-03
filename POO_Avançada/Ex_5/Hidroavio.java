package POO_Avançada.Ex_5;

public class Hidroavio extends Barco implements Pilotavel {
    
    @Override
    public void pilotar() {
        System.out.println("O Hidroavio está sendo pilotado...");
    }

    @Override
    public void navegar() {
        System.out.println("O Hidroavio está navegando...");
    }

}
