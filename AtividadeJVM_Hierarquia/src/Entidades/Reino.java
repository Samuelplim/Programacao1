package Entidades;

public abstract class Reino{
    private static final String reino = "Animalia";

    public String getReino() {
        return reino;
    }

    public abstract String obterDescricao();
}
