/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetopessoas;

/**
 *
 * @author Roger Varela
 */
public class Aluno extends Pessoa {
	//atributos
	private int matricula;
	private String curso;

	public void cancelarMatricula() {
		System.out.println("Matrícula será cancelada!");
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getCurso() {
		return this.curso;
	}
	
}