import java.util.Scanner;

public class Comfortablesleep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("快適に寝よう");
        System.out.println("周期を設定 数字を入力してください...");
        System.out.println("1:90分(標準)　合わなかった場合は以降の数字で設定 2:80分 3:100分 4:110分");

        int cycle_input = scan.nextInt();
        int cycle = 0;
        switch (cycle_input){
            case 1:
                System.out.println("90分で設定");
                cycle = 90;
                break;
            case 2:
                System.out.println("80分で設定");
                cycle = 80;
                break;
            case 3:
                System.out.println("100分で設定");
                cycle = 100;
                break;
            case 4:
                System.out.println("110分で設定");
                cycle = 110;
                break;
        }

        int set_hour;
        int set_minute;
        int set_hour_end;
        int set_minute_end;
        while(true){
            System.out.println("寝る時間を設定(時　分)");
            set_hour = scan.nextInt();
            set_minute = scan.nextInt();
            if(set_hour <= 24 || set_minute <= 60){
                break;
            }else{
                System.out.println("エラー：もう一度設定してください");
            }
        }while(true){
            System.out.println("起きる目標の時間を設定してください");
            set_hour_end = scan.nextInt();
            set_minute_end = scan.nextInt();
            if(set_hour_end <= 24 || set_minute_end <= 60){
                break;
            }else{
                System.out.println("エラー：もう一度設定してください");
            }
        }
        System.out.println("起きる際に最適な時間をリストアップします...");
        System.out.println("");
        int hour=set_hour,minute=set_minute;

        while(hour < set_hour_end || minute < set_minute_end){
            minute += cycle;
            if(hour >= 24){
                hour -= 24;
                hour++;
            }
            while(minute >= 60) {
                minute -= 60;
                hour++;
            }

            System.out.println(hour + "時" + minute + "分");
        }
        System.out.println("");
        System.out.println("Good Night!");
    }
}
