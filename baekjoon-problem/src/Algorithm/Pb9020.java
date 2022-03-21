package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Pb9020 {
	
	static final int MAX = 10000;
	static boolean[] arr = new boolean[MAX+1]; 
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		List<Integer> decList = new ArrayList<Integer>();
		
		int num = Integer.parseInt(br.readLine());
		
		arr[0] = arr[1] = true; //소수 false
		
		for(int i=2; i*i<=MAX; i++) {
			if(!arr[i]) {
				for(int j=i*i; j<=MAX; j+=i) {
					arr[j] = true;
				}
			}
		}
		
	
		// 2. 184ms
		while(num-->0) {
			int value = Integer.parseInt(br.readLine());
			int a = value/2;
			int b = value/2;
			
			while(true) {
				if(!arr[a] && !arr[b]) {
					bw.write(String.valueOf(a));
					bw.write(" ");
					bw.write(String.valueOf(b));
					bw.write("\n");
					break;
				}
				a--;
				b++;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	// 1. 2252ms
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int num = Integer.parseInt(br.readLine());
//		int[] arr = new int[MAX+1];
//		List<Integer> decList = new ArrayList<Integer>();
//		
//		for(int i=2; i<=MAX; i++) {
//			arr[i] = i;
//		}
//		
//		for(int i=2; i<=MAX; i++) {
//			if(arr[i] == 0) continue;
//			
//			for(int j=2*i; j<=MAX; j+=i) {
//				arr[j] = 0;
//			}
//		}
//		
//		
//		for(int i=2; i<=MAX; i++) {
//			if(arr[i] != 0) {
//				decList.add(arr[i]);
//			}
//		}	
//		
//		while(num-->0) {
//			int value = Integer.parseInt(br.readLine());
//			int sub = value;
//			int smallNum = 0, bigNum = 0; // 작은 수, 큰 수
//			
//			for(int i = 0; decList.get(i) <= value/2; i++) {
//				int temp = value - decList.get(i);
//				
//				if(decList.contains(temp)) {
//					int subTemp = Math.abs(temp-decList.get(i));
//					if(sub > subTemp) {
//						sub = subTemp;
//						smallNum = decList.get(i);
//						bigNum = temp;
//					}
//				}
//			
//			}
//			bw.write(String.valueOf(smallNum));
//			bw.write(" ");
//			bw.write(String.valueOf(bigNum));
//			bw.write("\n");
//		}
//		
//		bw.flush();
//		bw.close();
//		br.close();
//	}
	
}

