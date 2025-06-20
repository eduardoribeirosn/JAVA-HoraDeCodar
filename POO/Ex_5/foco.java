package POO.Ex_5;

public class foco {
    
    public static void main(String[] args) {
        
        LivroBiblioteca paiRicoPaiPobre = new LivroBiblioteca("Pai Rico Pai Pobre", "Robert Kiyosaki", true);
        LivroBiblioteca comoFazerAmigosInfluenciarPessoas = new LivroBiblioteca("Como fazer amigos e influenciar pessoas", "Dale Carnigie", true);

        System.out.println(paiRicoPaiPobre.showInfos());
        System.out.println(comoFazerAmigosInfluenciarPessoas.showInfos());
        
        System.out.println(paiRicoPaiPobre.getBook());
        System.out.println(paiRicoPaiPobre.getBook());

        System.out.println(paiRicoPaiPobre.showInfos());

        System.out.println(paiRicoPaiPobre.setBook());
        
        System.out.println(comoFazerAmigosInfluenciarPessoas.getBook());

        System.out.println(comoFazerAmigosInfluenciarPessoas.showInfos());

        System.out.println(comoFazerAmigosInfluenciarPessoas.setBook());
        System.out.println(comoFazerAmigosInfluenciarPessoas.setBook());
        
        System.out.println(paiRicoPaiPobre.showInfos());
        System.out.println(comoFazerAmigosInfluenciarPessoas.showInfos());
    }

}
