package classes;


public class Categoria {
    private String nome;
    private int id;

    public Categoria(String nome) {
        this.nome = nome;
    }
    
    public Categoria(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCode() {
        return id;
    }

    public void setCode(int code) {
        this.id = code;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
}
