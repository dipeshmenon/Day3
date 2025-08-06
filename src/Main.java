public class Main {
    public static void main(String[] args) {

       Dog d = new Dog("Doggy");
       Cat c = new Cat("Catyt");


       d.play();
       c.jump();
       AnimalUtils util = new AnimalUtils();
       util.addAnimal(d);
       util.addAnimal(c);
    }
}