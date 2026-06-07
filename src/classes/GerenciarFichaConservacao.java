package classes;

public interface GerenciarFichaConservacao {
    public void inserirIntervencao(String nome, double custo, String relato, Colaborador colaborador, Categoria categoria);
    
    public String retornarTodasIntervencoes();
    
    public String retornarFichaConservacaoCompleta();
    
    public double calcularCustoTotal();
    
    public int quantidadeDeIntervencoes();
    
}
