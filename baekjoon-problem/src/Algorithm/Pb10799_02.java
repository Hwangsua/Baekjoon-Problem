package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Pb10799_02 {
	
	static final char OPEN = '(';
	static final char CLOSE = ')';
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] cmdArr = br.readLine().toCharArray();
		ArrayList<Character> bracketStack = new ArrayList<Character>();
		int sum = 0;
		
		for(int i=0; i<cmdArr.length; i++) {
			if(cmdArr[i] == CLOSE) {
				bracketStack.remove(bracketStack.size()-1);
				if(cmdArr[i-1] == OPEN) {
					sum += bracketStack.size();
				}else {
					sum++;
				}
				
				continue;
			}
			
			bracketStack.add(OPEN);
			
		}
		
		System.out.print(sum);
	}
}
