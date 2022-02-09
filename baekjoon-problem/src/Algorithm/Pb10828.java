package Algorithm;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Stack{
	
	private int[] stackArr;
	private int top;
	
	Stack(int totalCmdNum){
		stackArr = new int[totalCmdNum];
		top = -1;
	}
	
	void push(int value) {
		stackArr[++top] = value; 
	}
	
	int pop() {

		if(top < 0) {
			return -1;
		}
		int value = stackArr[top];
		stackArr[top--] = 0;
		return value;
		
	}
	int size() {
		
		return top+1;
	}
	int empty() {
		
		if(top < 0) {
			return 1;
		}
		return 0;
	}
	int top() {
		
		if(top < 0){
			return -1;
		}
		return stackArr[top];
		
	}
}

public class Pb10828 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cmdNum = Integer.parseInt(br.readLine());
		Stack pbStack = new Stack(cmdNum);
		String cmd[];
		
		while(cmdNum-- > 0) {
			cmd = br.readLine().split(" ");
			
			switch(cmd[0]) {
				case "push":
					pbStack.push(Integer.parseInt(cmd[1]));
					break;
				case "pop":
					sb.append(pbStack.pop()).append("\n");
					break;
				case "size":
					sb.append(pbStack.size()).append("\n");
					break;
				case "empty":
					sb.append(pbStack.empty()).append("\n");
					break;
				case "top":
					sb.append(pbStack.top()).append("\n");
					break;
			}
		
			
		}
		
		System.out.print(sb.toString());
		br.close();
		
	}

}
