package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Pb2164_02 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int point = 1;
		int cmdNum = Integer.parseInt(br.readLine()); // 5
		
		ArrayList<Integer> pbQueue = new ArrayList<Integer>();
		
		while(point < cmdNum) {
			point <<= 1; // 2, 4, 8
		}
		
		if(point == cmdNum) // 8 == 5(0101)
			System.out.print(cmdNum);
		else
			System.out.print((cmdNum<<1) - point); // 10(1010) - 8 => 2
		
		br.close();
	
	}
}
