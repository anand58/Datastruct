package FactoryMethod;

public class PetFactoryTest {

    public static void main(String[] args) {
        PetFactory factory = new PetFactory();
        Pet p = factory.getPet("Bow Bow");
        System.out.println(p.petType());

        p = factory.getPet("Meaw");
        System.out.println(p.petType());
    }

}
