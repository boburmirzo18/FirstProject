package day7_task2;




public class Mammal extends Animal {

    public Mammal(String name, int age, double weight) {

        super(name, age, weight);
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating");
    }
    public void run() {
        System.out.println("Mammal is running");
    }

    @Override
    public String getVoice() {
        return "Mammal sound";
    }

}