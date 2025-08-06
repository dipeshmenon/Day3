public class Animal {

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


    public void makeNoise(){
        System.out.println(getName()+" is making noise.");
    }

    public void roam(){
        System.out.println(getName()+" is roaming");
    }

    public void eat(){
        System.out.println(getName()+" eating food");
    }

    public void play(){
        System.out.println(getName() + " is playing");
    }
}
