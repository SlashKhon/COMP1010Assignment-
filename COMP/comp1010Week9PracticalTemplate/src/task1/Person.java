package task1;

public class Person {
    public Name name;
    public Date dateOfBirth;

    public Person(Name name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return name.toString() + ", born " + dateOfBirth.toString();
    }
}
