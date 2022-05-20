import java.util.Objects;
public class Author {

    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() { // метод toString
        return name + " " + surname;
    }
    @Override
    public boolean equals(Object other) {  //Сравнение объектов
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return name.equals(c2.name);
    }

    @Override
    public int hashCode() { //Метод hashCode
        return Objects.hash(name);
    }













}