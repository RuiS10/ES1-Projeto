public class PropostaReservaSala {
    Identidade identidade;
    String descriçao;
    int dia;// dia que quer reservar sala

    public PropostaReservaSala(Identidade identidade, String descriçao, int dia) {
        this.identidade = identidade;
        this.descriçao = descriçao;
        this.dia = dia;
    }

    public Identidade getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Identidade identidade) {
        this.identidade = identidade;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
