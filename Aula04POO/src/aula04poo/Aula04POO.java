package aula04poo;

import java.util.Set;

public class Aula04POO {
 public static void main(String[] args) {

        Caneta c1 = new Caneta("NIC", 0.5f, "Vermelho");
        c1.status();
        Caneta c2 = new Caneta("KIKA", 0.75f, "Verde");
        c2.status();
        /*
        c1.setModelo("BIC Cristal");
        c1.setPonta(0.5f);

        //c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
         */

    }

}
