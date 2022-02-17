package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Pb2164_01 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cmdNum = Integer.parseInt(br.readLine());
		
		Queue<Integer> pbQueue = new LinkedList<Integer>();
		
		for(int i=0; i<cmdNum; i++) {
			pbQueue.add(i+1);
		}
		
		while(pbQueue.size()>1) {
			pbQueue.remove();
			pbQueue.add(pbQueue.remove());
		}
		System.out.print(pbQueue.peek());
		
		br.close();
	
	}
}
