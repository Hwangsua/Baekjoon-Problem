package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pb1002 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		String[] cmdArr;
		int x1, y1, r1, x2, y2, r2;
		int subR, sumR;
		double d;
		int cnt = -1;
	
		while(num-->0) {
			cmdArr = br.readLine().split(" ");
			x1 = Integer.parseInt(cmdArr[0]);
			y1 = Integer.parseInt(cmdArr[1]);
			r1 = Integer.parseInt(cmdArr[2]);
			x2 = Integer.parseInt(cmdArr[3]);
			y2 = Integer.parseInt(cmdArr[4]);
			r2 = Integer.parseInt(cmdArr[5]);
			
			d = Math.sqrt(Math.pow(Math.abs(x1-x2), 2)+Math.pow(Math.abs(y1-y2), 2));
			
			subR = Math.abs(r1-r2);
			sumR = Math.abs(r1+r2);
					
			if(x1 == x2 && y1 == y2 && r1 == r2) cnt = -1;
			else if(subR < d && d < sumR) cnt = 2;
			else if(subR == d || sumR == d) cnt = 1;
			else cnt = 0;
			
			bw.write(String.valueOf(cnt));
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
