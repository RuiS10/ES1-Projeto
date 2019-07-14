public class Identidade {
    private String Ocopacao;
    private int cod_identidade;

    public Identidade(String ocopacao, int cod_identidade) {
        Ocopacao = ocopacao;
        this.cod_identidade = cod_identidade;
    }

    public String getOcopacao() {
        return Ocopacao;
    }

    public void setOcopacao(String ocopacao) {
        Ocopacao = ocopacao;
    }

    public int getCod_identidade() {
        return cod_identidade;
    }

    public void setCod_identidade(int cod_identidade) {
        this.cod_identidade = cod_identidade;
    }
}
