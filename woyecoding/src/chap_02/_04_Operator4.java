package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        // ||(파이프라인 2개) 아래 세개 중 하나라도 참이면 결과는 참. : Or 연산
        System.out.println(김치찌개 || 계란말이 || 제육볶음); // true
        // && 아래 세개 중 모두 참이면 참. : And 연산
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // false

        System.out.println((5 > 3) && (3 > 1)); // 두 식이 모두 true 여야 true. 둘 중 하나라도 틀리면 false

        //System.out.println(1 < 3 < 5); // 불가능한 코드

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
    }
}
