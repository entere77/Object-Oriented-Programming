import java.util.Scanner;

enum Card{
    CJONE_SAMSUNG(30,1),CJONE_SHINHAN(30,1),THE_CJ(20,2),SAMSUNG_6_V4(20,0),SHINHAN_LADY(20,0),
    KB_STAR(20,0),EMART_KB(15,0);

    int dis_rate;
    int acc_rate;

    Card(int dis_rate,int acc_rate){
        this.dis_rate = dis_rate;
        this.acc_rate = acc_rate;
    }
    int getDis_rate(){
        return dis_rate;
    }
    int getAcc_rate(){
        return acc_rate;
    }
}

public class MP07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("카드 이름을 입력하세요 : ");
        String card_name = sc.nextLine();
        switch(card_name){
            case "CJ ONE 삼성 카드":
                System.out.printf("할인율: %d , 적립률: %d ",Card.CJONE_SAMSUNG.getDis_rate(),Card.CJONE_SAMSUNG.getAcc_rate());
                break;
            case "CJ ONE 신한 카드":
                System.out.printf("할인율: %d , 적립률: %d ",Card.CJONE_SHINHAN.getDis_rate(),Card.CJONE_SHINHAN.getAcc_rate());
                break;
            case "The CJ":
                System.out.printf("할인율: %d , 적립률: %d ",Card.THE_CJ.getDis_rate(),Card.THE_CJ.getAcc_rate());
                break;
            case "삼성 6 V4":
                System.out.printf("할인율: %d , 적립률: %d ",Card.SAMSUNG_6_V4.getDis_rate(),Card.SAMSUNG_6_V4.getAcc_rate());
                break;
            case "신한 Lady":
                System.out.printf("할인율: %d , 적립률: %d ",Card.SHINHAN_LADY.getDis_rate(),Card.SHINHAN_LADY.getAcc_rate());
                break;
            case "KB Star":
                System.out.printf("할인율: %d , 적립률: %d ",Card.KB_STAR.getDis_rate(),Card.KB_STAR.getAcc_rate());
                break;
            case "이마트 KB":
                System.out.printf("할인율: %d , 적립률: %d ",Card.EMART_KB.getDis_rate(),Card.EMART_KB.getAcc_rate());
                break;
            default:
                System.out.println("카드 이름을 다시 입력하세요");
        }
    }
}
