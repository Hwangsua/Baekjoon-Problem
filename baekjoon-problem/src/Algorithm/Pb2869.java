package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb2869 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] cmd = br.readLine().split(" ");
		
		int a = Integer.parseInt(cmd[0]);
		int b = Integer.parseInt(cmd[1]);
		int v = Integer.parseInt(cmd[2]);
		int date = (v-b)/(a-b);
		
		if((v-b)%(a-b) != 0) {
			date++;
		}
		
		System.out.print(date);
		
//	1. 시간 초과..
//		boolean flag = false; // false : 아침, true : 밤
//		
//		while(v > 0) {
//			
//			if(!flag) {
//				v-=a;
//				flag = true;
//				continue;
//			}
//			v+=b;
//			date++;
//			flag = false;
//		}
//		
//		System.out.print(date);
		
	}
}
