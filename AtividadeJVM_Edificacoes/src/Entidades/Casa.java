package Entidades;

import java.util.ArrayList;

public class Casa {
    private String cor;
    private ArrayList<Porta> portas = new ArrayList<>();

    public Casa(String cor){
        this.cor = cor;
    }

    public Casa(){

    }

    public void pinta(String cor){
        this.cor=cor;
    }

    public void addPorta(Porta porta){
        this.portas.add(porta);
    }

    public int quantasPortasEstaoAbertas(){
        int qntPrtTrue=0;
        for (Porta porta:portas) {
            if(porta.estaAberta()){
                qntPrtTrue++;
            }
        }
        return qntPrtTrue;
    }

    public int totalDePortas(){
        return portas.size();
    }
}
