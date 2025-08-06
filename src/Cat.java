public class Cat extends Animal{



    public Cat() {
        super();
    }

    public Cat(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println(getName()+" is making noise.");
    }

    public void jump(){
        System.out.println(getName()+" is jumping");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" is roaming with other cats.");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating cat food.");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing with other cats.");

    }
}
