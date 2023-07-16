package Stack;
// https://leetcode.com/problems/evaluate-reverse-polish-notation/

import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class ReversePolishNotation {

    public static int solve(String[] tokens) {
        List<Integer> stack = new ArrayList<>();

        for (String t : tokens) {
            // t.matches("\\d*");
            char c = t.charAt(t.length() - 1);
            if ((int) c <= 57 && (int) c >= 48) {
                stack.add(Integer.parseInt(t));
            } else {
                int top = stack.size() - 1;
                int right = stack.remove(top);
                int left = stack.remove(top - 1);

                switch (t) {
                    case "+":
                        stack.add(left + right);
                        break;
                    case "-":
                        stack.add(left - right);
                        break;
                    case "*":
                        stack.add(left * right);
                        break;
                    case "/":
                        stack.add(left / right);
                        break;
                }
            }
            // try {

            // } catch (NumberFormatException e) {

            // }
        }

        return stack.get(0);
    }

    public static void main(String[] args) {
        String[] pols = new String[] { "4", "13", "5", "/", "+" };
        System.out.println(solve(pols));
    }
}
