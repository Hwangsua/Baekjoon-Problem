package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb10872 {
	public static void main(String[] args) throws IOException{
		
		// System.in.read => 1byte만 10진수로 저장 => 10 입력시 49(1 10진수)로 저장
		// n의 조건이 (0 <= n && n <= 12) 이므로 두자리의 수를 입력받기 위해 BufferedReader를 사용   
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print(factorial(n));
	}
	
	static int factorial(int value) {
		if(value < 2) {
			return 1;
		}
		return value*factorial(value-1);
	}
}
