public class PropostaDoacao {
    private String descricao;
    private Identidade identidade;
    private String data;

    public PropostaDoacao(String descricao, Identidade identidade, String data) {
        this.descricao = descricao;
        this.identidade = identidade;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Identidade getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Identidade identidade) {
        this.identidade = identidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
