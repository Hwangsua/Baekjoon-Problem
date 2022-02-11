package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pb1874_01 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		int value = 0, temp = 0;
		
		for(int i=1; i<=n; i++) {
			
			value = Integer.parseInt(br.readLine());
			 
			while(value > temp) {
				stack.push(++temp);
				sb.append("+\n");
			}
			
			if(stack.peek()!=value) {
				sb.setLength(0);
				sb.append("NO");
				break;
			}else {
				stack.pop();
				sb.append("-\n");
			}
			
		}

		System.out.print(sb.toString());
		br.close();
		
	}
}
