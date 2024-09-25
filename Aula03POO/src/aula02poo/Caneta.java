
package aula02poo;

public class Caneta {
public String modelo;
public String cor;
private float ponta;
protected int carga;
protected boolean tampada;
void status(){
    System.out.println("uma caneta " + this.cor);
    System.out.println("esta tampada?"+this.tampada);
    System.out.println("ponta" + this.ponta);
    System.out.println("carga" + this.carga);
    System.out.println("Modelo" + this.modelo);
}
public void rabiscar(){
    if(this.tampada == true){
        System.out.println("Erro nao posso rabiscar");
    }else{
        System.out.println("Estou Rabiscando");
    }
}
protected void tampar(){
    this.tampada = true;
    
}
protected void destampar(){
    this.tampada = false;
    
}
}
