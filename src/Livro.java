public class Livro {
    private String titulo;
    private String editora;
    private float preco;
    private int stock;

    public Livro(String titulo, String editora, float preco, int stock) {
        this.titulo = titulo;
        this.editora = editora;
        this.preco = preco;
        this.stock = stock;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
