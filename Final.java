import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Final {
    public static void main(String[] args){
        String s = "Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible. It is intended to let application developers write once, run anywhere (WORA),[17] meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.[18] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but it has fewer low-level facilities than either of them. As of 2019, Java was one of the most popular programming languages in use according to GitHub,[19][20] particularly for client-server web applications, with a reported 9 million developers.[21]\nJava was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle) and released in 1995 as a core component of Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GNU General Public License. Meanwhile, others have developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets).\nThe latest versions are Java 14, released in March 2020, and Java 11, a currently supported long-term support (LTS) version, released on September 25, 2018; Oracle released for the legacy Java 8 LTS the last free public update in January 2019 for commercial use, while it will otherwise still support Java 8 with public updates for personal use up to at least December 2020. Oracle (and others) highly recommend uninstalling older versions of Java because of serious risks due to unresolved security issues.[22] Since Java 9, 10, 12 and 13 are no longer supported, Oracle advises its users to immediately transition to the latest version (currently Java 14) or an LTS release.\nJDK14, JDK14, JDK13, JDK14 ";
        char[] sep = {' ', '.', ',', '\t', '\n', '-', '(', ')', '[', ']'};
        String[] stop = {"a","the", "to", "as", "of", "on", "with", "by", "for", "in"};

        Scanner sc = new Scanner(System.in);
        System.out.println("몇 회 이상 나타난 단어를 출력할지 입력하세요: ");
        int num = sc.nextInt();     //횟수 입력 받기.

        Map<String, Integer> m = new HashMap<String, Integer>();
        Count c = new Count(s,sep,stop,num);    //횟수까지 생성자로 넘겨준다.
        c.addList();   //자식 클래스의 객체를 이용해서 부모 클래스의 addList()함수를 호출하여 리스트를 채운다.
        m = c.Freq();   //Freq()함수를 호출하여 단어들의 Key값과 Value값을 가지는 m을 반환 받는다.
        c.print(m); //출력함수를 호출한다.
    }
}