package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

class Deque{
	
	ArrayList<Integer> dequeArr;
	
	Deque(){
		dequeArr = new ArrayList<Integer>();
	}
	
	void push_front(int value){
		dequeArr.add(0, value);
	}
	
	void push_back(int value) {
		dequeArr.add(value);
	}
	
	int pop_front() {
		return dequeArr.isEmpty() ? -1 : dequeArr.remove(0);
	}
	
	int pop_back() {
		return dequeArr.isEmpty() ? -1 : dequeArr.remove(dequeArr.size()-1);
	}
	
	int size() {
		return dequeArr.size();
	}
	
	int empty() {
		return dequeArr.isEmpty() ? 1 : 0;
	}
	
	int front() {
		return dequeArr.isEmpty() ? -1 : dequeArr.get(0);
	}
	
	int back() {
		return dequeArr.isEmpty() ? -1 : dequeArr.get(dequeArr.size()-1);
	}
	
	String toStringCheck() {
		return dequeArr.toString();
	}
}

public class Pb10866 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cmdNum = Integer.parseInt(br.readLine());
		String[] cmd;
		Deque pbDeque = new Deque();
		
		while(cmdNum-- > 0) {
			
			cmd = br.readLine().split(" ");
	
			switch(cmd[0]) {
			case "push_front":
				pbDeque.push_front(Integer.parseInt(cmd[1]));
				break;
			case "push_back":
				pbDeque.push_back(Integer.parseInt(cmd[1]));
				break;
			case "pop_front":
				bw.write(String.valueOf(pbDeque.pop_front()));
				bw.write("\n");
				break;
			case "pop_back":
				bw.write(String.valueOf(pbDeque.pop_back()));
				bw.write("\n");
				break;
			case "size":
				bw.write(String.valueOf(pbDeque.size()));
				bw.write("\n");
				break;
			case "empty":
				bw.write(String.valueOf(pbDeque.empty()));
				bw.write("\n");
				break;
			case "front":
				bw.write(String.valueOf(pbDeque.front()));
				bw.write("\n");
				break;
			case "back":
				bw.write(String.valueOf(pbDeque.back()));
				bw.write("\n");
				break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
}
