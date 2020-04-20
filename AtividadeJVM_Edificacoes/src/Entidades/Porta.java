package Entidades;

public class Porta {
    private boolean aberta;
    private String cor;
    private int dimensaoX;
    private int dimensaoY;
    private int dimensaoZ;

    public Porta(int x, int y, int z, String cor, boolean aberta){
        this.dimensaoX = x;
        this.dimensaoY = y;
        this.dimensaoZ = z;
        this.cor = cor;
        this.aberta = aberta;
    }
    public int getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(int dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public int getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(int dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public int getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(int dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }

    public String getCor(){
        return this.cor;
    }
    public void abre(){
        this.aberta = true;
    }

    public void fecha(){
        this.aberta = false;
    }

    public void pinta(String s){
        this.cor = s;
    }

    public boolean estaAberta(){
        return aberta;
    }

    @Override
    public String toString() {
        return "Dimensão: "+dimensaoZ+", "+
              dimensaoY+", "+dimensaoX+"\n"+"Cor: "+cor+"\nStatus: "+aberta;
    }
}
