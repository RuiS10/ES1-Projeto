import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra {
    private PropostaAquisicao propostaAquisicao;
    private Fornecedores fornecedores;

    public RequisicaoCompraLivro(String estado, LocalDate data, String oficio, Livro livro, Utilizador utilizador, PropostaAquisicao propostaAquisicao, Fornecedores fornecedores) {
        super(estado, data, oficio, livro, utilizador);
        this.propostaAquisicao = propostaAquisicao;
        this.fornecedores = fornecedores;
    }

    public PropostaAquisicao getPropostaAquisicao() {
        return propostaAquisicao;
    }

    public void setPropostaAquisicao(PropostaAquisicao propostaAquisicao) {
        this.propostaAquisicao = propostaAquisicao;
    }

    public Fornecedores getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Fornecedores fornecedores) {
        this.fornecedores = fornecedores;
    }
}