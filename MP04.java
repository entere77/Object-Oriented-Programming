import java.util.Scanner;

public class MP04 {
    public static void main(String args[]){
        System.out.println("다음 문장에서 문자열을 바꾸는 프로그램입니다.");
        System.out.println("원본 문장 : Let's meet in my office at 10");
        System.out.println("문장에서 바꾸고 싶은 문자열을 입력하세요 :");
        Scanner changeStr = new Scanner(System.in);
        String line = changeStr.nextLine();
        String str = "Let's meet in my office at 10";
        int lineStart = str.indexOf(line);
        int lineEnd = str.indexOf(line)+line.length();
        String s1 = str.substring(0,lineStart);
        String s2 = str.substring(lineEnd);
        System.out.println("새로운 문자열을 입력하세요 :");
        Scanner wantline = new Scanner(System.in);
        String wantStr = wantline.nextLine();
        String newStr = s1+wantStr+s2;
        System.out.printf("새로운 문장: %s",newStr);
    }
}
