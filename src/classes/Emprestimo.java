package classes;

public class Emprestimo {
    private int codigo;
    private String dataSaida;
    private String previsaoEntrega;
    private double valorMulta;
    private boolean status;
    
    private Leitor leitor;
    private Obra obra;
    
    
    public Emprestimo(){
        
    }
    
    public Emprestimo(int codigo, String dataSaida, String previsaoEntrega, double valorMulta, boolean status, Leitor leitor, Obra obra){
        this.codigo = codigo;
        this.dataSaida = dataSaida;
        this.previsaoEntrega = previsaoEntrega;
        this.valorMulta = 0;
        this.status = true;
        this.leitor = leitor;
        this.obra = obra;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(String previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }
    
    
}
