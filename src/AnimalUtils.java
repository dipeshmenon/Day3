public class AnimalUtils {

    public void addAnimal (Animal animal){
        System.out.println("Animal added "+animal.getName());


        if(animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.jump();
        }

        else if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.eat();
        }
    }
}
