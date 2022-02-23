package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class Pb17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int cmdNum = Integer.parseInt(br.readLine());
		int[] arr = new int[cmdNum];
		Stack<Integer> indexArr = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<cmdNum; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<cmdNum; i++) {
			
			while(!indexArr.isEmpty() && arr[indexArr.peek()] < arr[i]){
				arr[indexArr.pop()] = arr[i];
			}
			indexArr.add(i);
		}
		
		while(!indexArr.isEmpty()) {
			arr[indexArr.pop()] = -1; 
		}
		
		for(int value : arr) {
			sb.append(value).append(" ");
		}
		
		System.out.print(sb);
		br.close();
		
	}
}
