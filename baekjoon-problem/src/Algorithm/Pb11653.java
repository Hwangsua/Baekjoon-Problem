package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pb11653 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int num = 2;
		
		while(n > 1) {
			while(n%num==0) {
				bw.write(String.valueOf(num));
				bw.write("\n");
				n/=num;
			}
			num++;
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
