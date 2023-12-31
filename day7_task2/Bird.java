package day7_task2;




public class Bird extends Animal {
    String featherColor;

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }
    @Override
    public String toString() {
        return "Bird - " + super.toString() + ", Feather Color: " + featherColor;
    }


    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }
    public void fly(){
        System.out.println("Bird is flying");
    }

    @Override
    public String getVoice() {
        return "Chirp! Chirp!";
    }

}