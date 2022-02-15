package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        new Reflection02().f1();
        new Reflection02().f2();
        new Reflection02().f3();
    }

    //普通方法
    public void f1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            cat.hi();

        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法 " + (end - start));
    }
    //反射方案
    public void f2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflection.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            hi.invoke(o);

        }
        long end = System.currentTimeMillis();
        System.out.println("反射方法 " + (end - start));
    }

    //反射调优 关闭访问检查
    public void f3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflection.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        //在调用hi方法的时候关闭检查
        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            hi.invoke(o);

        }
        long end = System.currentTimeMillis();
        System.out.println("关闭反射检查 反射方法 " + (end - start));
    }

}
