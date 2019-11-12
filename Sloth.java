public class Sloth extends Animal {

    public Sloth(String name, String color, int legs, boolean endangered) {
        super(name, color, legs, endangered);
    }

    public void eat(){
        System.out.println(getName() + " love to eat leaves!");
    }

    public void sound(){
        System.out.println("Squeak, squeak, squeak is the sound " + getName() + " makes.");
    }
}
