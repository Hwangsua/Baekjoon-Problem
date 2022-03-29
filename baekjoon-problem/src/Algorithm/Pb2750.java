package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pb2750 {
	
	// 2. 136ms 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[2002]; // 절댓값이 1000보다 작거나 같은 정수
		
		for(int i=0; i<n; i++) { 
			arr[Integer.parseInt(br.readLine())+1000] = true;
		}
		
		for(int i=0; i<2002; i++) { 
			if(arr[i]) {
				bw.write(String.valueOf(i-1000));
				bw.write("\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	// 1. 156ms
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		int n = Integer.parseInt(br.readLine());
//		int[] arr = new int[n];
//		int min = 0;
//		int temp = 0;
//		
//		for(int i=0; i<n; i++) { 
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		
//		
//		for(int i=0; i<n; i++) {
//			min = i;
//			for(int j=i+1; j<n; j++) {
//				if(arr[min] > arr[j]) {
//					min = j;
//				}
//			}
//			
//			temp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = temp;
//			
//		}
//		
//		for(int i=0; i<n; i++) { 
//			bw.write(String.valueOf(arr[i]));
//			bw.write("\n");
//		}
//		
//		bw.flush();
//		bw.close();
//		br.close();
//	}
}
