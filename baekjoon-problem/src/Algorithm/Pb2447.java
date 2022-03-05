package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Pb2447 {
	
	static char[][] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		arr = new char[n][n];
		
		for(int i=0; i<n; i++) {
			Arrays.fill(arr[i], ' ');
		}
		
		repeat(n, 0, 0);
		
		for(int i=0; i<n; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void repeat(int n, int row, int col) {
		
		if(n==1) {
			arr[row][col] = '*';
			return;
		}
		
		int size = n/3;

		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(i==1 && j==1) {
					continue;
				}
				repeat(size, row+(size*i), col+(size*j));
			}
		}
		
	}
}
