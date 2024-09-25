
package aula02poo;

 class Caneta {
 String modelo;
 String cor;
 float ponta;
 int carga;
 boolean tampada;
void status(){
    System.out.println("uma caneta " + this.cor);
    System.out.println("esta tampada?"+this.tampada);
    System.out.println("ponta" + this.ponta);
    System.out.println("carga" + this.carga);
    System.out.println("Modelo" + this.modelo);
}
 void rabiscar(){
    if(this.tampada == true){
        System.out.println("Erro nao posso rabiscar");
    }else{
        System.out.println("Estou Rabiscando");
    }
}
 void tampar(){
    this.tampada = true;
    
}
 void destampar(){
    this.tampada = false;
    
}
}
