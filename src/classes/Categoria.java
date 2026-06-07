package classes;


public class Categoria {
    private String nome;
    private int code;

    public Categoria(String nome, int code) {
        this.nome = nome;
        this.code = code;
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
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
}
