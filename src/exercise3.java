import java.sql.SQLOutput;

class Calculator{
    int value;
    Calculator(){
        this.value=0;
    }

    void add(int val){
        this.value += val;
    }

    int getValue(){
        return this.value;
    }

    boolean isOdd(int num){
        return num %2==1;
//        if(num%2==0)
//            return false;
//        else return true;
    }
}

class UpgradeCalculator extends Calculator{
    void minus(int val){
        this.value -= val;
    }
}

class MaxLimitCalculator extends Calculator{
    void add(int val){
        this.value += val;
        if(this.value>100){
            this.value = 100;
        }
    }
}

public class exercise3 {
    public static void main(String[] args) {
        //Q1 UpgradeCalculator
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());

        //Q2 MaxLimitCalculator
        MaxLimitCalculator maxcal = new MaxLimitCalculator();
        maxcal.add(50);
        maxcal.add(60);
        System.out.println(maxcal.getValue());

        //Q3 홀수 짝수 판별하기
        Calculator bcal = new Calculator();
        System.out.println(bcal.isOdd(3));
        System.out.println(bcal.isOdd(4));
    }




}
