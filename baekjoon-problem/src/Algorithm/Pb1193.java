package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb1193 {
	public static void main(String[] args) throws IOException{
		StringBuilder sb = new StringBuilder();
		int x = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int d = 1, n = 1; // 분자 d, 분모 n
		int cnt = 1;
		boolean flag = false; 
		
		
		while(cnt++ < x) {
			
			if(!flag) { //분모 증가 방향
				if(d == 1) {//분자가 1일때
					n++;
					flag = true;
				}else {
					d--;
					n++;
				}
				
				
			}else {//분자 증가 증가 
				
				if(n == 1) { //분모가 1일때
					d++;
					flag = false;
				}else {
					d++;
					n--;
				}
			}
			
		}
		
		System.out.print(sb.append(d).append("/").append(n));
	}
}
