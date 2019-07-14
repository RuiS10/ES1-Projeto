import java.time.LocalDate;

public class ReservaSalas {
    private Sala sala;
    private int duracao;
    private LocalDate data;
    private PropostaReservaSala propostaReservaSala;

    public ReservaSalas(Sala sala, int duracao, LocalDate data, PropostaReservaSala propostaReservaSala) {
        this.sala = sala;
        this.duracao = duracao;
        this.data = data;
        this.propostaReservaSala = propostaReservaSala;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public PropostaReservaSala getPropostaReservaSala() {
        return propostaReservaSala;
    }

    public void setPropostaReservaSala(PropostaReservaSala propostaReservaSala) {
        this.propostaReservaSala = propostaReservaSala;
    }
}
