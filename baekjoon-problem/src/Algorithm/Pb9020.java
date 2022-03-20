package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

// 틀린 코드 => 두 소수의 차이가 작은 것을 출력하지 못한다.
/*
 <input>
 3
 8
 10
 16
 <output>
 5 3
 7 3
 13 3
*/

public class Pb9020 {
	
	static final int MAX = 10000;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[MAX+1];
		LinkedList<Integer> decList = new LinkedList<Integer>();
		int value, sum, sub, a, b;
		
		for(int i=2; i<=MAX; i++) {
			arr[i] = i;
		}
		
		for(int i=2; i<=MAX; i++) {
			if(arr[i] == 0) continue;
			
			for(int j=2*i; j<=MAX; j+=i) {
				arr[j] = 0;
			}
		}
		
		
		for(int i=2; i<=MAX; i++) {
			if(arr[i] != 0) {
				decList.add(arr[i]);
			}
		}
		
		while(num-->0) {
			System.out.println("====="+num+"=======");
			value = Integer.parseInt(br.readLine());
			System.out.println("value:"+value);
			
			sub = value;
			a = 0;
			b = 0;
			
			for(int i=0; i < decList.size(); i++) {
				sum = 0;
				sum += decList.get(i);
			
				for(int j=0; j < decList.size(); j++) {
				
					if(sum+decList.get(j) == value && sub > Math.abs(i-j)) {
							System.out.println("("+i+","+j+")");
							a = i; 
							b = j;
					}
				}
			}
			
			bw.write(String.valueOf(decList.get(a)));
			bw.write(" ");
			bw.write(String.valueOf(decList.get(b)));
			bw.write("\n");
			
			
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
