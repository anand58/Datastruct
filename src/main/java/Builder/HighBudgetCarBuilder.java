package Builder;

public class HighBudgetCarBuilder implements CarBuilder{
    Car car;
    public HighBudgetCarBuilder(){
        car = new Car();
    }


    @Override
    public void buildWheels() {
        car.setWheels("High budget wheels");
    }

    @Override
    public void buildBase() {
        car.setBase("High budget base");
    }

    @Override
    public void buildEngine() {
        car.setEngine("High budget engine");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
