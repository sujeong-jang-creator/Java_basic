package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        for (int i = 0; i < 10 ; i++){
            System.out.println(i);
        }

        // 짝수만 출력 (for i 만 적고 엔터)
        for (int i = 0; i < 10; i += 2){
            System.out.print(i);
        }
        System.out.println("\n");

        // 홀수만 출력
        for (int i = 1; i < 10; i += 2){
            System.out.print(i);
        }
        System.out.println("\n");

        // 거꾸로 숫자
        for (int i = 5; i > 0; --i){
            System.out.println(i);
        }
        System.out.println("\n");

        // 1부터 10까지의 수들의 합
        // 1+2+...+10=55
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
            System.out.println("현재까지 총 합은 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총 합은 " + sum + "입니다.");
    }
}
