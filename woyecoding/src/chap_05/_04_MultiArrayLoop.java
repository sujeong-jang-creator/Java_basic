package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");
        // 세로 크기 10 X 가로 크기 15 에 해당하는 영화관 좌석
        String[][] seats2 = new String[10][15];
        String[] eng = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < seats2.length; i++) { // 세로
            for (int j = 0; j < seats2[i].length; j++) { // 가로
                seats2[i][j] = eng[i] + (j + 1);
            }
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
