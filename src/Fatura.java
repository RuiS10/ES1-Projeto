import java.util.ArrayList;

public class Fatura {
    ArrayList<Livro> list_livro;
    float price;
    int quantidade;
    int data_emissao;
    java.lang.String descricao;
    int data_limite;
    Fornecedores fornecedor;

    public Fatura(ArrayList<Livro> list_livro, float price, int quantidade, int data_emissao, String descricao, int data_limite, Fornecedores fornecedor) {
        this.list_livro = list_livro;
        this.price = price;
        this.quantidade = quantidade;
        this.data_emissao = data_emissao;
        this.descricao = descricao;
        this.data_limite = data_limite;
        this.fornecedor = fornecedor;
    }

    public ArrayList<Livro> getList_livro() {
        return list_livro;
    }

    public void setList_livro(ArrayList<Livro> list_livro) {
        this.list_livro = list_livro;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(int data_emissao) {
        this.data_emissao = data_emissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getData_limite() {
        return data_limite;
    }

    public void setData_limite(int data_limite) {
        this.data_limite = data_limite;
    }

    public Fornecedores getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedores fornecedor) {
        this.fornecedor = fornecedor;
    }
}