package classes;
import classes.models.EmprestimoGerencia;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Emprestimo implements EmprestimoGerencia{
    private int codigo;
    private String dataSaida;
    private String previsaoEntrega;
    private String dataDevolvida;
    private double valorMulta;
    private boolean status;
    
    private Leitor leitor;
    private Obra obra;
    
    
    public Emprestimo(){
        
    }
    
    public Emprestimo(String dataSaida, String previsaoEntrega, String dataDevolvida,Leitor leitor, Obra obra){
        this.dataSaida = dataSaida;
        this.previsaoEntrega = previsaoEntrega;
        this.dataDevolvida = dataDevolvida;
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

    public String isStatus() {
        return status ? "Ativo":"Devolvido";
    }

    public void setStatus(boolean status) {
        this.status = status;
        this.obra.setStatus(status);
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
    
    @Override
    public String toString(){
        return "\nNome da Obra: " + obra.getTitulo() + 
                " - Pego em: " + dataSaida + 
                " - Data de Devolução: " + previsaoEntrega + 
                " Valor da Multa: " + valorMulta;
    }

    @Override
    public void calcularMulta() {
        SimpleDateFormat dataFormato = new SimpleDateFormat("dd/mm/yyyy");  //Variavel que transforma String (09/01/2020) em date
        Calendar dataInicio = Calendar.getInstance();      //Passando para classe Calendar, nela tem como fazer as comparações entre datas
        Calendar dataFim = Calendar.getInstance(); 
        Calendar dataDevolvida = Calendar.getInstance();
        try {
            Date dataInicioConvertida = dataFormato.parse(this.dataSaida);
            Date dataFimConvertida = dataFormato.parse(this.previsaoEntrega); //Transformando em data
            Date dataDevolvidaConvertida = dataFormato.parse(this.dataDevolvida);
             
            dataInicio.setTime(dataInicioConvertida);
            dataFim.setTime(dataFimConvertida);
            dataDevolvida.setTime(dataDevolvidaConvertida);
            
            if (dataFim.before(dataInicio)) throw new IllegalArgumentException("A data de fim é menor que a data de começo");
            
            if (dataDevolvida.after(dataFim))
            {
                this.valorMulta = 25;
            } 
            else
            {
                this.valorMulta = 0;
            }
            
        } catch (ParseException e) {
            System.getLogger("Erro ao Calcular a Multa, tente novamente mais tarde!");
        }
        
        
   
        
        
        
        
    }
    
    
}
