package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Pb9093_02 {
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cmdNum = Integer.parseInt(br.readLine());
	
		while(cmdNum-->0) {
			String cmd = br.readLine();
			StringBuffer stringBuffer = new StringBuffer(cmd);
			String[] castArr = stringBuffer.reverse().toString().split(" ");
			
			for(int i=castArr.length-1; i >= 0; i--) {
				sb.append(castArr[i]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		
	}
	
	
}
