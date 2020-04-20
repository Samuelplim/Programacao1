package entidades;

public class User{
    private int registration;// visibilidade - privata, declaração de um atributo do tipo int
    private String name;// visibilidade - privata, declaração de um atributo do tipo String
    private String last_name;// visibilidade - privata, declaração de um atributo do tipo String
    private String email;// visibilidade - privata, declaração de um atributo do tipo String
    private String password;// visibilidade - privata, declaração de um atributo do tipo String
    private Address user_address;// visibilidade - privata, Composição - Address compõem User

    // visibilidade - publica
    // método construtor
    // polimorfismo
    public User(String name){
        this.name=name;
    }
    // visibilidade - publica
    // método construtor
    // polimorfismo
    public User(){
    }

    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public int getRegistration() {
        return registration;
    }
    // visibilidade - publica
    // método de atribuição de atributo encapsulado
    public void setRegistration(int registration) {
        this.registration = registration;
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
    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public String getLast_name() {
        return last_name;
    }
    // visibilidade - publica
    // método de atribuição de atributo encapsulado
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public String getEmail() {
        return email;
    }
    // visibilidade - publica
    // método de atribuição de atributo encapsulado
    public void setEmail(String email) {
        this.email = email;
    }
    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public String getPassword() {
        return password;
    }
    // visibilidade - publica
    // método de atribuição de atributo encapsulado
    public void setPassword(String password) {
        this.password = password;
    }
    // visibilidade - publica
    // método de visualização de atributo encapsulado
    public Address getUser_address() {
        return user_address;
    }
    // visibilidade - publica
    // método de atribuição de atributo encapsulado
    public void setUser_address(Address user_address) {
        this.user_address = user_address;
    }
}
