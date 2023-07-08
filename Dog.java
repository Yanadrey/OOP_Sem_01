import java.util.Scanner;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String getVoice() {
        String voice = "Woof";
        return voice;
    }

    @Override
    public void play() {
        System.out.println("Выберите игру: 1-мяч; 2-новая команда; 3-диск");
        Scanner scanner = new Scanner(System.in);
        int game = scanner.nextInt();
        if (mood >= 5) {
            System.out.println("Собака " + this.name + " уже не хочет играть.");
        } else {
            if (game == 1) {
                if (this.mood > 3) {
                    System.out.println("Собака " + this.name + " уже не хочет играть в эту игру. Выберите другую!");
                } else {
                    mood += 3;
                }
            } else {
                if (game == 2) {
                    mood += 1;
                } else {
                    if (game == 3) {
                        mood += 1;
                    } 
                }
            }
        }
    }
}
