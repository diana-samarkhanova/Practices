public class Person {
    public String fullName;
    public int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println(fullName + " двигается");
    }
    public void talk(){
        System.out.println(fullName + " говорит");
    }
}
