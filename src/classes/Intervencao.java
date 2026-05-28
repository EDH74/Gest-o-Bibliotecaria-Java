package classes;


public class Intervencao {
    private int id;
    private String nome, data, custo, relato;
    private Funcionario colaborador;
    private Categoria categoria;
    
    public Intervencao(){
    }

    public Intervencao(int id, String nome, String data, String custo, String relato, Funcionario colaborador, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.custo = custo;
        this.relato = relato;
        this.colaborador = colaborador;
        this.categoria = categoria;
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

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    public void setColaborador(Funcionario colaborador) {
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

    public String getCusto() {
        return custo;
    }

    public String getRelato() {
        return relato;
    }

    public Funcionario getColaborador() {
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
