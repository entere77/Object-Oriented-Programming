import java.util.HashMap;
import java.util.Map;

class count{
    public Map<String, Integer> countDigitsAndLetters(String s) {
        char[] chArr = s.toCharArray();
        Map<String, Integer> m = new HashMap<String, Integer>();
        for(char ch : chArr){
            if(Character.isDigit(ch)){
                if(m.containsKey("DIGITS")){
                    int n = m.get("DIGITS");
                    m.put("DIGITS",n+1);
                }
                else {
                    m.put("DIGITS", 1);
                }
            }

            else if(Character.isLetter(ch)){
                if(m.containsKey("LETTERS")){
                    int n = m.get("LETTERS");
                    m.put("LETTERS",n+1);
                }
                else {
                    m.put("LETTERS", 1);
                }
            }

            else{
                if(m.containsKey("LETTERS")){
                    int n = m.get("LETTERS");
                    m.put("LETTERS",n+1);
                }
                else {
                    m.put("LETTERS", 1);
                }
            }
        }

        return m;
    }
}