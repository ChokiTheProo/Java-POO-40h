/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula011;

/**
 *
 * @author Roger Varela
 */
public class Aula011 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setCurso("Informática");
        a1.setMatricula(1111);
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Professor prof = new Professor();
        prof.setNome("Ana Maria");
        prof.setIdade(30);
        prof.setSexo("F");
        prof.setEspecialidade("Redes");
        prof.setSalario(2500.52f);
        prof.receberAumento(350f);
        System.out.println(prof.getSalario());
        
        Tecnico tec = new Tecnico();
        tec.setNome("Simão");
        tec.praticar();
        
    }
    
}