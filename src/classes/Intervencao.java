package classes;


public class Intervencao {
    private int id;
    private String nome, data, relato, acao, colaborador;
    private double custo;
    private Categoria categoria;
    
    public Intervencao(){
    }

    public Intervencao(String nome, String data, String acao, String relato, String colaborador, Categoria categoria) {
        this.nome = nome;
        this.data = data;
        this.acao = acao;
        this.relato = relato;
        this.colaborador = colaborador;
        this.categoria = categoria;
        
        switch (acao) {
            case "Restauro":
                this.custo = 120.00;
                break;
            case "Encardenacao":
                this.custo = 60.00;
                break;
            case "Higienizacao":
                this.custo = 50.99;
            default:
                throw new RuntimeException("Não existe essa ação solicitada");
        }
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }


    public void setRelato(String relato) {
        this.relato = relato;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public Double getCusto() {
        return custo;
    }

    public String getRelato() {
        return relato;
    }

    public String getColaborador() {
        return colaborador;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Intervencao{" + "id=" + id + ", nome=" + nome + ", data=" + data + ", custo=" + custo + ", relato=" + relato + ", colaborador=" + colaborador + ", categoria=" + categoria + '}';
    }
    
    
}
