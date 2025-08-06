public class Parrot extends Bird{


    public Parrot() {
        super();
    }

    public Parrot(String name){
        super(name);
    }
    @Override
    public void birdNoise() {
        System.out.println(getName()+" is speaking to me.");
    }

    @Override
    public void flight() {
        System.out.println(getName()+" is flying around.");
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+" is making noise like a parrot.");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" is roaming with other parrots.");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating bird food.");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with other parrots.");
    }

}
