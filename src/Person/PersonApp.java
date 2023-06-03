package Person;

public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Zetsu","Konoha");

        System.out.print(person1.StudentName);
        System.out.print(person1.StudentAddress);
        System.out.println(person1.country);

        person1.calling("Sasuke");

        Person person2 = new Person("Kakashi","Hokage");
        person2.calling("Naruto");

        Person person3 = new Person();
        person3.StudentName = " Itachi ";
        person3.calling(" Obito ");
    }
}
