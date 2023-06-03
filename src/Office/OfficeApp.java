package Office;

public class OfficeApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Dani";
        manager.sayHello("Budi");

        var ceo = new Ceo();
        ceo.name = "Daniel";
        ceo.sayHello("Nathan");
    }
}
