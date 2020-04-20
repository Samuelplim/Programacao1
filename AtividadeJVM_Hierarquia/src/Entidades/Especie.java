package Entidades;

public class Especie extends Genero{
    private String especie;

    public Especie(String filo, String classe, String ordem, String familia, String genero, String especie){
        this.setFilo(filo);
        this.setClasse(classe);
        this.setOrdem(ordem);
        this.setFamilia(familia);
        this.setGenero(genero);
        this.especie = especie;
    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    @Override
    public String obterDescricao() {
        return "Reino: "+this.getReino()+"\nFilo: "+this.getFilo()+"\nClasse: "+this.getClasse()+
                "\nOrdem: "+this.getOrdem()+"\nFamília: "+this.getFamilia()+"\nGênero: "+this.getGenero()+
                "\nEspécie: "+this.getEspecie();
    }
}
