import java.util.ArrayList;

public class  RepositorioMem implements Repositorio{

    public RepositorioMem() {
    }
    ArrayList<Notificacao> ListaNot = new ArrayList<>();
    ArrayList<Requisicao> ListaReq= new ArrayList<>();
    ArrayList<Copia> ListaCop = new ArrayList<>();
    ArrayList<Utilizador> ListaUti = new ArrayList<>();
    ArrayList<Livro>ListaLiv= new ArrayList<>();
    ArrayList<Emprestimo> ListaEmp= new ArrayList<>();
    ArrayList<TipoUtilizador>ListaTipoUti= new ArrayList<>();
    ArrayList<Devolucao> ListaDev= new ArrayList<>();
    ArrayList<Coima> ListaCoima = new ArrayList<>();
    ArrayList<Encomenda> ListaEnc = new ArrayList<>();
    ArrayList<EntradaNovoLivro> ListaEntradaLiv = new ArrayList<>();
    ArrayList<PropostaAquisicao> ListaProp = new ArrayList<>();
    ArrayList<RequisicaoCompra> ListaReqComp = new ArrayList<>();
    ArrayList<Fornecedores> ListaForncedores = new ArrayList<>();
    ArrayList<Doacao>ListaDoacoes = new ArrayList<>();
    ArrayList<Eventos>ListaEventos = new ArrayList<>();
    ArrayList<Fatura> ListaFaturas = new ArrayList<>();
    public void adicionaCoima(Coima coima){ ListaCoima.add(coima); }
    public void adicionaCopia(Copia copia){ ListaCop.add(copia);}
    public void adicionaDevolucao(Devolucao devolucao)
    {
        ListaDev.add(devolucao);
    }
    public void adicionaEmprestimo(Emprestimo emprestimo)
    {
        ListaEmp.add(emprestimo);
    }
    public void adicionaEncomenda(Encomenda encomenda)
    {
        ListaEnc.add(encomenda);
    }
    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) { ListaEntradaLiv.add(entradaNovoLivro); }
    public void adicionaLivro(Livro livro)
    {
        ListaLiv.add(livro);
    }
    public void adicionaNotificacao(Notificacao notificacao)
    {
        ListaNot.add(notificacao);
    }
    public void adicionaPropostaAquisicao(PropostaAquisicao proposta) { ListaProp.add(proposta); }
    public void adicionaRequisicao(Requisicao requisicao)
    {
        ListaReq.add(requisicao);
    }
    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) { ListaReqComp.add(requisicaoCompra); }
    public void adicionaTipoUtilizador(TipoUtilizador tipo)
    {
        ListaTipoUti.add(tipo);
    }
    public void adicionaUtilizador(Utilizador utilizador)
    {
        ListaUti.add(utilizador);
    }
    public void adicionaFornecedor(Fornecedores fornecedores){ListaForncedores.add(fornecedores);}
    public void adicionaDoacao(Doacao doacao){ListaDoacoes.add(doacao);}
    public void adicionaEvento(Eventos evento){ListaEventos.add(evento);}
    public void adicionaFatura(Fatura fatura){ListaFaturas.add(fatura);}
    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r)
    {

        for(int x = 0; x<ListaEmp.size();x++)
        {
            if(ListaEmp.get(x).getRequisicao()==r)
                return ListaEmp.get(x);
        }
        return null;
    }
}