public class Animal {

    String name;
    int age;
    boolean satiety = false;
    int mood = 0; // от 0 до 5
    String voice = " ";

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public int getMood() {
        return mood;
    }

    public void eat() {
        if (this.satiety) {
            return;
        }
        this.satiety = true;
    }

    public void play() {

    }

    public String getVoice() {
        return voice;
    }
}
