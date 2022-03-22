package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pb4948 {
	
	static final int MAX = 123456*2;
	static boolean[] primeArr = new boolean[MAX+1]; 
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		primeArr[0] = primeArr[1] = true;
		
		for(int i=2; i*i<=MAX; i++) {
			if(!primeArr[i]) {
				for(int j=i*i; j<=MAX; j+=i) {
					primeArr[j] = true;
				}
			}
		}
		
		while(true) {
			int value = Integer.parseInt(br.readLine());
			if(value == 0) break;
			int cnt = 0;
			
			for(int i=value+1; i<=2*value; i++) {
	
				if(!primeArr[i]) cnt++;
					
			}
			bw.write(String.valueOf(cnt));
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
