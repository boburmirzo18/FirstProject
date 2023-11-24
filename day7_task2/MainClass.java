package day7_task2;

public class MainClass {


    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Dog("Black", 3, 12.5, "lebra");
        animals[1] = new Blowfish("Bubbles", 1, 0.5, "gold");
        animals[2] = new Pigeon("Feather", 2, 0.8, "Gray", "Rock Pigeon");
        animals[3] = new Mammal("Mammal", 5, 20.0);
        animals[4] = new Bird("Peacock", 2, 0.5, "Blue");
        animals[5] = new Fish("Fish", 1, 0.5);

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            animal.getvoice();
            if (animal instanceof Mammal) {
                ((Mammal) animal).run();
            }
            if (animal instanceof Bird) {
                ((Bird) animal).fly();
            }
            if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }
            System.out.println("************************************");
        }
       // animals[1].getvoice();
       // animals[3].getvoice();
    }
}








