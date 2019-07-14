public class Sala {
    private int cod_sala;
    private float area;
    private String descricao;

    public Sala(int cod_sala, float area, String descricao) {
        this.cod_sala = cod_sala;
        this.area = area;
        this.descricao = descricao;
    }

    public int getCod_sala() {
        return cod_sala;
    }

    public void setCod_sala(int cod_sala) {
        this.cod_sala = cod_sala;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
