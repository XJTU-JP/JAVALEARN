package designpatterns;

import java.util.Scanner;

public class NO2_1 {
    public static void main(String[] args) {
        double price = 0;
        double num = 0;
        double total = 0;
        Scanner scanner = new Scanner(System.in);


        while (true){
            price = Double.parseDouble(scanner.next());
            num = Double.parseDouble(scanner.next());

            double totalPrice = price * num;
            total += totalPrice;
            System.out.println("单价 " + price + " 数量 " + num + "合计" + total);
        }
    }


}

abstract class CashSuper{
    public abstract double acceptCash(double money);
}

class CashNormal extends CashSuper{
    @Override
    public double acceptCash(double money) {
        return money;
    }
}

class CashRebate extends CashSuper{
    private double moneyRebate = 1;

    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}

class CashReturn extends CashSuper{
    private double moneyCondition = 0;
    private double moneyReturn = 0;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition)
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        return result;
    }
}

class CashFactory{
    public static CashSuper createCashAccept(String type){
        CashSuper cs = null;

        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300减100":
                cs = new CashReturn("300","100");
                break;
            case "打8折":
                cs = new CashRebate("0.8");
        }
        return cs;
    }
}

class CashContext{
    CashSuper cs = null;

    public CashContext(String type) {
        switch (type){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300减100":
                cs = new CashReturn("300","100");
                break;
            case "打8折":
                cs = new CashRebate("0.8");
        }
    }

    public double GetResult(double money){
        return cs.acceptCash(money);
    }
}