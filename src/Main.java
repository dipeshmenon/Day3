public class Main {
    public static void main(String[] args) {

       Dog d = new Dog("Spike");
       Cat c = new Cat("Tom");
      Parrot pr = new Parrot("Blue");
        pr.birdNoise();
        pr.eat();
        pr.flight();
        pr.makeNoise();
        pr.play();
        pr.roam();
        pr.sleep();


        Animal an =new Cat("Slep");
       // an.sleep();

        Cat ct = (Cat)an;
        ct.sleep();

       d.play();
       c.jump();
       AnimalUtils util = new AnimalUtils();
       util.addAnimal(d);
       util.addAnimal(c);
    }
}