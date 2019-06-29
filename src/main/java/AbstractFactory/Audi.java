package AbstractFactory;

public class Audi extends Car{
    @Override
    Parts getWheels() {
        return new Parts("Audi wheels");
    }

    @Override
    Parts getTyres() {
        return new Parts("Audi tyres");
    }

    @Override
    Parts getEngine() {
        return new Parts("Audi engine");
    }
}
