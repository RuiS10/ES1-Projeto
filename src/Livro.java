public class Livro {
    private String titulo;
    private String editora;
    private float preco;
    private int stock;
    Escritor escritor;

    public Livro(String titulo, String editora, float preco, int stock, Escritor escritor) {
        this.titulo = titulo;
        this.editora = editora;
        this.preco = preco;
        this.stock = stock;
        this.escritor = escritor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
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

    public Escritor getEscritor() {
        return escritor;
    }

    public void setEscritor(Escritor escritor) {
        this.escritor = escritor;
    }
}