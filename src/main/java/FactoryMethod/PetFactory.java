package FactoryMethod;

public class PetFactory {

    public Pet getPet(String petType) {
        Pet pet = null;
        if (petType.equals("Bow Bow")) {
            return new Dog();

        }else if(petType.equals("Meaw")){
            return new Cat();

        }
    return null;
    }
}
