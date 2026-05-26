package classes;

public class Bibliotecaria extends Funcionario{   //Essa classe é uma herança da classe funcionario, a mesma possui os mesmo atributos de funcionarios + as que eu adicionei
                                                  //agora, crb e areaAtuacao.
    private String crb, areaAtuacao;    
    
    public Bibliotecaria(){
    }
    
    public Bibliotecaria(String crb, String areaAtuacao){
        this.crb = crb;
        this.areaAtuacao = areaAtuacao;
    }
    
    //Setters
    public void setCrb(String crb) {
        this.crb = crb;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    
    
    //Getters
    public String getCrb() {
        return crb;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codInterno=" + this.getCodInterno() + ", nome=" + this.getNome() + ", turno=" + this.getTurno() + ", telefone=" + this.getTelefone() + "CRB= " + crb + "Area de Atuação=" + areaAtuacao +'}';
    }
    
    
}
