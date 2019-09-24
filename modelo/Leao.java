/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Robson
 */
public class Leao extends Felino{
    private String origem;
    
    //Construtres GETTERS e SETTERS

    public Leao() {
    }

    public Leao(String origem) {
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    
    public void makeNoise(){
        System.out.println("Geme");
    }    
    
    public void movimentar(){
        System.out.println("Andar");
    }
}
