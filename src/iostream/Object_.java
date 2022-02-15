package iostream;

import org.junit.jupiter.api.Test;

import java.io.*;

public class Object_ {
    public static void main(String[] args) {}

    @Test
    public void write01() throws IOException {
        String path = ".\\file\\obj.bat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));

        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeObject(new Dog("tom",12));
    }

    @Test
    public void read01() throws IOException, ClassNotFoundException {
        String path = ".\\file\\obj.bat";

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        Object o = ois.readObject();
        Dog dog = (Dog)o;
        System.out.println(o.toString());

    }
}
class Dog implements Serializable {
    private String name;
    private int age;



    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}