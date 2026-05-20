package classes;
import java.util.ArrayList;

public class Funcionario {
    int codInterno;
    String nome, turno;
    ArrayList<String> telefone = new ArrayList();
    
    public Funcionario(){
        
    }

    //Setters
    public void setCodInterno(int codInterno) {
        this.codInterno = codInterno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setTelefone(String telefone) {
        this.telefone.add(telefone);
    }
    
    //Getters
    public int getCodInterno() {
        return codInterno;
    }

    public String getNome() {
        return nome;
    }

    public String getTurno() {
        return turno;
    }

    public ArrayList<String> getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codInterno=" + codInterno + ", nome=" + nome + ", turno=" + turno + ", telefone=" + telefone + '}';
    }
    
    
}
