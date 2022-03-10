package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pb2775 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cmdNum = Integer.parseInt(br.readLine());
		int k, n; // k : 층, n : 호
		int[][] total;
		
		while(cmdNum-->0) {
			
			k = Integer.parseInt(br.readLine()); //층 
			n = Integer.parseInt(br.readLine()); //호
			total = new int[k+1][n];
			
			for(int j=1; j<=n; j++) { // 0층 인원
				total[0][j-1] = j;
			}
			
			for(int i=1; i<=k; i++) { // 1층부터 k층까지의 인원
				int sum = 0;
				for(int j=1; j<=n; j++) {
					sum += total[i-1][j-1];
					total[i][j-1] += sum;
				}
			}
			bw.write(String.valueOf(total[k][n-1]));
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
