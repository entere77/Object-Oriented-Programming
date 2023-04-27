import java.util.Scanner;

public class Hash {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char[] ch;
    ch = new char[5];
    double hash;
    int n = ch.length;
    System.out.println("문자 다섯 개를 한 줄에 한 개씩 입력하세요.");
    ch[0] = sc.next().charAt(0);
    ch[1] = sc.next().charAt(0);
    ch[2] = sc.next().charAt(0);
    ch[3] = sc.next().charAt(0);
    ch[4] = sc.next().charAt(0);
    hash = ch[0] * Math.pow(31,n-1) + ch[1] * Math.pow(31,n-2) + ch[2] * Math.pow(31,n-3) + ch[3] * Math.pow(31,n-4) + ch[4] *Math.pow(31,n-5);
    System.out.printf("문자열 %c%c%c%c%c의 해시 값은 %.2f입니다.",ch[0],ch[1],ch[2],ch[3],ch[4],hash);
    }
}
