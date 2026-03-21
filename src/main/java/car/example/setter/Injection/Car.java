package car.example.setter.Injection;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void details(){
        System.out.println("Car Details : "+ specification.toString());
    }
}
