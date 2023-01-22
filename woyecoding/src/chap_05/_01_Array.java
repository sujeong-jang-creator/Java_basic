package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        // 배열 선언 첫 번째 방법
        // String[] coffees = new String[4];

        // 두 번째 방법
        // String coffees[] = new String[4];
//        coffees[0] = "아메리카노"; // 0부터 시작
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 세 번째 방법
//        String[] coffees = new String[]{"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 네 번째 방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 커피 주문
        System.out.println(coffees[0] + " 하나"); // 아메리카노 하나
        System.out.println(coffees[1] + " 하나"); // 아메리카노 하나
        System.out.println("-------------------");

        // 이렇게도 되겠네.
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

    }
}
