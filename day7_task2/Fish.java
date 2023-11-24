package day7_task2;



public class Fish extends Animal {
    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public String toString() {
        return "Fish - " + super.toString();
    }


    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public String getVoice() {
        return "Silent in water";
    }


    public void swim() {
        System.out.println("Fish is swimming");
    }


}


