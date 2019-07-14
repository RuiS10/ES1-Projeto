import java.time.LocalDate;
import java.util.ArrayList;

public class Doacao {
    private Livro livro;
    private java.time.LocalDate data;
    private int quantidade;
    private java.lang.String descricao;
    private PropostaDoacao propostaDoacao;

    public Doacao(Livro livro, LocalDate data, int quantidade, String descricao, PropostaDoacao propostaDoacao) {
        this.livro = livro;
        this.data = data;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.propostaDoacao = propostaDoacao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
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

    public PropostaDoacao getPropostaDoacao() {
        return propostaDoacao;
    }

    public void setPropostaDoacao(PropostaDoacao propostaDoacao) {
        this.propostaDoacao = propostaDoacao;
    }
}