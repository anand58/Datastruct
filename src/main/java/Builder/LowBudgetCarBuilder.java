package Builder;

public class LowBudgetCarBuilder implements CarBuilder{
    Car car;
    public LowBudgetCarBuilder(){
        car = new Car();
    }


    @Override
    public void buildWheels() {
        car.setWheels("Low budget wheels");
    }

    @Override
    public void buildBase() {
        car.setBase("low budget base");
    }

    @Override
    public void buildEngine() {
        car.setEngine("low budget engine");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
