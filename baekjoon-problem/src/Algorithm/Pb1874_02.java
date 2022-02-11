package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pb1874_02 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int value = 0, temp = 0, top = -1;
		
		int[] stack = new int[n];
		
		for(int i=0; i<n; i++) {
			
			value = Integer.parseInt(br.readLine());
			
			while(value > temp) {
				stack[++top] = ++temp;
				sb.append("+\n");
			}
			
			if(stack[top] != value) {
				sb.setLength(0);
				sb.append("NO");
				break;
			}else {
				stack[top--] = 0;
				sb.append("-\n");
			}
			
		}

		System.out.print(sb.toString());
		br.close();
		
	}
}
