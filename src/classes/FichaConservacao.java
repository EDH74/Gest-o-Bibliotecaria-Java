package classes;


public class FichaConservacao {
    private String nome, relato;
    private double custo;
    private Categoria categoria;
    private Funcionario colaborador;
    private int code;
    
    
    public FichaConservacao(){
    }

    public FichaConservacao(String nome, String relato, double custo, Categoria categoria, Funcionario colaborador, int code) {
        this.nome = nome;
        this.relato = relato;
        this.custo = custo;
        this.categoria = categoria;
        this.colaborador = colaborador;
        this.code = code;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setColaborador(Funcionario colaborador) {
        this.colaborador = colaborador;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
    
    //Getters

    public String getNome() {
        return nome;
    }

    public String getRelato() {
        return relato;
    }

    public double getCusto() {
        return custo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Funcionario getColaborador() {
        return colaborador;
    }
    
    public int getCode(){
        return code;
    }

    @Override
    public String toString() {
        return "fichaConservacao{" + "nome=" + nome + ", relato=" + relato + ", custo=" + custo + ", categoria=" + categoria + ", colaborador=" + colaborador + ", code=" + code + '}';
    }
    
    
}
