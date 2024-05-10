
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("87058267453", "iPhone 15 Pro", 0.187);
        Phone phone2 = new Phone("87772645858", "Samsung Galaxy S24 Ultra");
        Phone phone3 = new Phone();

        phone1.receiveCall("Алия");
        phone2.receiveCall("Куаныш", "87475658585");
        phone1.receiveCall("Дархан");

        System.out.println("Номер телефона у первого телефона: " + phone1.getNumber());

        phone1.sendMessage("87774445566", "87778885566", "87779993344");
    }
}