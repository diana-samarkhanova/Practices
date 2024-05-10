/*Создать динамический массив
Создать динамический массив, содержащий объекты класса HeavyBox.
Распечатать его содержимое используя for each.
Изменить вес первого ящика на 1 - здесь имеется ввиду, чтобы вес первого ящика стал 1   /*Удалить последний ящик.
Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
Удалить все ящики
         */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HeavyBox> boxList = new ArrayList<>();
        boxList.add(new HeavyBox(12));
        boxList.add(new HeavyBox(14));
        boxList.add(new HeavyBox(16));

        //for each
        for (HeavyBox box : boxList){
            System.out.println(box);
        }
        //вес первого ящика = 1
        HeavyBox firstBox = boxList.get(0);
        firstBox.setWeight(1);


        boxList.remove(boxList.size() - 1);//удаление последнего ящика
        //1 способ
        HeavyBox[] boxesArray1 = boxList.toArray(new HeavyBox[boxList.size()]);

        //2 способ
        HeavyBox[] boxesArray2 = boxList.toArray(new HeavyBox[0]);

        //3 способ
        HeavyBox[] boxesArray3 = new HeavyBox[boxList.size()];
        boxList.toArray(boxesArray3);

        System.out.println("Массив 1:");
        for (HeavyBox box : boxesArray1) {
            System.out.println(box);
        }
        System.out.println("Массив 2:");
        for (HeavyBox box : boxesArray2) {
            System.out.println(box);
        }
        System.out.println("Массив 3:");
        for (HeavyBox box : boxesArray3) {
            System.out.println(box);
        }

        boxList.clear();

    }
}