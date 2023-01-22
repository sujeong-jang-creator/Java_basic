package chap_06;

public class _03_Return {
    // 호텔 전화번호
    // void > 반환값이 없는 것.
    public static String getPhoneNumber(){
        String phoneNumber = "010-1234-5678";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getAddress(){
        String Address = "서울시 강남구 테헤란로";
        return Address;
    }
    // 호텔 액티비티
    public static String getActivities(){
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환값, Return
        String phoneNumber = getPhoneNumber();
        System.out.println(phoneNumber);

        String Address = getAddress();
        System.out.println(Address);

        System.out.println(getActivities());
    }

}
