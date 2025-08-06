public class Ostrich extends Bird{


    public Ostrich() {
        super();
    }

    public Ostrich(String name){
        super(name);
    }
    @Override
    public void birdNoise() {
        System.out.println(getName() + " is making some ostrich noise.");
    }

    @Override
    public void flight() {
        System.out.println(getName()+" can't fly.");

    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+" is again making some ostrich noises.");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" is roaming with other ostriches.");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating with other ostriches.");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with other ostriches.");
    }
}
