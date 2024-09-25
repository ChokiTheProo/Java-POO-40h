/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula011;

/**
 *
 * @author Roger Varela
 */
public class Tecnico extends Pessoa {

    private String registoProfissional;

    public String getRegistoProfissional() {
        return registoProfissional;
    }

    public void setRegistoProfissional(String registoProfissional) {
        this.registoProfissional = registoProfissional;
    }

    public void praticar() {
        System.out.println(nome + " está a praticar.");
    }
}
