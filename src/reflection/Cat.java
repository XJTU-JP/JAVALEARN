package reflection;

public class Cat {
    public String name = "mimi";

    public Cat(String name) {
        this.name = name;
        System.out.println("启动有参构造器");
    }
    public Cat() {
        System.out.println("启动无参构造器");
    }

    public void hi(){
        //System.out.print("CAT : hi");
    }

    public void hello(){
        //System.out.print("CAT : hello");
    }

}
