import java.util.Scanner;

public class VolumeOfTruncatedCone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double R1 = sc.nextDouble();
        double R2 = sc.nextDouble();
        double Height = sc.nextDouble();
        double V = 3.14*(R1*R1+R1*R2+R2*R2)*Height/3;
        System.out.println("원뿔대의 부피는 : "+V);
    }
}
