package generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test {

    public static void main(String[] args) {

        HashMap<String, Student> map = new HashMap<>();

        map.put("tom",new Student("tom",12));
        map.put("jack",new Student("jack",15));

        Set<Map.Entry<String, Student>> entries = map.entrySet();

        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}

class Student{

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


