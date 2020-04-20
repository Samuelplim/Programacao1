package entidades;

import java.lang.reflect.Array;
import java.util.*;

public class Pais {
    private String nome;
    private String nomeCapital;
    private Double km2;
    private ArrayList<Pais> paisesFronteiras = new ArrayList<Pais>();

    public Pais(String nome, String nomeCapital, Double km2) {
        this.nome = nome;
        this.nomeCapital = nomeCapital;
        this.km2 = km2;
    }
    public Pais(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public  String getNomeCapital(){
        return nome;
    }

    public void setNomeCapital(String nomeCapital){
        this.nomeCapital = nomeCapital;
    }

    public Double getKm2(){
        return km2;
    }

    public void setKm2(Double km2){
        this.km2 = km2;
    }

    public ArrayList<String> getPaisesFronteiras() {
        ArrayList<String>  nomePaises = new ArrayList<String>();
        for (Pais paises:paisesFronteiras) {
            nomePaises.add(paises.getNome());
        }
        return nomePaises;
    }

    public void addPaisesFronteiras(Pais pais) {
        boolean achou = false;
        if (pais.getNome().equals(this.nome)){
        }else{
            for (Pais paises : paisesFronteiras) {
                if(paises.getNome().equals(pais.getNome())){
                    achou = true;
                    break;
                }
            }
            if(!achou){
                this.paisesFronteiras.add(pais);
            }
        }
    }
    public ArrayList<String> equals (Pais pais){
//        Lista com a união dos paises equalsPaises
        ArrayList<String>  equalsPaises = new ArrayList<String>();

//        Lista com os paises que fazem fronteira do pais recebido
        ArrayList<String>  paisFronteira = new ArrayList<String>();
        paisFronteira = pais.getPaisesFronteiras();

        for (Pais paises : paisesFronteiras){
            for (String paisx2:paisFronteira) {
                if(paises.getNome().equals(paisx2)){
                    equalsPaises.add(paises.getNome());
                    break;
                }
            }
        }
        return equalsPaises;
    }

}
