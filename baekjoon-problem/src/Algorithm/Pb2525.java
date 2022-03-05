package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Pb2525 {
	public static void main(String[] args) throws IOException{
// 01. 160ms
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] cmd = br.readLine().split(" ");
//		int hour = Integer.parseInt(cmd[0]);
//		int min = Integer.parseInt(cmd[1]);
//		int cookingTime = Integer.parseInt(br.readLine());
//		
//		hour += cookingTime/60;
//		min += cookingTime%60;
//		
//		if(min>=60) {
//			hour += min/60;
//			min = min%60;
//		}
//		
//		if(hour >= 24) {
//			hour -= 24;
//		}
//		
//		System.out.print(hour+" "+min);
		
// 02. 156ms		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		int hour = Integer.parseInt(st.nextToken());
//		int min = Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());
//		
//		if(min>=60) {
//			hour += min/60;
//			min = min%60;
//		}
//		
//		if(hour >= 24) {
//			hour -= 24;
//		}
//		
//		System.out.print(hour+" "+min);

// 03. 124ms	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken()) + Integer.parseInt(br.readLine());
		
		if(min>=60) {
			hour += min/60;
		}
		
		hour %= 24;
		min %= 60;
		sb.append(hour).append(" ").append(min);
		System.out.print(sb);
		
	}
}
