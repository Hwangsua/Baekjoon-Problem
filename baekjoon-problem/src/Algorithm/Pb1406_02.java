package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pb1406_02 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		Stack<Character> leftCursor = new Stack<>();
		Stack<Character> rightCursor = new Stack<>();
		
		char[] cmdString = br.readLine().toCharArray();
		
		for(char c : cmdString) {
			leftCursor.push(c);
		}
		
		int cmdNum = Integer.parseInt(br.readLine());
		String cmd;
		char cmdChar;
				
		while(cmdNum-- >0) {
			cmd = br.readLine();
			cmdChar = cmd.charAt(0);
			
			switch(cmdChar) {
			case 'L':
				if(leftCursor.isEmpty()) {
					break;
				}
				rightCursor.push(leftCursor.pop());
				break;
			case 'D':
				if(rightCursor.isEmpty()) {
					break;
				}
				leftCursor.push(rightCursor.pop());
				break;
			case 'B':
				if(leftCursor.isEmpty()) {
					break;
				}
				leftCursor.pop();
				break;
			case 'P':
				leftCursor.push(cmd.charAt(2));
				break;
			
			}
			
		}
		
		while(!leftCursor.isEmpty()) {
			rightCursor.push(leftCursor.pop());
		}
		
		while(!rightCursor.isEmpty()) {
			sb.append(rightCursor.pop());
		}
		
		System.out.print(sb.toString());
		
		br.close();
	}
}
