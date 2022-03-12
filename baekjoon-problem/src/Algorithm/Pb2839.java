package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb2839 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int total = -1;
		int tempN = 0;
		int tempTotal = 0;
		
		for(int i=n/5; i>-1; i--) {
			tempN = n;
			tempN -= i*5;
			if(tempN%3 == 0) {
				total = i + tempN/3;
				System.out.print(total);
				return;
			}
		}
		System.out.print(-1);
		
//		for(int i=n/5; i>-1; i--) {
//			tempN = n;
//			tempN -= i*5;
//			if(tempN%3 == 0) {
//				tempTotal = i + tempN/3;
//				if(total == -1 || tempTotal < total) {
//					total = tempTotal;
//				}
//			}
//		}
//		
//		System.out.println(total);
		
		
	}
}
