package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb1712 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] cmdArr = br.readLine().split(" ");
		int a = Integer.parseInt(cmdArr[0]); // 고정비용
		int b = Integer.parseInt(cmdArr[1]); // 가변비용(인건비, 재료비 등)
		int c = Integer.parseInt(cmdArr[2]); // 노트북 가격

		if(b > c) {
			System.out.print(-1);
		}else {
			System.out.print(a/(c-b)+1);
		}else {
			System.out.print(-1);
		}
		
		
	}
}
