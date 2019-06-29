package Builder;

public class MechanicalEngineer {
    CarBuilder builder;

    public MechanicalEngineer(CarBuilder builder){
        this.builder = builder;
    }

    public void buildCar(){
        builder.buildBase();
        builder.buildEngine();
        builder.buildWheels();
    }

    public Car getCar(){
        return builder.getCar();
    }

    public static void main(String[] args) {
        CarBuilder low = new HighBudgetCarBuilder();
        MechanicalEngineer mech = new MechanicalEngineer(low);
        mech.buildCar();
        Car car = mech.getCar();
        System.out.println(car.engine);
        System.out.println(car.wheels);
    }
}
