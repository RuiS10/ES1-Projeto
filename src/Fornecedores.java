public class Fornecedores {
    int NIF_Fornecedor;
    java.lang.String nome;
    int contacto;
    java.lang.String Localizacao;


    public Fornecedores(int NIF_Fornecedor, String nome, int contacto, String localizacao) {
        this.NIF_Fornecedor = NIF_Fornecedor;
        this.nome = nome;
        this.contacto = contacto;
        Localizacao = localizacao;

    }

    public int getNIF_Fornecedor() {
        return NIF_Fornecedor;
    }

    public void setNIF_Fornecedor(int NIF_Fornecedor) {
        this.NIF_Fornecedor = NIF_Fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String localizacao) {
        Localizacao = localizacao;
    }
}
