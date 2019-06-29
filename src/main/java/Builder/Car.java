package Builder;

public class Car implements CarPlan{
    String wheels;
    String base;
    String engine;

    @Override
    public void setWheels(String wheels) {
        this.wheels = wheels;

    }

    @Override
    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }
}
