package designpatterns;

public class NO1_2 {
    public static void main(String[] args) {
        Operation2 op = Operation2Factory.createOperate("/");
        op.setA(1);
        op.setB(0);
        System.out.println(op.result());
    }
}

class Operation2{
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double result(){
        double res = 0;
        return res;
    }
}

class Operation2Add extends Operation2{
    @Override
    public double result() {
        return this.getA() + this.getB();
    }
}

class Operation2Sub extends Operation2{
    @Override
    public double result() {
        return this.getA() - this.getB();
    }
}

class Operation2Mul extends Operation2{
    @Override
    public double result() {
        return this.getA() * this.getB();
    }
}

class Operation2Div extends Operation2{
    @Override
    public double result() {
        if (this.getB() == 0){
            throw new ArithmeticException();
        }
        return this.getA() / this.getB();
    }
}

class Operation2Factory{
    public static Operation2 createOperate(String operate){
        Operation2 op = null;

        switch (operate){
            case "+":
                return new Operation2Add();
            case "-":
                return new Operation2Sub();
            case "*":
                return new Operation2Mul();
            case "/":
                return new Operation2Div();
        }

        throw new NoSuchOperationException("没有该操作数");
    }
}
