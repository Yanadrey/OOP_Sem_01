import java.util.Scanner;
public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String getVoice() {
        String voice = "Mau";
        return voice;
    }

    @Override
    public void play() {
        System.out.println("Выберите игру: 1-мяч; 2-бантик");
        Scanner scanner = new Scanner(System.in);
        int game = scanner.nextInt();
        if (mood >= 5) {
            System.out.println("Кот " + this.name + " уже не хочет играть.");
        } else {
            if (game == 1) {
                if (this.mood > 3) {
                    System.out.println("Кот " + this.name + " уже не хочет играть в эту игру. Выберите другую!");
                } else {
                    mood += 3;
                }
            } else {
                if (game == 2) {
                    mood += 1;
                }
            }
        }
    }
    
}
