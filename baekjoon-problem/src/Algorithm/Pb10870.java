package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb10870 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] sumArr = new int[n+1];
		
		for(int i=0; i<sumArr.length; i++) {
			if(i<2) {
				sumArr[i] = i;
				continue;
			}
			sumArr[i] = sumArr[i-1] + sumArr[i-2];
		}
		System.out.print(sumArr[n]);
		
	}
}
