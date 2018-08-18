package chapter18;

import java.awt.*;

public class HelloWorld {
    public static void main(String [] args){
        int n1 = 10;
        int n2 = 5;

        Calculable f1  = LambdaDemo.add();
        LambdaDemo d = new LambdaDemo();
        Calculable f2 = d.sub();

        System.out.println(f1.calculateInt(n1,n2));

        System.out.println(f2.calculateInt(n1,n2));




    }

    public static Calculable calculable(char opr) {

        Calculable result;

        if (opr == '+') {
            result = (a, b) -> {
                return a + b;
            };
        }else if (opr == '-'){
            result = ( a, b) -> {
                return a - b;
            };
        }else {
            result = (a, b) ->{
                return  a * b;
            };
        }
        return result;
    }

    public static void display(Calculable calc, int n1, int n2 ){
        System.out.println(calc.calculateInt(n1, n2));
    }
}
