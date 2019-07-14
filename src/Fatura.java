import java.util.ArrayList;

public class Fatura {
   private VendaLivros vendaLivros;
   private float price;
   private int quantidade;
   private int data_emissao;
   private java.lang.String descricao;
   private int data_limite;
   private Identidade identidade;

    public Fatura(VendaLivros vendaLivros, float price, int quantidade, int data_emissao, String descricao, int data_limite, Identidade identidade) {
        this.vendaLivros = vendaLivros;
        this.price = price;
        this.quantidade = quantidade;
        this.data_emissao = data_emissao;
        this.descricao = descricao;
        this.data_limite = data_limite;
        this.identidade = identidade;
    }

    public VendaLivros getVendaLivros() {
        return vendaLivros;
    }

    public void setVendaLivros(VendaLivros vendaLivros) {
        this.vendaLivros = vendaLivros;
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

    public Identidade getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Identidade identidade) {
        this.identidade = identidade;
    }
}