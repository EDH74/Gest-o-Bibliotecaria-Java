package classes;
import java.util.ArrayList;

public class FichaConservacao implements GerenciarFichaConservacao{
    private int codigoFicha;
    private Obra obra;
    private String colaborador;
    private ArrayList<Intervencao> listaIntervencoes = new ArrayList();

    public FichaConservacao(Obra obra) {
        this.obra = obra;
    }
    
   
    public void inserirIntervencao(Obra obra, String nome, String data, String acao, String relato, String colaborador, Categoria categoria){
        
        this.colaborador = colaborador;
        this.obra = obra;
        Intervencao novaIntervencao = new Intervencao(nome, data, acao, relato, colaborador, categoria);
        this.listaIntervencoes.add(novaIntervencao);
        this.atualizarIdFichas(); 
    }
   
    
   @Override 
   public String retornarTodasIntervencoes(){
       String texto = "Obra: " + this.obra + "\n";
       for (Intervencao i : listaIntervencoes) {
           texto += "Cod: " + i.getId() + " | " + i.getNome() +
                   " | Resp: " + this.colaborador +
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
   
   public void setCodigoFicha(int codigoFicha){
       this.codigoFicha = codigoFicha;
   }
   
   public int getCodigoFicha() {
       return codigoFicha;
   }
   
   public Obra getObra(){
       return obra;
   }

    @Override
    public void atualizarIdFichas() {
        int cont = 1;
        
        for (Intervencao inter : listaIntervencoes){
            inter.setId(cont);
            cont ++;
        }
    }

    @Override
    public Intervencao acharIntervencao(int id) {
        for (Intervencao i : this.listaIntervencoes){
            if (i.getId() == id) return i;
        }
        return null;
    }
    
  
    
   
}
