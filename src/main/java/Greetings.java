public class Greetings {
    private String name;

    public Greetings(String x) {
        name = x;
    }

    void display() {
        if (name.equals("Alice") ) {
            System.out.println("Hello, " + name);
        } else if (name == "Bob") {
            System.out.println("Hello, " + name);
        }
    }


}
