import java.util.Arrays;
import java.util.Stack;

public class Solution2 {
    private static final String OPEN_STAPLES = "([{" ;
    private static final String CLOSE_STAPLES = ")]}" ;
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for ( char ch : s.toCharArray()) {
          if (OPEN_STAPLES.indexOf(ch) >= 0){
              stack.push(ch);
          }
          else if(CLOSE_STAPLES.indexOf(ch) >= 0) {
              if (stack.empty()) {
                  return false;
              }
              char currentOpenStaple = (char) stack.pop();
              if (OPEN_STAPLES.indexOf(currentOpenStaple) != CLOSE_STAPLES.indexOf(ch)){
                  return false;
              }
          }
          else {
              throw new RuntimeException("I see illegal symbol");
          }
        }
        return stack.isEmpty();
    }
    public static void test() {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("(()"));

    }
    public static void main(String[] args) {
        Solution2.test();
    }
}
