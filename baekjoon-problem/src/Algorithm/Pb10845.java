package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Queue{
	
	private int[] queueArr;
	private int frontIndex = -1;
	private int backIndex = -1;
	
	Queue(int totalCmdNum){
		queueArr = new int[totalCmdNum];
	}
	
	void push(int value) {
		
		queueArr[++backIndex] = value;
		
		if(frontIndex == -1) {
			++frontIndex;
		}
	}
	
	int pop() {
		
		if(frontIndex < 0) {
			return -1;
		}
		
		int value = queueArr[frontIndex];
		queueArr[frontIndex++] = 0;
		
		if(frontIndex > backIndex) {
			frontIndex = -1;
			backIndex = -1;
		}
		
		return value;
		
	}
	
	int size() {
		
		if(empty() == 1) {
			return 0;
		}
		
		return backIndex - frontIndex + 1;
	}
	
	int empty() {
		if(frontIndex < 0) {
			return 1;
		}
		
		return 0;
	}
	
	int front() {
		
		if(frontIndex < 0) {
			return -1;
		}
		
		return queueArr[frontIndex];
	}
	
	int back() {
		if(frontIndex < 0) {
			return -1;
		}
		
		return queueArr[backIndex]; 
	}

}

public class Pb10845 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cmdNum = Integer.parseInt(br.readLine());
		Queue pbQueue = new Queue(cmdNum);
		String[] cmd;
		
		while(cmdNum-->0) {
			cmd = br.readLine().split(" ");
			
			switch(cmd[0]) {
				case "push":
					pbQueue.push(Integer.parseInt(cmd[1]));
					break;
				case "pop":
					bw.write(String.valueOf(pbQueue.pop()));
					bw.write("\n");
					break;
				case "size":
					bw.write(String.valueOf(pbQueue.size()));
					bw.write("\n");
					break;
				case "empty":
					bw.write(String.valueOf(pbQueue.empty()));
					bw.write("\n");
					break;
				case "front":
					bw.write(String.valueOf(pbQueue.front()));
					bw.write("\n");
					break;
				case "back":
					bw.write(String.valueOf(pbQueue.back()));
					bw.write("\n");
					break;
			}
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
