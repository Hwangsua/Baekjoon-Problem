package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pb10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cmdNum = Integer.parseInt(br.readLine());
		int value, sum = 0;
		Stack<Integer> pbStack = new Stack<>();
		
		while(cmdNum-- > 0) {
			value = Integer.parseInt(br.readLine());
			if(value == 0 && !pbStack.isEmpty()) {
				pbStack.pop();
			}else {
				pbStack.push(value);
			}
		}
		
		while(!pbStack.isEmpty()) {
			sum += pbStack.pop();
		}
		System.out.print(sum);
	}
}
