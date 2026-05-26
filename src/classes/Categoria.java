package classes;


public class Categoria {
    private String name;
    private int code;

    public Categoria(String name, int code) {
        this.name = name;
        this.code = code;
    }
    
    public Categoria(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Categoria{" + "name=" + name + ", code=" + code + '}';
    }
    
}
