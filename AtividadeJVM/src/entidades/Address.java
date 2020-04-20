package entidades;

public class Address {
    private int idAddress;// visibilidade - privata, declaração de um atributo do tipo int
    private String cep;// visibilidade - privata, declaração de um atributo do tipo String
    private String public_place;// visibilidade - privata, declaração de um atributo do tipo String
    private String uf;// visibilidade - privata, declaração de um atributo do tipo String
    private String city;// visibilidade - privata, declaração de um atributo do tipo String

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public int getID() {
        return idAddress;
    }

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public void setID(int idAddress) {
        this.idAddress = idAddress;
    }

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public String getCep() {
        return cep;
    }

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public void setCep(String cep) {
        this.cep = cep;
    }

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public String getPublic_place() {
        return public_place;
    }

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public void setPublic_place(String public_place) {
        this.public_place = public_place;
    }

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public String getUf() {
        return uf;
    }

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public void setUf(String uf) {
        this.uf = uf;
    }

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public String getCity() {
        return city;
    }

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public void setCity(String city) {
        this.city = city;
    }

}
