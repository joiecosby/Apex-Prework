public abstract class Animal {

    private String name;
    private String color;
    private int legs;
    private boolean endangered;


    public Animal(String name, String color, int legs, boolean endangered) {
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.endangered = endangered;
    }

    public void sleep(){
        System.out.println(getName() + " LOVES to sleep.");
    }

    public void animalInfo(){
        eat();
        sound();
        sleep();

        if(endangered == true) {
            System.out.println(getName() + " has " + legs + " legs and is " + color + " and is endangered." + "\n");
        }else{
            System.out.println(getName() + " has " + legs + " legs and is " + color + " and isn't endangered." + "\n");
        }
    }


    public abstract void eat();
    public abstract void sound();


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
