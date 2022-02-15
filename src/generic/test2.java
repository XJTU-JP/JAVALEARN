package generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class test2 {
    public static void main(String[] args) {

        System.out.println(new Employee2() instanceof Employee);

        long start1 = System.currentTimeMillis();



        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list.add(new Employee("tom",0,new MyDate(1995,8,1)));
        list.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list.add(new Employee("tom",0,new MyDate(1995,8,1)));
        list.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list.add(new Employee("tom",0,new MyDate(1995,8,1)));
        list.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list.add(new Employee("tom",0,new MyDate(1995,8,1)));


        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                if(!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }else {
                    if(o1.getBrithday().getYear() != o2.getBrithday().getYear()){
                        return o1.getBrithday().getYear() - o2.getBrithday().getYear();
                    }else {
                        if(o1.getBrithday().getMonth() != o2.getBrithday().getYear()){
                            return o1.getBrithday().getMonth() - o2.getBrithday().getMonth();
                        }else{
                            if(o1.getBrithday().getDay() != o2.getBrithday().getDay()){
                                return o1.getBrithday().getDay() - o2.getBrithday().getDay();
                            }
                        }
                    }
                }
                return 1;

            }
        });


        long end1 = System.currentTimeMillis();
        System.out.println("程序运行时间："+(end1-start1)+"ms");




        long start2 = System.currentTimeMillis();
        /*运行的程序主体*/

        ArrayList<Employee> list2 = new ArrayList<>();
        list2.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list2.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list2.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list2.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list2.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list2.add(new Employee("tom",0,new MyDate(1995,8,1)));
        list2.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list2.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list2.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list2.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list2.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list2.add(new Employee("tom",0,new MyDate(1995,8,1)));
        list2.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list2.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list2.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list2.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list2.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list2.add(new Employee("tom",0,new MyDate(1995,8,1)));
        list2.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list2.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list2.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list2.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list2.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list2.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list2.add(new Employee("tom",0,new MyDate(1995,8,1)));

        list2.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                int c1 = o1.getName().compareTo(o2.getName());
                if(c1 != 0){
                    return c1;
                }

                int c2 = o1.getBrithday().getYear() - o2.getBrithday().getYear();
                if(c2 != 0){
                    return c2;
                }

                int c3 = o1.getBrithday().getMonth() - o2.getBrithday().getMonth();
                if(c3 != 0){
                    return c3;
                }

                int c4 = o1.getBrithday().getDay() - o2.getBrithday().getDay();
                if(c4 != 0){
                    return c4;
                }

                return 0;


            }
        });


        long end2 = System.currentTimeMillis();
        System.out.println("程序运行时间："+(end2-start2)+"ms");






        long start3 = System.currentTimeMillis();
        ArrayList<Employee> list3 = new ArrayList<>();
        list3.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list3.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list3.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list3.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list3.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list3.add(new Employee("tom",0,new MyDate(1995,8,1)));
        list3.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list3.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list3.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list3.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list3.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list3.add(new Employee("tom",0,new MyDate(1995,8,1)));
        list3.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list3.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list3.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list3.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list3.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list3.add(new Employee("tom",0,new MyDate(1995,8,1)));
        list3.add(new Employee("tom",0,new MyDate(1997,6,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,7,1)));
        list3.add(new Employee("tom",0,new MyDate(1997,4,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,9,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,8,1)));
        list3.add(new Employee("tom",0,new MyDate(1996,10,1)));
        list3.add(new Employee("tom",0,new MyDate(1996,10,2)));
        list3.add(new Employee("tom",0,new MyDate(1997,3,1)));
        list3.add(new Employee("tom",0,new MyDate(1998,3,1)));
        list3.add(new Employee("tom",0,new MyDate(1995,8,1)));

        list3.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                int c1 = o1.getName().compareTo(o2.getName());
                if(c1 != 0){
                    return c1;
                }

                int c2 = o1.getBrithday().compareTo(o2.getBrithday());
                if(c2 != 0){
                    return c2;
                }

                return 0;

            }
        });

        for(Employee e : list2){
            System.out.println(e);
        }

        long end3 = System.currentTimeMillis();
        System.out.println("程序运行时间："+(end3-start3)+"ms");
    }
}

class Employee{
    private String name;
    private int sal;
    private MyDate brithday;

    public Employee() {

    }

    public Employee(String name, int sal, MyDate brithday) {
        this.name = name;
        this.sal = sal;
        this.brithday = brithday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBrithday() {
        return brithday;
    }

    public void setBrithday(MyDate brithday) {
        this.brithday = brithday;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", brithday=" + brithday +
                '}';
    }

}

class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public int compareTo(MyDate o) {
        int c2 = year - o.getYear();
        if(c2 != 0){
            return c2;
        }

        int c3 = month - o.getMonth();
        if(c3 != 0){
            return c3;
        }

        int c4 = day - o.getDay();
        if(c4 != 0){
            return c4;
        }

        return 0;
    }
}

class Employee2 extends Employee{
    public Employee2() {
        super();
    }
}