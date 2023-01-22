package chap_06;

public class _05_Overloading {
    public static int getPowerStr(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPowerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static int getPowerByExp(String strNumber, String strExponent){
        int number = Integer.parseInt(strNumber);
        int exponent = Integer.parseInt(strExponent);
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getPowerStr("3"));
        System.out.println(getPowerByExp(3, 3));
        System.out.println(getPowerByExp("2", "2"));
    }
}
