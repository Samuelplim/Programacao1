package view;

import Entidades.Especie;

public class Main {

    public static void main(String[] args) {
        Especie homem = new Especie("Chordata","Mammalia","Primata","Hominidae","Homo","Homo sapiens");
        Especie cao = new Especie("Chordata","Mammalia","Carnívora","Canidae","Canis","Canis famiçiaris");
        Especie mosca = new Especie("Arthropoda","Insecta","Díptera","Muscidae","Musca","Musca domestica");
        homem.setEspecie("Homo sapiens");

        System.out.println(homem.obterDescricao()+"\n");
        System.out.println(cao.obterDescricao()+"\n");
        System.out.println(mosca.obterDescricao()+"\n");
    }
}
