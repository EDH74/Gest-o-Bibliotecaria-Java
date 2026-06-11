package classes;
import java.util.ArrayList;

public class Leitor {
    private String cpf;
    private String nome;
    private ArrayList<Emprestimo> emprestimoListLeitor;
    
    public Leitor(){
        this.emprestimoListLeitor = new ArrayList();
    }
    
    public Leitor(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
        this.emprestimoListLeitor = new ArrayList();
    }

    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEmprestimo(Emprestimo emprestimo){
        this.emprestimoListLeitor.add(emprestimo);
    }
    
    public void removerEmprestimo(Emprestimo emprestimo){
        emprestimoListLeitor.remove(emprestimo);
    }

    public String getAllEmprestimos(){
        String msg = "Todos os emprestimos do " + this.nome + ": \n";
        
        for (Emprestimo i : emprestimoListLeitor){
            msg += i.toString();
        }
        
        return msg;
    }

    @Override
    public String toString() {
        return "Leitor{" + "cpf=" + cpf + ", nome=" + nome +'}';
    }
    
    
}
