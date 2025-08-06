public class Dog extends Animal{

    public Dog(){}
    public Dog(String name){
        super(name);
    }

    public void makeNoise(){
        System.out.println("Dog barking");
    }

    public void roam(){
        System.out.println(getName()+" is roaming in the streets");
    }

    public void eat(){
        System.out.println(getName()+" eating dog food");
    }

    public void play(){
        System.out.println(getName() + " is playing with other dogs");
    }
}
