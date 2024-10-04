package task1;

public class Name {
    public String firstName;
    public String lastName;
    public String otherNames;
    
    public Name(String firstName, String lastName, String otherNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherNames = otherNames;
    }

    public String toString() {
        return firstName+" "+otherNames+" "+lastName;
    }
}
