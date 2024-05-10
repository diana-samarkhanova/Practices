public class Phone {
    public String number;
    public String model;
    public double weight;

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //2 parameters
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    //3 parameters
    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    //no parameters
    public Phone(){
    }

    public void receiveCall(String namecall){
        System.out.println("Звонит " + namecall);
    }
    public void receiveCall(String namecall, String number){
        System.out.println("Звонит " + namecall + " Номер: " + number);
    }
    public void sendMessage(String... phoneNumbers){
        System.out.println("Отправка сообщения по номерам: ");
        for(String number : phoneNumbers){
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
