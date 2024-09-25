/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12;

/**
 *
 * @author Roger Varela
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Animal n = new Animal();
     Mamifero m = new Mamifero();
     Reptil r = new Reptil();
     Peixe p = new Peixe();
     Ave a = new Ave();
     Canguru c = new Canguru();
     Cachorro k = new Cachorro();
     Cobra j = new Cobra();
     Tartaruga t = new Tartaruga();
     GoldFish g = new GoldFish();
     Arara e = new Arara();
        // TODO code application logic here
   c.locomover();
   k.locomover();
   c.emitirSom();
   k.emitirSom();
    }
    
}
