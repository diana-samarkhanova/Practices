
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Исаев Тимур";
        person1.age = 25;
        person1.move();
        person1.talk();

        Person person2 = new Person("Хусаинова Еркежан", 23);
        person2.move();
        person2.talk();

    }
}