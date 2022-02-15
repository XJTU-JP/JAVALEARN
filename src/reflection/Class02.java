package reflection;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath = "reflection.Car";

        Class<?> cls = Class.forName(classAllPath);

        //显示类型
        System.out.println(cls);
        //运行类型
        System.out.println(cls.getClass());
        //包名
        System.out.println(cls.getPackage().getName());
        //类名
        System.out.println(cls.getName());
        //创建对象实例
        Object o = cls.newInstance();
        System.out.println(o);
        System.out.println("-------------------------------");
        //反射获取属性 不能获取私有属性
        Field name = cls.getField("name");
        System.out.println(name.get(o));
        name.set(o,"奥迪");
        System.out.println(name.get(o));
        System.out.println("-------------------------------");
        //反射获取所有属性
        Field[] fields = cls.getFields();
        for(Field f:fields){
            System.out.println(f.get(o));
        }
        System.out.println("-------------------------------");

    }
}
