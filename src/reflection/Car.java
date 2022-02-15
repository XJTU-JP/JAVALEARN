package reflection;

public class Car {
    public String name = "BMW";

    public int age = 10;

    public void f1(){
        System.out.println("f1");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
