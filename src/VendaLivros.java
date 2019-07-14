public class VendaLivros {
    private String titulo;
    private String editora;
    private float price;

    public VendaLivros(String titulo, String editora, float price, int stock) {
        this.titulo = titulo;
        this.editora = editora;
        this.price = price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

