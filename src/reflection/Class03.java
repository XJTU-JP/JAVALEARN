package reflection;

public class Class03 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println("-------------------------------");
        Class<?> cls = Class.forName("reflection.Car");
        System.out.println(cls);
        System.out.println("-------------------------------");
        cls = Car.class;
        System.out.println(cls);
        System.out.println("-------------------------------");
        Car car = new Car();
        cls = car.getClass();
        System.out.println(cls);
        System.out.println("-------------------------------");
        ClassLoader classLoader = car.getClass().getClassLoader();
        cls = classLoader.loadClass("reflection.Car");
        System.out.println(cls);
    }
}
