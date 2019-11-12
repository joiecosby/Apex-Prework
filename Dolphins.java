public class Dolphins extends Animal{

    public Dolphins(String name, String color, int legs, boolean endangered) {
        super(name, color, legs, endangered);
    }

    public void eat(){
        System.out.println(getName() + " love to eat fish!");
    }

    public void sound(){
        System.out.println("Eie-eeee-eeeeeeeeeeeheee is the sound " + getName() + " makes.");
    }

    @Override
    public void sleep(){
        System.out.println(getName() + " gets little to no sleep");
    }
}
