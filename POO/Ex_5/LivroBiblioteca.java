package POO.Ex_5;

public class LivroBiblioteca {
    
    private String titulo;
    private String autor;
    private boolean disponivel;

    public LivroBiblioteca(String titulo, String autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public String showInfos() {
        String disponivelT;
        if (disponivel) {
            disponivelT = "Sim";
        } else {
            disponivelT = "Não";
        }
        return String.format("\nLivro: %s\nAutor: %s\nDisponível: %s\n", this.titulo, this.autor, disponivelT);
    }

    public String getBook() {
        if (this.disponivel) {
            this.disponivel = false;
            return String.format("\nVocê pegou o Livro '%s' emprestado!", this.titulo);
        } else {
            return String.format("\nO Livro '%s' já está emprestado, espere ele ser devolvido para pegar emprestado.", this.titulo);
        }
    }

    public String setBook() {
        if (!this.disponivel) {
            this.disponivel = true;
            return String.format("\nVocê devolveu o Livro '%s'", this.titulo);
        } else {
            return String.format("\nO Livro '%s' não pode ser devolvido pois já está na Biblioteca.", this.titulo);
        }
    }

}
