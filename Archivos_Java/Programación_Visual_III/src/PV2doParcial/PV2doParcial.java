package PV2doParcial;

import java.util.Stack;

/**
 *
 * @author Axel Ordoñez
 */
public class PV2doParcial {

    public static void main(String[] args) {
        String array[] = {"({){}({()}", "{(){((())}", "{({()()}})", "{()()}{()}"};
        Boolean correcto;
        Stack<Character> stack = new Stack<Character>();
        char c;
        int i;
        for (String key : array) {
            correcto = true;
            for (i = 0; i < key.length(); i++) {
                c = key.charAt(i);
                if (c == '(') {
                    stack.push(c);
                } else if (c == '{') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.empty()) {
                        correcto = false;
                    } else if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        correcto = false;
                    }
                } else if (c == '}') {
                    if (stack.empty()) {
                        correcto = false;
                    } else if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        correcto = false;
                    }
                }
            }
            System.out.print(key);
            System.out.println(", Corrrecto: " + correcto);
            stack.empty();
        }
    }
}
