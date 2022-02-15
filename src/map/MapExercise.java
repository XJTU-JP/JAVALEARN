package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapExercise {

    public static void main(String[] args) {

        Map map = new HashMap();

        map.put(1,new Employee("tom",15000,1));
        map.put(2,new Employee("jack",15000,2));
        map.put(3,new Employee("lisa",20000,3));

        Set set = map.keySet();
        Set set2 = map.entrySet();
        Collection set3 = map.values();
        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);


    }

}

class Employee{

    private String name;
    private float salary;
    private int id;

    public Employee(String name, float salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
