import java.util.Map;
import java.util.HashMap;

public class MP13 {
    public static void main(String[] args) {
        String s = "Sangmyung University 2020";
        count c = new count();
        Map<String, Integer> m = new HashMap<String, Integer>();
        m = c.countDigitsAndLetters(s);
        System.out.println(m);
    }
}

