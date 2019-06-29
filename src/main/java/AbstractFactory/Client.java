package AbstractFactory;

public class Client {
    public Car car;

    public static void main(String[] args) {
        Client cl = new Client();
        Car car = cl.getCar("Audi");
        System.out.println(car.getWheels().getSpecification());
        System.out.println(car.getTyres().getSpecification());
        System.out.println(car.getEngine().getSpecification());
    }

    public Car getCar(String carType){
        if(carType.equals("BMW")){
            return new BMW();
        }
        if(carType.equals("Audi")){
            return new Audi();
        }
        return null;
    }

}
