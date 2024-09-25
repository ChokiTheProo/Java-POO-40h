/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12;

/**
 *
 * @author Roger Varela
 */
public class Peixe extends Animal {
    private String CorEscama;

    @Override
    public void locomover() {
        System.out.println("Nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo sub");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe nao faz som");
    }
    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    public String getCorEscama() {
        return CorEscama;
    }

    public void setCorEscama(String CorEscama) {
        this.CorEscama = CorEscama;
    }
    
            
    
}
