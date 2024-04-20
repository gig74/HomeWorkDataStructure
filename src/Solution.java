import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length; i++) {
            stack.push(s[i]);
        }
        for (int i = 0 ; i < s.length; i++) {
            s[i] = stack.pop();
        }

    }
    public void test() {
        char[] sample1 = new char[] {'h','e','l','l','o'};
        reverseString(sample1);
        System.out.println(Arrays.toString(sample1));
        char[] sample2 = new char[] {'H','a','n','n','a','h'};
        reverseString(sample2);
        System.out.println(Arrays.toString(sample2));
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        solution.test();
    }
}
