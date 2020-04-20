package entidades;

public class Course {
    private int codeCorse;// visibilidade - privata, declaração de um atributo do tipo int
    private String name;// visibilidade - privata, declaração de um atributo do tipo String

    // visibilidade - publica
    // método construtor
    // polimorfismo
    public void User(){
    }

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public int getCodeCorse() {
        return codeCorse;
    }
    // visibilidade - publica
    // método de atribuição de atributo encapsulado
    public void setCodeCorse(int codeCorse) {
        this.codeCorse = codeCorse;
    }
    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public String getName() {
        return name;
    }
    // visibilidade - publica
    // método de atribuição de atributo encapsulado
    public void setName(String name) {
        this.name = name;
    }

}
