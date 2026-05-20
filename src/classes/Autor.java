/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author eduar
 */
public class Autor {
    String nome, nascionalidade;
    
    public Autor(){
    }
    
    public Autor(String nome, String nascionalidade){
        this.nome = nome;
        this.nascionalidade = nascionalidade;
    }
    
    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }
    
    
    //Getters
    public String getNome() {
        return nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }
    


}
