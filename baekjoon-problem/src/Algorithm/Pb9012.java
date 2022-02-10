package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pb9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cmdNum = Integer.parseInt(br.readLine());
		char[] psArr = new char[50];
		
		
		while(cmdNum-- > 0) {
			psArr = br.readLine().toCharArray();
			
			if(psArr.length%2 != 0 || psArr[0] == ')') {
				sb.append("NO\n");
				continue;
			}
			
			Stack<Character> stack = new Stack<>();
			
			for(int i=0; i<psArr.length; i++) {
				if(psArr[i]=='(') {
					stack.push('(');
					continue;
				}
				
				if(psArr[i]==')' && !stack.isEmpty()) {
					stack.pop();
				}else {
					stack.push(')');
					break;
				}
			}
			
			if(stack.isEmpty()) {
				sb.append("YES\n");
			}else {
				sb.append("NO\n");
			}
			
			
		}
		
		System.out.print(sb.toString());
	}
}
