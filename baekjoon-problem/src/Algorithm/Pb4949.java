package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pb4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String cmd;
		Stack<Character> pbStack = new Stack<>();
		char[] cmdCharArr;
		
		while((cmd = br.readLine()).length() > 1 || cmd.charAt(0) != '.'){
			
			cmdCharArr = cmd.toCharArray();
			
			for(char c : cmdCharArr) {
				if(c == '[' || c == '(') {
					pbStack.push(c);
				}else if(c == ']' || c == ')'){
					if(pbStack.isEmpty()) {
						pbStack.push(c);
						break;
					}
					
					if(c == ']' && pbStack.peek() == '[') {
						pbStack.pop();
					}else if(c == ')' && pbStack.peek() == '(') {
						pbStack.pop();
					}else {
						break;
					}
				}
			}
			
			if(!pbStack.isEmpty()) {
				System.out.print("no\n");
			}else {
				System.out.print("yes\n");
			}
			
			pbStack.clear();
		}
		
		br.close();
	}
}
