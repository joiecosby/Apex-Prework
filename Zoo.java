import java.util.ArrayList;

public class Zoo {

    private String zooName;
    private String cityAddress;
    private int noOfExhibits;
    private int time;
    private ArrayList<Animal> animals = new ArrayList<Animal>(); //does this need to go in the second <>

    public Zoo(String zooName, String cityAddress, int noOfExhibits, int time) {
        this.zooName = zooName;
        this.cityAddress = cityAddress;
        this.noOfExhibits = noOfExhibits;
        this.time = time;
    }

    public void zooInfo(){
        System.out.println("\n" + "Welcome to " + zooName + "! We are located in " + cityAddress + " where we have " + noOfExhibits + " number of exhibits." + "\n");
    }

    public String getZooName() {
        return zooName;
    }

    public String getAddress() {
        return cityAddress;
    }

    public int getNoOfExhibits() {
        return noOfExhibits;
    }

    public int getTime() {
        return time;
    }


    public void addAnimal(Animal a){
        animals.add(a);
        for(int i = 0; i < animals.size(); i++){
            a = animals.get(i);
        }
        System.out.println("This Animal has been added to the zoo: "+ a + ". Here is the full list of animals: " + animals);
    }

//    public void removeAnimal(int position){
//        Animal removedAnimal = animals.get(position);
//        animals.remove(position);
//        System.out.println(removedAnimal + " was removed from the zoo. Here is the list of animals left:  " + animals);
//    }

    public void removeAnimal(int position){
        Animal removedAnimal = animals.get(position);
        animals.remove(position);
        System.out.println(removedAnimal + " was removed from the zoo. Here is the list of animals left:  " + animals);
    }

    public void removeAnimal(Animal a){
        animals.remove(a);
        System.out.println(a + " was removed from the zoo. Here is the list of animals left:  " + animals);
    }

//    public void removeAnimal2(Animal a){
//        animals.remove(a);
//        System.out.println(a + " is being removed from the zoo.");
//        for(int i = 0; i < animals.size(); i++){
//            a = animals.get(i);
//        }
//        System.out.println("Here is the current list after an animal was removed: " + animals + "\n");
//    }


    public void findAnimal(Animal searchAnimal){
        int position = animals.indexOf(searchAnimal);
        if(position >= 0){
            System.out.println("We have " + searchAnimal + " here at our zoo! At position: " + position );
        }else{
            System.out.println("Sorry, we don't have " + searchAnimal + " at this zoo");
        }
    }
}