package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb3053 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		
		System.out.printf("%.6f\n",r*r*Math.PI);
		System.out.printf("%.6f",(double)r*r*2); // 택시 기하학 => 반지름 x 반지름 x 2 = 원의 넓이
	}
}
