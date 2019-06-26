import java.time.LocalDate;

public class Credito {
    private java.lang.String descricao;
    private  float montante;
    private  java.time.LocalDate date;
    private  Fornecedores fornecedores;

    public Credito(String descricao, float montante, LocalDate date, Fornecedores fornecedores) {
        this.descricao = descricao;
        this.montante = montante;
        this.date = date;
        this.fornecedores = fornecedores;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getMontante() {
        return montante;
    }

    public void setMontante(float montante) {
        this.montante = montante;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Fornecedores getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Fornecedores fornecedores) {
        this.fornecedores = fornecedores;
    }
}