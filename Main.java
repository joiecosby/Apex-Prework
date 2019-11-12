public class Main {


    public static void main(String[] args) {

        TasmanianTiger babycub = new TasmanianTiger("Ginger", "Striped", 4, true);
        babycub.animalInfo();

        Dolphins flipper = new Dolphins("Flipper", "Gray", 0, false);
        flipper.animalInfo();

        Sloth slothy = new Sloth("Slothy", "light brown", 4, false);
        slothy.animalInfo();

        Zoo Seattle = new Zoo("Seattle Wonderful Zoo", "Seattle, WA", 5, 12);
        Seattle.zooInfo();
        Seattle.addAnimal(babycub);
        Seattle.addAnimal(flipper);
        Seattle.addAnimal(slothy);
        Seattle.findAnimal(slothy);
        Seattle.findAnimal(babycub);
        Seattle.removeAnimal(0);


        Zoo Columbus = new Zoo("Columbus Zoo and Aquarium", "Colubmus, OH", 6, 7);
        Columbus.zooInfo();
        Columbus.addAnimal(flipper);
        Columbus.addAnimal(slothy);
        Columbus.addAnimal(babycub);
        Columbus.findAnimal(flipper);
        Columbus.removeAnimal(flipper);
    }
}
