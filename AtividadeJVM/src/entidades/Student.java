package entidades;

public class Student extends User{
    //A classe Student herda a clase User
    private int year_registration;// visibilidade - privata, declaração de um atributo do tipo int
    private int currentSemestrer;// visibilidade - privata, declaração de um atributo do tipo int
    private Course course;// visibilidade - privata, Associação - A classe course compõe Student

    public int getYear_registration() {
        return year_registration;
    }

    public void setYear_registration(int year_registration) {
        this.year_registration = year_registration;
    }

    public int getCurrentSemestrer() {
        return currentSemestrer;
    }

    public void setCurrentSemestrer(int currentSemestrer) {
        this.currentSemestrer = currentSemestrer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
