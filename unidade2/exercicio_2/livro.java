public class livro {

    private int idlivro;
    private String titulo;
    private String autor;
    private double preço

    public livro(long idlivro2, String titulo, String autor, double preço) {
        this.idlivro = idlivro2;
        this.titulo = titulo;
        this.autor = autor;
        this.preço = preço;
    }

    @Override
    public String toString() {

        return "livro [idlivro=" + idlivro + ", titulo=" + titulo + ", autor=" + autor + ", preço=" + preço + "]";
    }

}
