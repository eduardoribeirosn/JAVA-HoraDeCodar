package POO.Ex_4;

public class foco {

    public static void main(String[] args) {
        
        ProdutoEletronico placaVideo = new ProdutoEletronico("Placa de Vídeo", 899.90, true);
        ProdutoEletronico mouse = new ProdutoEletronico("Mouse", 320, true);

        System.out.println(placaVideo.showInfos());
        System.out.println(mouse.showInfos());

        placaVideo.applyDiscount(30);
        mouse.applyDiscount(10);

        System.out.println(placaVideo.showInfos());
        System.out.println(mouse.showInfos());

    }
    
}
