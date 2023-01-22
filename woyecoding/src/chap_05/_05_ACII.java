package chap_05;

public class _05_ACII {
    public static void main(String[] args) {
        // 아스키 코드 (AMSI) : 미국 표준 코드
        char c = 'A'; // 알파벳 대문자(A)는 65 부터 시작, 소문자(a)는 97 부터 시작, 숫자(0)는 48 부터 시작.
        System.out.println(c);
        System.out.println((int)c);

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] seats2 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats2.length; i++) { // 세로
            for (int j = 0; j < seats2[i].length; j++) { // 가로
                seats2[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats2.length; i++) { // 세로
            for (int j = 0; j < seats2[i].length; j++) { // 가로
                System.out.print(seats2[i][j] + " "); // A1 A2 A3 ...
            }
            System.out.println();
        }
    }
}
