package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb1085 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] cmdArr = br.readLine().split(" ");
		int x = Integer.parseInt(cmdArr[0]);
		int y = Integer.parseInt(cmdArr[1]);
		int w = Integer.parseInt(cmdArr[2]);
		int h = Integer.parseInt(cmdArr[3]);
		
		int minW = w-x < x ? w-x : x;
		int minH = h-y < y ? h-y : y;
		
		System.out.print(minW < minH ? minW : minH );
		
		
	}
}
