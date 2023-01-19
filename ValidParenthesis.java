import java.util.Stack;

public class ValidParenthesis {
	public static boolean isValid(String s) {
		Stack<Character> testStack = new Stack<>();
		
		for (int i = 0 ; i < s.length() ; i++) {
			switch(s.charAt(i)) {
				case '[':
				case '(':
				case '{':
					testStack.push(s.charAt(i));
					break;
				case ']':
					if (testStack.isEmpty() || testStack.pop() != '[') return false;
					break;
				case ')':
					if (testStack.isEmpty() || testStack.pop() != '(') return false;
					break;
				case '}':
					if (testStack.isEmpty() || testStack.pop() != '{') return false;
					break;
			}
			
		}
		return testStack.isEmpty();
	}
	public static void main(String args[]) {
		System.out.println(isValid("){"));
	}
}
