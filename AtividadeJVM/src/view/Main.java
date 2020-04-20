package view;

import entidades.Address;
import entidades.Course;
import entidades.Student;

public class Main {

    public static void main(String[] args) {
        Course curso = new Course();//Alocação na memoria, Método construtor
        curso.setCodeCorse(3001);//Objeto
        curso.setName("Sistemas de informação");//Objeto

        //Classe Address
        Address endereco = new Address();//Alocação na memoria, Método construtor
        endereco.setID(69);//Objeto
        endereco.setCep("69.300.000");//Objeto
        endereco.setCity("Boa Vista");//Objeto
        endereco.setPublic_place("Centro");//Objeto
        endereco.setUf("RR");//Objeto

        //Classe Student
        Student samuel = new Student();//Alocação na memoria, Método construtor
        samuel.setCurrentSemestrer(4);//Objeto
        samuel.setYear_registration(2018);//Objeto
        samuel.setCourse(curso);//Associação

        //Classe User, objetos da herança de User com Student
        samuel.setRegistration(2018897584);//Objeto
        samuel.setName("Samuel");//Objeto
        samuel.setLast_name("Delgado");//Objeto
        samuel.setEmail("samuel12nerd@gmail.com");//Objeto
        samuel.setPassword("4W@n129O");//Objeto
        samuel.setUser_address(endereco);//Composição
    }
}
