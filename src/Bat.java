public class Bat extends Animal{


    public Bat() {
        super();
    }

    public Bat(String name){
        super(name);
    }
    @Override
    public void makeNoise() {
        System.out.println(getName()+" is making a lot of noise with other bats.");
    }

    @Override
    public void roam() {

        System.out.println(getName() + " is flying around with other bats.");

    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating fruits with other bats.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with other bats");
    }
}
