package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb2292 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int honeycomb = 1, cnt = 1;
		
		while(n > honeycomb) {
			honeycomb += 6*cnt; // 1 => (+6)7 => (+12)19 => (+18)37 => ... 
			cnt++;
		}
		
		System.out.print(cnt);
		
	}
}
