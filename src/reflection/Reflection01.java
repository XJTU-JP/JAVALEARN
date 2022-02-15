package reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Reflection01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(".\\src\\reflection\\re.properties"));
        String classfullpath = properties.getProperty("classfullpath");
        String method = properties.getProperty("method");
        System.out.println(classfullpath + "    " + method);

        //加载类
        Class<?> aClass = Class.forName(classfullpath);
        //通过类 加载实例
        Object o = aClass.newInstance();
        System.out.println("获取到的类" + o.getClass().getName());

        //加载方法
        Method method1 = aClass.getMethod(method);
        method1.invoke(o);

        //加载属性
        Field name = aClass.getField("name");
        System.out.println(name.get(o));

        //加载无参构造器
        Constructor<?> constructor = aClass.getConstructor();
        System.out.println(constructor);

        //加载有参构造器
        Constructor<?> constructor1 = aClass.getConstructor(String.class);
        System.out.println(constructor1);

    }
}
