public class TasmanianTiger extends Animal{

    public TasmanianTiger(String name, String color, int legs, boolean endangered) {
        super(name, color, legs, endangered);
    }

    public void eat(){
        System.out.println(getName() + " love to eat meat!");
    }

    public void sound(){
        System.out.println("rawwwwwwwwr is the sound " + getName() + " makes.");
    }
}
