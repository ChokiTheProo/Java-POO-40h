/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author Roger Varela
 */
public class Funcionario extends Pessoa {
	//atributos
	private String setor;
	private boolean trabalhando;
	

	//métodos
	public void mudarTrabalho() {
		this.trabalhando = !this.getTrabalhando();
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public String getSetor() {
		return this.setor;
	}
	
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	public boolean getTrabalhando() {
		return this.trabalhando;
	}
	
}