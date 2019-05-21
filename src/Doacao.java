import java.time.LocalDate;
import java.util.ArrayList;

public class Doacao {
    ArrayList<Livro> lista_livros;
    Utilizador utilizador;
    java.time.LocalDate data;
    int quantidade;
    java.lang.String descricao;

    public Doacao(ArrayList<Livro> lista_livros, Utilizador utilizador, LocalDate data, int quantidade, String descricao) {
        this.lista_livros = lista_livros;
        this.utilizador = utilizador;
        this.data = data;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public ArrayList<Livro> getLista_livros() {
        return lista_livros;
    }

    public void setLista_livros(ArrayList<Livro> lista_livros) {
        this.lista_livros = lista_livros;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
