package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int ParkingFee = 4000;
        int MaxFee = 30000;
        int UseHour = 10;
        int TotalFee = ParkingFee * UseHour;
        int Type = 3; // 1 : 일반, 2 : 경차, 3 : 장애인차량

        switch (Type){
            case 1:
                if (TotalFee < MaxFee)
                System.out.println("차종 : 일반차량, 이용 시간 : " + UseHour + "시간, 총 요금 : " + TotalFee + "원 입니다.");
                else
                    System.out.println("차종 : 일반차량, 이용 시간 : " + UseHour + "시간, 총 요금 : 30000원 입니다.");
                break;
            case 2:
            case 3:
                if (TotalFee < MaxFee)
                    System.out.println("차종 : 경차, 이용 시간 : " + UseHour + "시간, 총 요금 : " + Math.round(TotalFee*0.5) + "원 입니다.");
                else
                    System.out.println("차종 : 장애인차량, 이용 시간 : " + UseHour + "시간, 총 요금 : 15000원 입니다.");
                break;
        }
    }
}
