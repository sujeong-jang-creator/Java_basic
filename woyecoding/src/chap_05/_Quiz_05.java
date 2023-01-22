package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int SizeTable[] = new int[10];
        int ShoesSize = 250;
        for (int i = 0; i < SizeTable.length; i++) {
            SizeTable[i] = ShoesSize;
            System.out.println("사이즈 " + ShoesSize + " (재고 있음)");
            ShoesSize += 5;
        }
    }
}
