package task1;

public class Client {
    public static void main(String[] args) {
        Name goat = new Name("Lionel", "Messi", "Andres");
        Date dob = new Date(24, 6, 1987);
        Person player = new Person(goat, dob);
        System.out.println(player);
    }
}
