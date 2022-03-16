package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pb3009 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] cmd;
		int[] xArr = new int[3];
		int[] yArr = new int[3];
		int x,y;
		
		for(int i=0; i<3; i++) {
			cmd = br.readLine().split(" ");
			xArr[i] = Integer.parseInt(cmd[0]);
			yArr[i] = Integer.parseInt(cmd[1]);
		}
		
		if(xArr[0]==xArr[1]) {
			x = xArr[2];
		}else if(xArr[1]==xArr[2]) {
			x = xArr[0];
		}else {
			x = xArr[1];
		}
		
		if(yArr[0]==yArr[1]) {
			y = yArr[2];
		}else if(yArr[1]==yArr[2]) {
			y = yArr[0];
		}else {
			y = yArr[1];
		}
		
		bw.write(String.valueOf(x));
		bw.write(String.valueOf(" "));
		bw.write(String.valueOf(y));
		
		bw.flush();
		bw.close();
		br.close();

	}
}
