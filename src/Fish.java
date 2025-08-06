public class Fish extends Animal{

    public Fish() {
        super();
    }

    public Fish(String name){
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+" is making fishy noises.");
    }

    @Override
    public void roam() {

        System.out.println(getName() + " is swimming around with other fish..");

    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish food..");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing hide and seek with Nemo.");
    }
}
