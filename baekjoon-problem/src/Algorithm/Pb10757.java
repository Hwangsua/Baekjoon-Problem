package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Pb10757 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] cmd = br.readLine().split(" ");
		
		// 틀린 코드
		int[] a = new int[cmd[0].length()+1];
		int[] b = new int[cmd[1].length()+1];
		int maxLength = cmd[0].length() > cmd[1].length() ? cmd[0].length() : cmd[1].length();
		int minLength = cmd[0].length() < cmd[1].length() ? cmd[0].length() : cmd[1].length();
		int value = 0;		
		
		for(int i=cmd[0].length()-1, index = 0; i>=0; i--,index++) {
			a[index] = cmd[0].charAt(i)-'0';
		}
		
		for(int i=cmd[1].length()-1, index = 0; i>=0; i--,index++) {
			b[index] = cmd[1].charAt(i)-'0';
		}
		
		for(int i=0; i<minLength; i++) {
			value = a[i]+b[i];
			a[i] = value%10;
			a[i+1] = a[i+1] + value/10;
		}
		
		if(a[maxLength]!=0) {
			System.out.print(a[maxLength]);
		}
		
		for(int i = a.length-2; i >=0; i--) {
			System.out.print(a[i]);
		}
		
//	1. long으로 불가능 => java BigInteger 사용
//		BigInteger a = new BigInteger(cmd[0]);
//		BigInteger b = new BigInteger(cmd[1]);
//		
//		a = a.add(b);
//		System.out.print(a.toString());
	}
}
