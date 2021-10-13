import java.util.ArrayList;

public class Dog {
    private String name;
    private boolean isHungry;
    private Owner owner;
    private ArrayList<Dog> offSpring;

    public Dog(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
        offSpring = new ArrayList<>();
    }

    public String getDogName() {
        return name;
    }

    public void setOwner(String ownerName) {
        owner = new Owner(ownerName);
    }

    public void setOffSpring(String newDogName) {
        offSpring.add(new Dog(newDogName,false));
    }

    public ArrayList<Dog> getOffSpring() {
        return offSpring;
    }

    public String getSpecificOffSpring(int index){
        return offSpring.get(index).name;
    }

    public String getOwner() {
        return owner.getName();
    }

    public String feedDog() {

        if(isHungry == true){
            isHungry = false;
            return "Feeding dog. munch munch";
        }
        else return "Dog is already fed";

    }
}
