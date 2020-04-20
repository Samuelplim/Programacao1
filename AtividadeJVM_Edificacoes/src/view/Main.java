package view;

import Entidades.Casa;
import Entidades.Edificio;
import Entidades.Porta;

public class Main {

    public static void main(String[] args) {

//        3.A
        Porta portaTeste = new Porta(100 , 50, 5, "Amarelo", false);
        System.out.println("Porta teste\n"+portaTeste.toString());
        portaTeste.abre();
        portaTeste.fecha();
        portaTeste.pinta("Marrom");
        portaTeste.pinta("Verde");
        portaTeste.setDimensaoX(120);
        portaTeste.setDimensaoY(60);
        portaTeste.setDimensaoZ(7);
        System.out.println("Porta teste\n"+portaTeste.toString()+"\n");

//        3.B
        Porta porta1 = new Porta(100 , 50, 5, "Amarelo", false);
        Porta porta2 = new Porta(150 , 60, 5, "Azul", true);
        Porta porta3 = new Porta(100 , 50, 10, "Cinza", false);

        Casa home = new Casa("Branco");
        home.addPorta(porta1);
        home.addPorta(porta2);
        home.addPorta(porta3);

        System.out.println("Portas abertas: "+home.quantasPortasEstaoAbertas()+"\n");

//      3.C
        Porta porta4 = new Porta(100 , 50, 10, "Verde", true);
        Porta porta5 = new Porta(100 , 50, 5, "Branco", true);
        Porta porta6 = new Porta(190 , 50, 10, "Rosa", false);

        Edificio edificioJoelma = new Edificio();
        edificioJoelma.setCor("Branco");

        edificioJoelma.addPorta(porta1);
        edificioJoelma.addPorta(porta2);
        edificioJoelma.addPorta(porta3);
        edificioJoelma.addPorta(porta4);
        edificioJoelma.addPorta(porta5);
        edificioJoelma.addPorta(porta6);
        edificioJoelma.portas.get(1).fecha();
        edificioJoelma.portas.get(3).abre();

        System.out.println("Quantidade de portas abertas: "+edificioJoelma.getQntPortasOpen()+
                "\nTotal de portas: "+edificioJoelma.getTotalDePortas());

        edificioJoelma.addAndares();
        edificioJoelma.addAndares();
        edificioJoelma.addAndares();

        System.out.println("Total de andares: "+edificioJoelma.getTotalDeAndares());

    }
}
