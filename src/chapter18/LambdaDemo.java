package chapter18;

public class LambdaDemo {

    private int value = 10;
    private static int staticValue = 5;

    public static Calculable add() {

        Calculable result = (int a, int b) -> {
            staticValue ++ ;
            int c = a + b + staticValue;
            System.out.println("staticValue:" + staticValue);
            return  c;
        };

        return  result;
    }

    public Calculable sub() {

        Calculable result = (int a, int b) -> {
            staticValue++ ;
            this.value++;
            int c = a - b - staticValue - this.value;
            System.out.println("value:" + value + "\tstaticValue: "+ staticValue);
            return c;
        };
        return  result;
    }


}
