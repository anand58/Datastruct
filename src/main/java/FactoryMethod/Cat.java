package FactoryMethod;

public class Cat implements Pet{

    @Override
    public String petType() {
        return "Cat";
    }
}
