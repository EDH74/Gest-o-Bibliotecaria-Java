package classes;

public interface GerenciarFichaConservacao {
 
    public String retornarTodasIntervencoes();
    
    public String retornarFichaConservacaoCompleta();
    
    public double calcularCustoTotal();
    
    public int quantidadeDeIntervencoes();
    
    public void atualizarIdFichas();
    
    public Intervencao acharIntervencao(int id);
}
