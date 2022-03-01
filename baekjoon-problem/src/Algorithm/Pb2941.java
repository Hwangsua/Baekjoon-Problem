package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb2941 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] cmdArr = br.readLine().toCharArray();
		int index = 0, count = 0;

		while(true) {
			
			switch (cmdArr[index]) {
			case 'c':
				if(index < cmdArr.length-1 && (cmdArr[index+1] == '=' || cmdArr[index+1]== '-')) index+=1;
				break;
			case 'd':
				if(index < cmdArr.length-2 && cmdArr[index+1]== 'z' && cmdArr[index+2]=='=') index+=2;
				else if(index < cmdArr.length-1 && cmdArr[index+1]=='-') index+=1;
				break;
			case 'l': case 'n':
				if(index < cmdArr.length-1 && cmdArr[index+1]=='j') index+=1;
				break;
			case 's': case 'z':
				if(index < cmdArr.length-1 && cmdArr[index+1]=='=') index+=1;
				break;
		
			}
			
			count++;
			index++;
			
			if(cmdArr.length <= index) break;
		}
		System.out.print(count);
	}
}
