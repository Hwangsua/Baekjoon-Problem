package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb1978 {
	
	static final int MAX = 1000;
	static boolean[] arr = new boolean[MAX+1];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] cmdArr = br.readLine().split(" ");
		int sum = 0;
		
		arr[0] = arr[1] = true;
		
		for(int i=2; i*i<=MAX; i++) {
			for(int j=i*i; j<=MAX; j+=i) {
				if(!arr[j]) arr[j] = true;
			}
		}
		
		
		for(int i=0; i<num; i++) {
			if(!arr[Integer.parseInt(cmdArr[i])]) sum++;
		}
		
		System.out.print(sum);
		
	}
}
