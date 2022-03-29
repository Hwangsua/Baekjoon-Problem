package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Pb2751_02 {

	static boolean[] arr = new boolean[2000002]; 
	
	//2. 836ms
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
	
		
		for(int i=0; i<n; i++) {
			arr[Integer.parseInt(br.readLine())+1000000] = true;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]) {
				bw.write(String.valueOf(i-1000000));
				bw.write("\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
