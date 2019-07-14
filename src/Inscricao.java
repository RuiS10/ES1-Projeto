public class Inscricao {
   private Utilizador utilizador;
   private int n_max_participantes;

    public Inscricao(Utilizador utilizador, int n_max_participantes) {
        this.utilizador = utilizador;
        this.n_max_participantes = n_max_participantes;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public int getN_max_participantes() {
        return n_max_participantes;
    }

    public void setN_max_participantes(int n_max_participantes) {
        this.n_max_participantes = n_max_participantes;
    }
}
