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
public class Cao extends Canino implements IDomestico{
    private double tamanho;

    public Cao() {
    }

    public Cao(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }   
    
    
    
    
    @Override
    public void makeNoise(){
        System.out.println("Cao Late");
    }
    
    
    @Override
    public void movimentar(){
        System.out.println("Andar");
    }

    @Override
    public void alimentar() {
        super.comida = "ração teste";
        System.out.println("Alimentar 5x ao dia");
    }
    
}
