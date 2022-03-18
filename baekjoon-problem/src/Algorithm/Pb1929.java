package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pb1929 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] cmd = br.readLine().split(" ");
		int m = Integer.parseInt(cmd[0]);
		int n = Integer.parseInt(cmd[1]);
		int num[] = new int[1000001];
		
		
		// 2.에라토스테네스의 체 알고리즘
		for(int i=2; i<=n; i++) {
			num[i] = i;
		}
		
		for(int i=2; i<=n; i++) {
			if(num[i]==0) continue;
			
			for(int j=2*i; j<=n; j+=i) {
				num[j] = 0;
			}
		}
		
		for(int i=m; i<=n; i++) {
			if(num[i]!=0) {
				bw.write(String.valueOf(i));
				bw.write("\n");
			}
		}
		
		// 1. 시간 초과!
//		boolean check = true;
//		
//		for(int i=m; i<=n; i++) {
//			check = true;
//			
//			for(int j=2; j<i; j++) {
//				
//				if(i%j==0) {
//					check = false;
//					continue;
//				}
//			}
//			
//			if(check) {
//				bw.write(String.valueOf(i));
//				bw.write("\n");
//			}
//			
//		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
