public class Eventos{
    int cod_evento;
    java.lang.String descricao;
    int data_inicio;
    int data_fim;
    java.lang.String localizacao;
    Escritor escritor;
    int descontos;

    public Eventos(int cod_evento, String descricao, int data_inicio, int data_fim, String localizacao, Escritor escritor, int descontos) {
        this.cod_evento = cod_evento;
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.localizacao = localizacao;
        this.escritor = escritor;
        this.descontos = descontos;
    }

    public int getCod_evento() {
        return cod_evento;
    }

    public void setCod_evento(int cod_evento) {
        this.cod_evento = cod_evento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(int data_inicio) {
        this.data_inicio = data_inicio;
    }

    public int getData_fim() {
        return data_fim;
    }

    public void setData_fim(int data_fim) {
        this.data_fim = data_fim;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Escritor getEscritor() {
        return escritor;
    }

    public void setEscritor(Escritor escritor) {
        this.escritor = escritor;
    }

    public int getDescontos() {
        return descontos;
    }

    public void setDescontos(int descontos) {
        this.descontos = descontos;
    }
}
