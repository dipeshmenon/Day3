public abstract class Animal {

    private String Name;

    public Animal (){}
    public Animal(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void sleep(){
        System.out.println(getName() + " is sleeping");
    }


    public abstract void makeNoise();
    //    System.out.println(getName()+" is making noise.");


    public abstract void roam();
    //    System.out.println(getName()+" is roaming");


    public abstract void eat();
//        System.out.println(getName()+" eating food");


    public abstract void play();
    //    System.out.println(getName() + " is playing");

}
