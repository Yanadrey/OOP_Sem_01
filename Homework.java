import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Homework {
    
    /**
     * Нужно создать несколько классов животных:
     * 1. Пес (Собака)
     * 2. Кот (Кошка)
     * 3. ... придумать еще парочку
     *
     * Каждое животное имеет: (поля)
     * 1. Имя (кличка)
     * 2. Возраст
     * 3. ... придумать еще какие-то параметры
     *
     * Каждое животное может: (методы)
     * 1. Подавать голос
     * 2. Питаться (съедает какое-то количество еды, переданное в метод)
     * 3. Двигаться
     * 4. ... все, что сумеете придумать
     *
     * Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренним, внурь класса.
     * Создать массив с животными и в цикле заставить их поесть (какое-то количество еды) и заставить подать голос.
     */
    public static void main(String[] args) {
    Dog Sharik = new Dog("Sharik", 2);
    Dog Reks = new Dog("Reks",3);
    Cat Murzik = new Cat("Murzik", 5);
    Cat Murka = new Cat("Murka", 3);

    List<Animal> Group = new ArrayList<>();
    Group.add(Sharik);  
    Group.add(Reks);
    Group.add(Murzik);
    Group.add(Murka);

    Iterator<Animal> iter = Group.iterator();
    while (iter.hasNext()){
        Animal animal = iter.next();
        printAnimal(animal);  
        animal.eat();  
        animal.play(); 
        printAnimal(animal);    
    }
    }    

    private static void printAnimal(Animal animal) {
        System.out.println("Animal = " + animal.getClass() + ", name = " + animal.name + ", age = " + animal.age 
                                   + ", satiety = " + animal.getSatiety() + ", mood = " + animal.getMood() + 
                                   ", voice = " + animal.getVoice());
    }
    
}
