package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] wordArr = br.readLine().toCharArray();
		int[] alphabetArr = new int[26];
		int mostCount = -1;
		char mostUsedAlphabet = '?';
		
		for(char c : wordArr) {
			if('a'<= c && c<='z') {
				alphabetArr[(int) Character.toUpperCase(c)-'A']++;
			}else {
				alphabetArr[(int) c-'A']++;
			}
		}
		
		for(int i=0; i<alphabetArr.length; i++) {
			System.out.print(alphabetArr[i]+",");
			if(alphabetArr[i] > mostCount) {
				mostCount = alphabetArr[i];
				mostUsedAlphabet = (char) (65+i);
				continue;
			}
			
			if(alphabetArr[i] == mostCount) {
				mostUsedAlphabet = '?';
			}
		}

		System.out.print(mostUsedAlphabet);
		
		
	}
}
