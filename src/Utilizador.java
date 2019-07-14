public class Utilizador  {
    private String nome;
    private String estado;
    private TipoUtilizador tipo;


    public Utilizador(String nome, String estado, TipoUtilizador tipo) {
        this.nome = nome;
        this.estado = estado;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public TipoUtilizador getTipo() {
        return tipo;
    }

    public void setTipo(TipoUtilizador tipo) {
        this.tipo = tipo;
    }
}