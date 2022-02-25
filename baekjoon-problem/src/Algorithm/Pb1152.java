package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb1152 {
	public static void main(String[] args) throws IOException{
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		char[] cmdArr = br.readLine().toCharArray();
//		boolean flag = false;
//		int count = 0;
//		
//		for(int i=0; i<cmdArr.length; i++) {
//			if(flag && cmdArr[i] == ' ') {
//				count++;
//				flag = false;
//			}else if(cmdArr[i] != ' '){
//				flag = true;
//			}
//		}
//		
//		System.out.print(flag ? count+1 : count );
		
		int count = 0;
		int ch, preCh = 32;
		
		while(true) {
			ch = System.in.read();
			
			if(ch==32 && preCh!=32) {
				count++;
			}else if(ch==10) {
				if(preCh!=32) count++;
				break;
			}
			
			preCh = ch;
			
		}
		
		System.out.print(count);
	}
}
