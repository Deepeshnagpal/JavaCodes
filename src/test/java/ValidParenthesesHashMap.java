import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesesHashMap {
    public static void main(String[] args) {
        System.out.println(isValid("([}}])"));
    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for(Character c: s.toCharArray()){
            if(map.keySet().contains(c)){
                stack.push(c);
            }
            else if(map.values().contains(c)){
                if(!stack.isEmpty() && map.get(stack.peek())==c){
                    stack.pop();
                }
            }
        }
        return  stack.isEmpty();
    }
}
