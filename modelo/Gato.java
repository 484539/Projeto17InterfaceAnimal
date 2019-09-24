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
public class Gato extends Felino implements IDomestico{
    private String raca;
    
    //Construtores GETTERS e SETTERS

    public Gato() {
    }

    public Gato(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public void makeNoise(){
        System.out.println("Gato Mia");
    }    
    
    @Override
    public void movimentar(){
        System.out.println("Rastejando");
    }  

    @Override
    public void alimentar() {
       super.comida = "ração whiskas";
        System.out.println("Alimentar 3x ao dia");
    }
    
    
}

