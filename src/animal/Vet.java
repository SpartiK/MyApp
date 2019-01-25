package animal;


public class Vet {

    public void treatAnimal(Animal animal) {
        System.out.println(animal+ " eat " + animal.food + " and live  " + animal.location);
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Meat", "DogHome", "Bone");
        Animal horse = new Horse("Grass", "Field", "White");
        Animal cat = new Cat("Milk", "Home", "Garfild");
        Vet vet = new Vet();
        cat.sleap(cat);
        dog.makeNoise();
        horse.eat();
        Animal[] animals = new Animal[]{dog, horse, cat};
        for (Animal a : animals) {
            vet.treatAnimal(a);
        }
    }
}
