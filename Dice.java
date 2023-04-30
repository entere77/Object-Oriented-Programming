import java.util.Scanner;

public class Dice {
    int roll(){
        int number_of_Dice = (int) Math.floor(Math.random() * 6) + 1;
        return number_of_Dice;
    }

    void Dice_Number_Show(int number_of_Dice){
        System.out.printf("%d\n",number_of_Dice);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice();
        System.out.println("주사위를 몇 번 던져서 합계를 구할 것인지 입력하세요.");
        int n = sc.nextInt();
        int sum_dice_number = 0;
        for(int i = 0; i<n; i++){
            int number_of_Dice = dice.roll();
            dice.Dice_Number_Show(number_of_Dice);
            sum_dice_number += number_of_Dice;
        }

        if(sum_dice_number%2==0){
            System.out.printf("횟수: %d\n",n);
            System.out.printf("합계: %d\n",sum_dice_number);
            System.out.println("짝수가 나왔으므로 버스를 탑니다.");
        }

        else{
            System.out.printf("횟수: %d\n",n);
            System.out.printf("합계: %d\n",sum_dice_number);
            System.out.println("홀수가 나왔으므로 지하철을 탑니다.");
        }


    }
}
