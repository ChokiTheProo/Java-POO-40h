
package aula02poo;

 class Aula02POO {

  
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        
        c1.status();
        c1.rabiscar();
        Caneta c2 = new Caneta();
        c2.modelo = "hostnet";
        c2.modelo = "preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
         
     
    }
    
}
