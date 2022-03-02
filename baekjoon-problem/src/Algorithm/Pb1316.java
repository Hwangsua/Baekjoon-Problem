package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb1316 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cmdNum = Integer.parseInt(br.readLine());
		String cmd;
		char[] cmdArr;
		int[] countArr;
		int prevCh;
		boolean check;
		int count = 0;
		
		while(cmdNum-->0) {
			cmd = br.readLine();
			cmdArr = cmd.toCharArray();
			countArr = new int[26];
			prevCh = 0;
			check = true;
			
			for(int i=0; i<cmdArr.length; i++) {
				int ch = cmdArr[i];
				
				if(prevCh != ch)
				{
					if(countArr[ch - 'a'] == 0){
						countArr[ch - 'a']++;
						prevCh = ch;
					}else {
						check = false;
					}
				}
			}
			
			if(check) count++;
		}
		
		System.out.print(count);
	}
}
