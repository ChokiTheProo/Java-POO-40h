/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula011;

/**
 *
 * @author Roger Varela
 */
public class Bolsista extends Aluno {

    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(nome + " é bolsista! Pagamento facilitado.");
    }
}