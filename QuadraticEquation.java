import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double sqrt = b*b-4*a*c;
        if(sqrt<0)
        {
            System.out.println("다시 입력해주세요.");
        }
        else{
            double result1 = (-b+Math.sqrt(sqrt))/2*a;
            double result2 = (-b-Math.sqrt(sqrt))/2*a;
            System.out.println("구하고자 하는 해는: "+result1+"와 "+result2+"입니다.");
        }
    }
}
