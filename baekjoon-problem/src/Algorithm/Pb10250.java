package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pb10250 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cmdNum = Integer.parseInt(br.readLine());
		int h, w, n;
		int y, x; // y : 층, x : 호
		String[] cmdArr;
		
		while(cmdNum-->0) {
			cmdArr = br.readLine().split(" ");
			h = Integer.parseInt(cmdArr[0]);
			w = Integer.parseInt(cmdArr[1]);
			n = Integer.parseInt(cmdArr[2]);
			
			if(h == 1) { // 1층일 때
				y = 1;
				x = n;
			}else if(n % h == 0) { // 꼭대기 층
				y = h;
				x = n/h;
			}else {
				y = n%h;
				x = n/h +1;
			}
			
			bw.write(String.valueOf(y*100+x));
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
