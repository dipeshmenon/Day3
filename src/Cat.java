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
}
