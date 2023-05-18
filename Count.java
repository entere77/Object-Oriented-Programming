import java.util.Map;
import java.util.HashMap;

public class Count extends ListCon {
    private String s;
    private char[] sep;
    private String[] stop;
    private int num;
    Map<String, Integer> m = new HashMap<String, Integer>();

    public Count(String s, char[] sep, String[] stop,int num) {
        super(s, sep);
        this.stop = stop;
        this.num = num; //단어 횟수
    }

    public Map<String, Integer> Freq() {
        for (int i = 0; i < super.strList.size(); i++) {
            if (m.containsKey(super.strList.get(i))) {
                int n = m.get(super.strList.get(i));
                m.put(super.strList.get(i), n + 1);
            }
            else {
                m.put(super.strList.get(i), 1);
            }
        }   //부모 클래스의 strList를 가져와 m을 채운다.

        for (String ch : stop) {
            if(m.containsKey(ch)){
                m.remove(ch);
            }
        }   //m의 Key값 중에 불용어와 같은 Key값을 가지면, 삭제한다.

        for (String key : super.strList) {
            for(int i=0; i< key.length(); i++){
                if(key.charAt(i) >= '0' && key.charAt(i) <= '9'){
                    if(i==key.length()-1){
                        m.remove(key);  //만약, 문자열의 모든 문자가 숫자이면, 삭제한다.
                    }
                }
                else{
                    break;
                }
            }
        }   //m의 Key값이 모두 숫자로 이루어져있으면, 삭제한다.
        return m;
    }

    //매개 변수로 전달되는 횟수와 같거나 더 많이 나타난 단어만을 골라서 단어와 횟수를 화면에 출력하는 메소드
    public void print(Map<String, Integer> m){
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            if(entry.getValue() >= num){
                System.out.printf("%s: %d \n",entry.getKey(),entry.getValue());
            }
        }
    }
}