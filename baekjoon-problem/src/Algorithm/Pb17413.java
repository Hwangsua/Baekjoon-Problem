package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Pb17413 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Character> pbStack = new Stack<Character>();
		
		char[] cmdChar = br.readLine().toCharArray();
		boolean flag = false;
		
		for(char c : cmdChar) {
			
			if(c == ' ') {
				while(!pbStack.isEmpty()) {
					bw.write(pbStack.pop());
				}
				bw.write(c);
				continue;
			}
			
			if(c == '<') {
				flag = true;
				while(!pbStack.isEmpty()) {
					bw.write(pbStack.pop());
				}
			}
			
			if(flag) {
				bw.write(c);
				if(c == '>') {
					flag = false;
				}
			}else {
				pbStack.push(c);
			}
			
			
		}
		
		while(!pbStack.isEmpty()) {
			bw.write(pbStack.pop());
		}
		
		bw.flush();
		bw.close();
		br.close();
	
		
	}
}
