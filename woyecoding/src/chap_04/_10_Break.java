package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
        // 손님이 50명 대기

        System.out.println("--- #1 ---");
        // For 문
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            if (i <= max){
                System.out.println(i + "번째 손님 치킨 1마리 나왔습니다.");
            } else {
                System.out.println(i + "번째 손님 죄송합니다. 금일 준비한 치킨이 모두 소진되었습니다.");
                break;
            }
        }

        System.out.println("--- #2 ---");
        // While 문
        int index = 1; // 손님 대기번호
        while (index <= 20){
            System.out.println(index + "번째 손님 치킨 1마리 나왔습니다.");
            index++;
        }
        System.out.println(index + "번째 손님 죄송합니다. 금일 준비한 치킨이 모두 소진되었습니다.");
    }
}
