package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Pb1158 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] cmd = br.readLine().split(" ");
		int n = Integer.parseInt(cmd[0]);
		int k = Integer.parseInt(cmd[1]);
		int count = 0, index = 0;
	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			arr.add(i+1);
		}

		bw.write("<");
		while(arr.size() > 1) {
			if(count == k-1) {
				bw.write(String.valueOf(arr.remove(index)));
				bw.write(", ");
				count = 0;
			}else {
				count++;
				index++;
			}
		
			if(index > arr.size()-1) {
				index = 0;
			}
		}
		
		bw.write(String.valueOf(arr.remove(0)));
		bw.write(">");
		br.close();
		bw.flush();
		bw.close();
		
	}
}
