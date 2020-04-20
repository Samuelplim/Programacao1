package Entidades;

import java.util.ArrayList;

public class Edificio {
    private String cor;
    private int totalDePortas;
    private int totalDeAndares;
    public ArrayList<Porta> portas = new ArrayList<>();

    public Edificio(){
        this.totalDePortas = 0;
    }
    public void setCor (String cor){
        this.cor = cor;
    }
    public String getCor (String cor){
        return cor;
    }

    public int getQntPortasOpen(){
        int quant=0;
        for (Porta port:portas) {
            if(port.estaAberta()){
                quant++;
            }
        }
        return quant;
    }

    public void addPorta(Porta porta){
        portas.add(porta);
        this.totalDePortas++;
    }

    public int getTotalDePortas(){
        return this.totalDePortas;
    }

    public void addAndares(){
        this.totalDeAndares++;
    }
    public int getTotalDeAndares(){
        return this.totalDeAndares;
    }
}
