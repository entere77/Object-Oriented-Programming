import java.util.ArrayList;

public class ListCon {
    private String s;
    private char[] sep;
    public ArrayList<String> strList;
    private char[] chArr;
    private String w="";

    public ListCon(String s, char[] sep){
        this.s = s;
        this.sep = sep;
        chArr = s.toCharArray();
        strList = new ArrayList<String>();
    }

    public ArrayList<String> addList(){
        for(char ch : chArr){
            for(int i=0; i<10; i++){
                if(ch == sep[i] ){
                    if(!w.equals("")){
                        strList.add(w);
                    }
                    w="";
                    break;
                }
                else{
                    if(i==9){
                        if(ch >= 'A' && ch<= 'Z')   //만약에 대문자라면, 소문자로 바꿔주는 작업
                            ch = (char) ('a' +(int)ch - (int) 'A');
                        w += ch;
                    }
                }
            }
        }
        return strList;
    }

    //리스트에 있는 문자열을 화면에 출력하는 메소드
    public void printList(){
        for (Object o : strList) {
            System.out.println(o);
        }
    }
}