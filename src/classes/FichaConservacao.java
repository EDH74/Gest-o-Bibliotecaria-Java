package classes;
import java.util.ArrayList;

public class FichaConservacao implements GerenciarFichaConservacao{
    private int codigoFicha;
    private Obra obra;
    private ArrayList<Intervencao> listaIntervencoes;
    
    public FichaConservacao(int codigoFicha, Obra obra) {
        this.codigoFicha = codigoFicha;
        this.obra = obra;
        this.listaIntervencoes = new ArrayList<>();
    }
    
    
    @Override
    public void inserirIntervencao(String nome, double custo, String relato, Colaborador colaborador, Categoria categoria){
        int proximoCodigo = this.listaIntervencoes.size() + 1;
        Funcionario func = (Funcionario) colaborador;
        
        Intervencao novaIntervencao = new Intervencao(proximoCodigo, nome, "12/10/2026", custo, relato, func, categoria);
        this.listaIntervencoes.add(novaIntervencao);
    }
   
    
   @Override 
   public String retornarTodasIntervencoes(){
       String texto = "";
       for (Intervencao i : listaIntervencoes) {
           texto += "Cod: " + i.getId() + " | " + i.getNome() +
                   " | Resp: " + i.getColaborador().getNome() +
                   " | Cate: " + i.getCategoria().getNome() + "\n";
       }
       return texto;
   }
   
   
   @Override
   public double calcularCustoTotal(){
       double total = 0;
       for (Intervencao i : listaIntervencoes){
            total += i.getCusto();
       }
       return total;
   }
   
   
   @Override
   public int quantidadeDeIntervencoes(){
       return this.listaIntervencoes.size();
   }
   
   
   @Override
   public String retornarFichaConservacaoCompleta() {
       String relatorio = """
                       ==================================================
                                  FICHA DE CONSERVAÇÃO Nº: %d
                       ==================================================
                       Obra: %s
                       ISBN: %s | Editora: %s
                       --------------------------------------------------
                       HISTÓRICO DE INTERVENÇÕES:
                       %s--------------------------------------------------
                       Quantidade Total: %d
                       Custo Total Acumulado: R$ %.2f
                       ==================================================
                       """.formatted(
                           this.codigoFicha, 
                           this.obra.getTitulo(), 
                           this.obra.getIsbn(), 
                           this.obra.getEditora(),
                           this.listaIntervencoes.isEmpty() ? "Nenhuma intervenção registrada.\n" : retornarTodasIntervencoes(),
                           quantidadeDeIntervencoes(), 
                           calcularCustoTotal()
                       );
       return relatorio;
   }
   
   public int getCodigoFicha() {
       return codigoFicha;
   }
   
   public Obra getObra(){
       return obra;
   }
   
}
