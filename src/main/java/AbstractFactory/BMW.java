package AbstractFactory;

public class BMW extends Car{

    @Override
    Parts getWheels() {
        return new Parts("BMW wheels");
    }

    @Override
    Parts getTyres() {
        return new Parts("BMW tyres");
    }

    @Override
    Parts getEngine() {
        return new Parts("BMW engine");
    }
}
