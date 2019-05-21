public class Livro {
    private String titulo;
    private String editora;
    private float preco;

    public Livro(String titulo, String editora) {
        this.titulo = titulo;
        this.editora = editora;
        this.preco= preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
