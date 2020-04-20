package view;

import entidades.Pais;

public class Main {

    public static void main(String[] args) {
        Pais brazil = new Pais("Brazil","Brasilia",8511000.0);
        brazil.addPaisesFronteiras(new Pais("Bolivia"));
        brazil.addPaisesFronteiras(new Pais("Venezuela"));
        brazil.addPaisesFronteiras(new Pais("Colombia"));

        Pais peru = new Pais("Peru","Lima",1285220.0);
        peru.addPaisesFronteiras(new Pais("Bolivia"));
        peru.addPaisesFronteiras(new Pais("Equador"));
        peru.addPaisesFronteiras(new Pais("Colombia"));

        System.out.println("Paises que fazem fronteira com o Brazil: "+brazil.getPaisesFronteiras());
        System.out.println("Paises que fazem fronteira com o Peru: "+peru.getPaisesFronteiras());
        System.out.println();
        System.out.println("Paises que fazem fronteira com o Brazil e Peru: "+brazil.equals(peru));
    }
}
