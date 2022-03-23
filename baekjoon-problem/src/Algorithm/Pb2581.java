package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb2581 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[n+1];
		int sum=0, min=0;
		
		arr[0] = arr[1] = true;
		
		for(int i=2; i*i<=n; i++) {
			for(int j=i*i; j<=n; j+=i) {
				if(!arr[j]) arr[j] = true;
			}
		}
		
		for(int i=m; i<=n; i++) {
			if(!arr[i]) {
				sum += i;
				if(min == 0) min = i;
				
			}
		}
		
		if(sum == 0) {
			System.out.print("-1");
		}else {
			System.out.println(sum);
			System.out.print(min);
		}
	}
}
