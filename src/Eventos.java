public class Eventos{
    private  int cod_evento;
    private  java.lang.String descricao;
    private  int data_inicio;
    private  int data_fim;
    private  java.lang.String localizacao;
    private  int descontos;
    private PropostaEvento propostaEvento;
    private ReservaSalas reservaSala;
    private Inscricao inscricao;
    private VendaLivros vendaLivros;

    public Eventos(int cod_evento, String descricao, int data_inicio, int data_fim, String localizacao, int descontos, ReservaSalas reservaSala, VendaLivros vendaLivros, PropostaEvento propostaEvento, Inscricao inscricao) {
        this.cod_evento = cod_evento;
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.localizacao = localizacao;
        this.descontos = descontos;
        this.reservaSala = reservaSala;
        this.vendaLivros = vendaLivros;
        this.propostaEvento = propostaEvento;
        this.inscricao = inscricao;
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

    public int getDescontos() {
        return descontos;
    }

    public void setDescontos(int descontos) {
        this.descontos = descontos;
    }

    public ReservaSalas getReservaSala() {
        return reservaSala;
    }

    public void setReservaSala(ReservaSalas reservaSala) {
        this.reservaSala = reservaSala;
    }

    public VendaLivros getVendaLivros() {
        return vendaLivros;
    }

    public void setVendaLivros(VendaLivros vendaLivros) {
        this.vendaLivros = vendaLivros;
    }

    public PropostaEvento getPropostaEvento() {
        return propostaEvento;
    }

    public void setPropostaEvento(PropostaEvento propostaEvento) {
        this.propostaEvento = propostaEvento;
    }

    public Inscricao getInscricao() {
        return inscricao;
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }
}
