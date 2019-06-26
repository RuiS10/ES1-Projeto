import java.util.ArrayList;

public class Escritor {
    private java.lang.String Nome;
    private ArrayList<Livro> lista_obras;

    public Escritor(String nome, ArrayList<Livro> lista_obras) {
        Nome = nome;
        this.lista_obras = lista_obras;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public ArrayList<Livro> getLista_obras() {
        return lista_obras;
    }

    public void setLista_obras(ArrayList<Livro> lista_obras) {
        this.lista_obras = lista_obras;
    }

}
