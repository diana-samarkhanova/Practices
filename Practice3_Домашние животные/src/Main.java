/*
Домашние животные
Создайте класс Pet и его наследников Cat, Dog, Parrot.
Создайте отображение из домашних животных, где в качестве ключа выступает имя животного, а в качестве значения класс Pet.
Добавьте в отображение разных животных. Создайте метод выводящий на консоль все ключи отображения.
 */
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Pet> petsMap = new HashMap<>();
        petsMap.put("Пума", new Cat("Пума"));
        petsMap.put("Валли", new Dog("Валли"));
        petsMap.put("Тоша", new Parrot("Тоша"));
        printKey(petsMap);


    }
    public static void printKey(Map<String, Pet> map){
        System.out.println("Список животных: ");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
