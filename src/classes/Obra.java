package classes;
import java.util.ArrayList;
import classes.Autor;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Obra {
    private String titulo, isbn, data, editora;
    private boolean status;
    private final ArrayList<Autor> listAutor = new ArrayList();


    public Obra(){
        this.status = false;
    }

    public Obra(String titulo, String isbn, String data, String editora) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.data = data;
        this.editora = editora;
        this.status = false;
    }



    //getter e setter de Titulo!
    public String getTitulo() {
        return titulo;
    }

    public String getStatus() {
        return status ? "Ativo":"Devolvido";
    }

    public void setStatus(boolean emprestado) {
        this.status = emprestado;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //getter e setter de isbn!
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //getter e setter de data!
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    //getter e setter de editora!
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    //getter e setter de autores!
    public ArrayList<Autor> getAutores() {
        return this.listAutor;
    }

    public void setAutores(Autor autores) {
        this.listAutor.add(autores);

    }

    public String exibirAutores(){
        String msg = "" ;

        for(Autor i : listAutor){
            msg += "Autor: " + i.getNome() + "\nNascionalidade: " + i.getNascionalidade() + "\n";
        }

        return msg;
    }

    @Override
    public String toString() {
        return  "Titulo = " + titulo
                + "\nISBN = " + isbn
                + "\nData = " + data
                + "\nEditora = " + editora 
                + "\nStatus de Emprestimo = " + status + "\n"
                + exibirAutores();
    }


}
