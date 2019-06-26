import java.time.LocalDate;

public class Debito {
    private  java.lang.String descricao;
    private java.time.LocalDate date;
    private  float montante;
    private  Fornecedores fornecedores;

    public Debito(String descricao, LocalDate date, float montante, Fornecedores fornecedores) {
        this.descricao = descricao;
        this.date = date;
        this.montante = montante;
        this.fornecedores = fornecedores;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getMontante() {
        return montante;
    }

    public void setMontante(float montante) {
        this.montante = montante;
    }

    public Fornecedores getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Fornecedores fornecedores) {
        this.fornecedores = fornecedores;
    }
}
