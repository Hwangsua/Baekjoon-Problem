package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pb9093_01 {
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cmdNum = Integer.parseInt(br.readLine());
		Stack<Character> stack = new Stack<>();
		
		while(cmdNum-- > 0){
			String[] castArr = br.readLine().split(" ");
			
			for(String cast : castArr) {
				char[] arr = cast.toCharArray();
				for(char c : arr) {
					stack.push(c);
				}
				
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sb.append(" ");
			}
			
			
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
	}
	
	
}
