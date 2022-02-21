package String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Pb2675 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cmdNum = Integer.parseInt(br.readLine());
		String[] cmd;
		char[] cmdCharArr;
	
		while(cmdNum-- > 0) {
			cmd = br.readLine().split(" ");
			cmdCharArr = cmd[1].toCharArray();
			for(char c : cmdCharArr) {
				bw.write(String.valueOf(c).repeat(Integer.valueOf(cmd[0])));
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	
	}
}
